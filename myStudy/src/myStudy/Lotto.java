package myStudy;

import java.util.Scanner;

public class Lotto {

}

class LottoEx {
	int[] lotto = new int[45];

	LottoEx() { // 생성자를 만들어서 초기화 시켜줌
		for (int i = 0; i < lotto.length; i++) {
			lotto[0] = lotto[i + 1];
		}
	}

	public void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int rnd = (int) (Math.random() * lotto.length);
			int temp = lotto[0];
			lotto[0] = lotto[rnd];
			lotto[rnd] = temp;
		}
	}

	public void buyLotto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 액수를 1000단위로 입력: ");

		int money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < money / 1000; i++) {
			shuffle();
			for (int j = 0; j < 6; j++) {
				System.out.printf("%5d", lotto[j]);
			}
		}
	}
}