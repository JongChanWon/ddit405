package ddit.chap05.sec01;

import java.util.Arrays;

public class Assignment04 {

	public static void main(String[] args) {
//		example01();
//		example02();
		example03();
	}

	static void example01() {
//		���� 1] ���� 5���� �����ϰ� �������� �μ�    
		int[] num = { 23, 33, 45, 12, 31 };
		for (int i = 4; 0 <= i && i <= num.length - 1; i--) {
			System.out.print(num[i] + " ");
		}
	}

	static void example02() {
//		���� 2] ����� 10���� ���� �� �ִ밪�� �ּҰ��� ���Ͻÿ�
		int[] num = { 33, 12, 83, 14, 25, 36, 37, 91, 39, 40 };
		int maxNum = num[0];
		int minNum = num[0];

		for (int i = 0; i < num.length; i++) { // �ε��� 0~9����

			if (maxNum < num[i]) {
				maxNum = num[i];
			} else if (minNum > num[i]) {
				minNum = num[i];
			}
		}
		System.out.println("�ִ밪: " + maxNum);
		System.out.println("�ּҰ�: " + minNum);
	}

	static void example03() {
//		���� 3] 5���� �̸��� �迭�� ������ �� ù ��° �̸��� ������ �̸��� ���� �ٲٽÿ�
		String[] name = { "������", "����ö", "������", "ȫ����", "����ȣ" };
		String tempName = "";
		for (int i = 0; i < name.length; i++) {
			tempName = name[0];
			name[0] = name[4];
			name[4] = tempName;

		}
		System.out.println(Arrays.toString(name));
	}
}
