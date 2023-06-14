package myStudy;

public class Calculator {
	public static void main(String[] args) {

		Calcu[] cc = new Calcu[4];

		for (int i = 0; i < cc.length; i++) {
			cc[i] = new Calcu();
		}

		cc[0].title = "국어책";
		cc[0].price = 1000;

		cc[1].title = "수학책";
		cc[1].price = 2000;

		cc[2].title = "역사책";
		cc[2].price = 3000;

		for (int i = 0; i < cc.length; i++) {
			cc[i].showPrice();
		}

		cc[3].score();

//		sum(3, 4);
//		sum(20, 10);
	}

	public static void sum(int left, int right) {
		int sum = left + right;
		double avg = (double) (left + right) / 2;

		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
	}
}

class Calcu {
	String title;
	int price;

	public void showPrice() {
		System.out.println(title + "의 가격은" + price + "입니다.");
	}

	int[] score = new int[] { 1, 2, 3, 4, 5 };
	int[] scores = { 1, 2, 3, 4, 5 };

	public void score() {
		System.out.println("score: " + score + "\nscores: " + scores);
	}

}