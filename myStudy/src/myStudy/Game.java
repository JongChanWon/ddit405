package myStudy;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
//		do {
//
//		} while (!flag);

		while (!flag) {
			System.out.println("calculator");
			// ù��° ���� Ÿ����
			// �����ȣ
			// �ι�° ���� Ÿ����
			int firstNum = sc.nextInt();
			String operator = sc.next();
			int secondNum = sc.nextInt();

			int sum = firstNum + secondNum;
			int sum1 = firstNum - secondNum;
			int sum2 = firstNum * secondNum;
			int sum3 = firstNum / secondNum;

			switch (operator) {
			case "+":
				System.out.println(sum);

				break;
			case "-":
				System.out.println(sum1);

				break;
			case "*":
				System.out.println(sum2);

				break;
			case "/":
				System.out.println(sum3);

				break;
			default:
				System.out.println("�ٽ� �Է��� �ּ���");
				break;
			}
		}
		sc.close();
	}

}
