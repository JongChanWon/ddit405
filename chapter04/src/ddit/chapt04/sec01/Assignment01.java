package ddit.chapt04.sec01;

import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		// 컴퓨터와 가위바위보 게임을하는 프로그램을 작성하시오..
		// 1. 컴퓨터는 1-3사이의 난수를 발생시킨다.
		// 2. 가위=>1, 바위=>2, 보=>3이며
		// 3. 사용자는 키보드호 1-3사이의 숫자를 입력하여 승자를 결정한다

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int count = 0;

		while (!flag) {
			int com = (int) (Math.random() * 3 + 1);
			System.out.println("1.가위 2.바위 3.보!!");
			int me = sc.nextInt();

			int 가위 = 1;
			int 바위 = 2;
			int 보 = 3;

			System.out.println("com: " + com);
			System.out.println("me: " + me + "\n");

			if (me < 4) {
				count++;
				if ((me == 가위 && com == 바위) || (me == 바위 && com == 보) || (me == 보 && com == 가위)) {
					System.out.println("졌습니다");
				} else if (com == me) {
					System.out.println("비겼습니다");
				} else {
					System.out.println("이겼습니다");
					System.out.println("시도횟수: " + count + "번 만에 이겼습니다");
					break;
				}
				System.out.println();
			} else {
				System.out.println("잘못입력하셨습니다!! 1~3까지의 숫자만 입력해주세요");
			}
		}
		sc.close();
	}
}
