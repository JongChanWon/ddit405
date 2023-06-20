package ddit.chap06.sec05;

public class Tv {
	// tv computer audio
	// 보너스포인트도 갖고 있음
	int price;
	int bonusPoint;

	Tv(int price) {
		this.price = price;
		bonusPoint = (int) (price * 0.01);
	}

	@Override
	public String toString() {
		return "Television";
	}
}
