package myStudy;

public class Test {
	public static void main(String[] args) {
		// 1. 조건문의 종류
		// if, switch case문

		// 2. O, X, O, X

		// 3. 등급은 B입니다.
		// 4. 어떤 혜택을 원하세요? 우수 회원 혜택을 받으실 수 있습니다. 감사합니다.
		// 5

		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("vvip");
		case 'B':
			System.out.println("vip");
			break;
		case 'C':
			System.out.println("우수");
		case 'D':
			System.out.println("일반");
			break;
		default:
			System.out.println("no 혜택");
		}
		System.out.println("감사");

		int i = 2;
		for (i = 2; i <= 9; i++) {

			System.out.print(i + "단\t");

		}
		System.out.println();
		for (int j = 1; j <= 9; j++) {
			for (int j2 = 2; j2 <= 9; j2++) {

				System.out.print(j2 + "*" + j + "=" + j2 * j + "\t");
			}
			System.out.println();
		}
	}
}
