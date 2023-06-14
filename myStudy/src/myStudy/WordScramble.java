package myStudy;

import java.util.Scanner;

public class WordScramble {
	String[] word = { "banana", "apple", "coffee", "computer", "diet", "mobile" };

	public void init() {
		String str = word[(int) (Math.random() * word.length)]; // ?��°�� str�� �־���
		String question = shuffle(str);
		int count = 0;
		System.out.println("����: " + question);
		while (true) {
			String answer = inputAnswer();
			count++;
			if (str.equals(answer)) {
				System.out.println("�����Դϴ�." + count + "�� ���� ���߼̽��ϴ�.");
				break;
			} else {
				System.out.println("������ �ƴմϴ�. �ٽ� �õ����ּ���");
			}
		}
	}

	public String inputAnswer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");

		return sc.nextLine();
	}

	public String shuffle(String arr) {
		char[] ch = arr.toCharArray(); // banana��� ���� �������� b a n a n a �ѱ��ھ� ch�迭�� �־���
		for (int i = 0; i < 10000; i++) {
			int rnd = (int) (Math.random() * ch.length);

			char temp = ch[0];
			ch[0] = ch[rnd];
			ch[rnd] = temp;

		}
		return new String(ch);
	}
}
