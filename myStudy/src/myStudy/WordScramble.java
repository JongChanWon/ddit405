package myStudy;

import java.util.Scanner;

public class WordScramble {
	String[] word = { "banana", "apple", "coffee", "computer", "diet", "mobile" };

	public void init() {
		String str = word[(int) (Math.random() * word.length)]; // ?번째를 str에 넣어줌
		String question = shuffle(str);
		int count = 0;
		System.out.println("문제: " + question);
		while (true) {
			String answer = inputAnswer();
			count++;
			if (str.equals(answer)) {
				System.out.println("정답입니다." + count + "번 만에 맟추셨습니다.");
				break;
			} else {
				System.out.println("정답이 아닙니다. 다시 시도해주세요");
			}
		}
	}

	public String inputAnswer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정답을 입력해주세요: ");

		return sc.nextLine();
	}

	public String shuffle(String arr) {
		char[] ch = arr.toCharArray(); // banana라는 값이 들어왔으면 b a n a n a 한글자씩 ch배열에 넣어줌
		for (int i = 0; i < 10000; i++) {
			int rnd = (int) (Math.random() * ch.length);

			char temp = ch[0];
			ch[0] = ch[rnd];
			ch[rnd] = temp;

		}
		return new String(ch);
	}
}
