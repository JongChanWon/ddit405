package ddit.chapter03.sec01;

import java.util.Scanner;

public class TrinominalOperatorExample {
	public static void main(String[] args) {
		// ���� ������ (���ǽ�)? ��1 : ��2
		// ���ǽ��� ����� ���̸� ��1 ��ȯ, �����̸� ��2 ��ȯ

		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();
		char grade = (score >= 90 ? 'A' : (score >= 80 ? 'B' : (score >= 70 ? 'C' : (score >= 60 ? 'D' : 'F'))));
		System.out.println(grade);
		int a = 0b00010100;
		System.out.println(a);
	}
}
