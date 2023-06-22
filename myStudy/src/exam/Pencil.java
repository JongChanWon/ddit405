package exam;

// 각각의 팬들의 개수와 길이와 색상을 출력해라
public class Pencil {
	private int amount;

	Pencil(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}

class SharpPencil extends Pencil { // 샤프펜슬

	private int width;

	SharpPencil(int amount, int width) {
		super(amount);
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void print() {
		System.out.println("샤프 개수: " + super.getAmount());
		System.out.println("샤프 길이: " + width);
	}
}

class Ballpen extends Pencil { // 볼펜

	private String color; // 볼펜의 색

	Ballpen(int amount, String color) {
		super(amount);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void printPen() {
		System.out.println("일반볼펜");
		System.out.println("볼펜 개수: " + super.getAmount());
		System.out.println("볼펜 색깔: " + color);
	}
}

class FountainPen extends Ballpen { // 만년필

	FountainPen(int amount, String color) {
		super(amount, color);
	}

	public void refill(int n) {
		setAmount(n);
		System.out.println("만년필을 " + n + "개 리필합니다");
	}
}
