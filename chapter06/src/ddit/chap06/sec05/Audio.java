package ddit.chap06.sec05;

public class Audio {
	int price;
	int bonusPoint;

	Audio(int price) {
		this.price = price;
		bonusPoint = (int) (price * 0.01);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}
