package ddit.chap02.sec02;

import java.util.Random;
import java.util.Scanner;

public class TypeExample02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		example01();

//		int ch = 0;
//		try {
//			ch = System.in.read();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		while ((char) ch != 'y') {
//			System.out.println("�ݺ��۾�");
//		}
		// example02();
		example03();
	}

	public static void example01() {
		// ����1) Ű����� ���� ���ڸ� �Է� �޾� �� ���ڿ� �ش��ϴ� �����ڵ�(ASCII�ڵ�)�� ����ϴ� ���α׷�

		System.out.print("�����Է�: ");
		String scan = sc.next(); // �������� �����Ǿ����� ���ڿ��� ���
		String scan1 = sc.nextLine(); // �������� �����Ǿ����� ���ڿ��� ���

		char a = scan.charAt(0);
		// char scan1 = sc.next().charAt(0);
		System.out.println((int) a);

		int num1 = sc.nextInt();
		int num2 = Integer.parseInt(sc.nextLine());

	}

	public static void example02() {
		// ����2) Ű����� 3������ ������ �Է� �޾� ������ ����� ���Ͻÿ�. ��, ����� �Ǽ��� ����Ͻÿ�.
//		System.out.print("��������: ");
//		int sub1 = sc.nextInt();
//		System.out.print("��������: ");
//		int sub2 = sc.nextInt();
//		System.out.print("��������: ");
//		int sub3 = sc.nextInt();
//
//		int sum = sub1 + sub2 + sub3;
//		double avg = (double) sum / 3;
//
//		System.out.println("����: " + sum + "\n" + "���: " + avg);

		// Ű����� �Ǽ��ϳ��� �Է¹޾� �Ҽ��� 2�ڸ����� �ݿø��Ͻÿ�

//		double a = sc.nextDouble();
		double num = Double.parseDouble(sc.nextLine());
		System.out.println(((int) (num * 10 + 0.5)) / 10.0);
	}

	public static void example03() {
		// Math.random() => min~max������ ������ ���� - (int)(Math.random()*max)+min
		// ����3) �ֻ����� �������� ������ ���� ���� ����Ͻÿ�. =>Math class�� Random Class�� �̿�
		int i = 0;
		for (i = 0; i < 50; i++) {
			int dice = (int) (Math.random() * 6 + 1);
			System.out.println("�߻��� ��: " + dice);
		}

		System.out.println("------------------------------");

		Random rn = new Random();
		// ���� ���� (min~max)������ ����
		// int rnd = rn.nextInt(max) + min;

		for (i = 0; i < 50; i++) {
			int rnd = rn.nextInt(6) + 1;
			System.out.println("�߻��� ��1: " + rnd);
		}
	}
}