package ddit.chap04.sec02;

public class ForStatementExample02 {
	public static void main(String[] args) {
		new ForStatementExample02().shape1();
		System.out.println("2");
		new ForStatementExample02().shape2();
		System.out.println("3");
		new ForStatementExample02().shape3();
		System.out.println("4");
		new ForStatementExample02().shape4();
		System.out.println("5");
		new ForStatementExample02().shape5();
		System.out.println("6");
		new ForStatementExample02().shape6();
	}

	public void shape1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 4 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape4() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void shape5() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public void shape6() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
