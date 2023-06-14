package ddit.chap05.sec03;

import java.util.Scanner;

public class LottoExample {
	public static void main(String[] args) {
		Lotto lo = new Lotto();
		// 초기화한 결과값을 l1에 넣어줌 (new Lotto();)
		// lo.suffle();
		lo.buyLotto();
	}
}

class Lotto {
	// 멤버변수: 로또 클래스가 생성될때 생기고 로또클래스가 소멸될때 같이 소멸됨
	// 메서드 밖에서 선언되어야함
	// 멤버변수 초기화 방법: =연산자, 초기화 블록, 생성자 메서드
	int[] lotto = new int[45]; // 45개의 기억공간

	Lotto() { // 생성자 메서드(객체초기화) 객체 멤버변수 초기화!!
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (i + 1);
		}
	}

	public void suffle() {
		for (int i = 0; i < 1000000; i++) {
			int rnd = (int) (Math.random() * lotto.length);
			int temp = lotto[0]; // lotto의 0번째 주소를 temp에 넣어줌
			lotto[0] = lotto[rnd];
			lotto[rnd] = temp;

		}
	}

	public void buyLotto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 액수를 1000단위로 입력: ");
		int money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < money / 1000; i++) {
			suffle();
			for (int j = 0; j < 6; j++) {
				System.out.printf("%5d", lotto[j]);
			}
			System.out.println();
		}

	}

}