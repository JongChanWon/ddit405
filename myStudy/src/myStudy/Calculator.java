package myStudy;

public class Calculator {
	public static void main(String[] args) {
		sum(3, 4);
		sum(20, 10);
	}

	public static void sum(int left, int right) {
		int sum = left + right;
		double avg = (double) (left + right) / 2;

		System.out.println("��: " + sum);
		System.out.println("���: " + avg);
	}
}
