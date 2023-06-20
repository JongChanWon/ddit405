package ddit.chap06.sec05;

public class Customer {
	int money;
	int bonusPoint;
	String items = "";

	void buy(Tv tv) {
		money += tv.price;
		bonusPoint += tv.bonusPoint;
		items += tv + ", ";
	}

	void buy(Computer computer) {
		money += computer.price;
		bonusPoint += computer.bonusPoint;
		items += computer + ", ";
	}

	void buy(Audio audio) {
		money += audio.price;
		bonusPoint += audio.bonusPoint;
		items += audio + ", ";
	}

	void summary() {

		System.out.println(
				"���Ÿ��: " + items.substring(0, items.length() - 2) + "\n���űݾ� �հ�: " + money + "\n���ʽ�����Ʈ: " + bonusPoint);
	}
}
