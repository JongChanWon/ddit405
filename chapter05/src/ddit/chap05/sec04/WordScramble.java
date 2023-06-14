package ddit.chap05.sec04;

import java.util.Scanner;

public class WordScramble {
	String[] word = { "apple", "chestnut", "hope", "banana", "computer" };

	public void init() {
		int count = 0;
		String str = word[(int) (Math.random() * word.length)];
		String question = suffle(str);
		System.out.println("Question: " + question);

		while (true) {
			String answer = inputAnswer();
			count++;
			if (str.equals(answer)) {
				System.out.println("정답입니다");
				System.out.println("시도횟수: " + count);
				break;
			} else {
				System.out.println("오답입니다.");
			}
		}
	}

	private String inputAnswer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 입력하세요: ");

		return sc.nextLine();
	}

	public static String suffle(String str) {

		char[] ch = str.toCharArray();
//		위에꺼 안쓰려면 밑이꺼로 쓰면됨
//		char[] ch1 = new char[str.length()]; 
//		for (int i = 0; i < ch1.length; i++) {
//			ch[i] = str.charAt(i);
//		}

		for (int i = 0; i < 1000; i++) {
			int rnd = (int) (Math.random() * ch.length);
			char temp = ch[0];
			ch[0] = ch[rnd];
			ch[rnd] = temp;
		}
		return new String(ch); // 문자열이 만들어지는 객체메서드(문자들이 모여서 문자열이됨)
	}
}
