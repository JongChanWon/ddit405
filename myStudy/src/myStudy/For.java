package myStudy;

public class For {
	// 1~ 100까지 정수중에서 3의 배수의 총합을 구하는 코드를 작성
	public static void main(String[] args) {
		// 3, 6, 9, 12 ,,,
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);

		// while문과 Math.random() 메소드를 이용해서 2개의
		// 주사위는 1~6까지 2개의 주사위가 있음

		while (true) {
			int s = (int) (Math.random() * 6) + 1;
			int s1 = (int) (Math.random() * 6) + 1;
			System.out.println(s + s1);
			if (s + s1 == 5) {
				break;
			}
		}
	}
}
