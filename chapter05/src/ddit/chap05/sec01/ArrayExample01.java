package ddit.chap05.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {
	public static void main(String[] args) {
//		int[] score = { 23, 24, 25, 27, 31, 55 };
//		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//			System.out.println(sum);
//		}
//		System.out.println(sum);

		// ����1] 5���� �迭��Ҹ� ���� ������ �迭�� �����Ͻÿ�.
		// int[] num = new int[5];
		int[] num = { 35, 70, 65, 23, 90 };

		System.out.println(Arrays.toString(num)); // �迭�ȿ� ����� �� �ֳ� Ȯ���ϱ� ���� �޼���
		System.out.println(num); // �ּҰ��� �������
		// ����2] ����1���� ������ �迭�� ���� �ڷḦ �Է��Ͻÿ�. [������: 35,70,65,23,90]
//		num[0] = 35;
//		num[1] = 70;
//		num[2] = 65;
//		num[3] = 23;
//		num[4] = 90;

		for (int i = 0; i < num.length; i++) {
			System.out.print("�⺻ For��: " + num[i] + ", ");
		}
		System.out.println("num3: " + num[3]);
		System.out.println();
		for (int i : num) {
			System.out.print("���� for��: " + i + ","); // ����ȭ �Ǿ ����Ǿ��ִ� �ڷ��϶� ���
		}
		System.out.println();
		// ����3] 45���� ��Ҹ� ���� ������ �迭�� �����ϰ� 1����45���� ���ʴ�� ���� �����Ͻÿ�.
		int[] number = new int[45];

		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
		System.out.println(Arrays.toString(number));
		System.out.println(number.length);

		String[] friends = { "������", "������", "�迵��" };

		for (int i = 0; i < friends.length; i++) {
			System.out.print(friends[i] + ", ");
		}

//		����5] 3������ ������ Ű����� �Է¹޾� �迭�� �����ϰ� ������ ����� ���Ͻÿ�
		Scanner sc = new Scanner(System.in);
		int[] subject = new int[3];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < subject.length; i++) {
			int scores = Integer.parseInt(sc.nextLine());
			subject[i] = scores;
			sum += subject[i];

		}
		avg = sum / (double) subject.length;
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + avg);

//		����6] �ֻ����� 50�� ���� ���� ������ ���� Ƚ��(����� ��)�� �迭�� �����ϰ� ����Ͻÿ�
//		1�� ��� 2�� ���
		// dicebox[0]�� random��
//		int[] diceBox = new int[50];
//		int[] count = new int[6];

//		int countt = 0;
//		sum = 0;
//		for (int i = 0; i < diceBox.length; i++) {
//			int dice = (int) (Math.random() * 6 + 1);
//			diceBox[i] = dice;
//			if (diceBox[i] == dice) {
//				for (int j = 0; j < count.length; j++) {
//					count[j] = diceBox[i];
//					
//				}
//			}
//		}
//
//		System.out.println(Arrays.toString(diceBox));
//		System.out.println(Arrays.toString(count));

		int[] dice = new int[6];

		for (int i = 0; i < 50; i++) {
			int rnd = (int) (Math.random() * 6) + 1;
			dice[rnd - 1]++;
		}

		for (int i = 0; i < dice.length; i++) {
			System.out.println((i + 1) + "��: " + dice[i]);
		}

	}
}
