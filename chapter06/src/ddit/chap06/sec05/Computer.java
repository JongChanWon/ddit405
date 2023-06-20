package ddit.chap06.sec05;

public class Computer {
	int price;
	int bonusPoint;

	Computer(int price) {
		this.price = price;
		bonusPoint = (int) (price * 0.01);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}
