package myStudy;

public class Calculator {
	public static void main(String[] args) {

		Calcu[] cc = new Calcu[4];

		for (int i = 0; i < cc.length; i++) {
			cc[i] = new Calcu();
		}

		cc[0].title = "����å";
		cc[0].price = 1000;

		cc[1].title = "����å";
		cc[1].price = 2000;

		cc[2].title = "����å";
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

		System.out.println("��: " + sum);
		System.out.println("���: " + avg);
	}
}

class Calcu {
	String title;
	int price;

	public void showPrice() {
		System.out.println(title + "�� ������" + price + "�Դϴ�.");
	}

	int[] score = new int[] { 1, 2, 3, 4, 5 };
	int[] scores = { 1, 2, 3, 4, 5 };

	public void score() {
		System.out.println("score: " + score + "\nscores: " + scores);
	}

}