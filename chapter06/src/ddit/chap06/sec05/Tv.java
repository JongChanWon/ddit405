package ddit.chap06.sec05;

public class Tv {
	// tv computer audio
	// ���ʽ�����Ʈ�� ���� ����
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
