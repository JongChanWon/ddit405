package exam;

// ������ �ҵ��� ������ ���̿� ������ ����ض�
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

class SharpPencil extends Pencil { // �����潽

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
		System.out.println("���� ����: " + super.getAmount());
		System.out.println("���� ����: " + width);
	}
}

class Ballpen extends Pencil { // ����

	private String color; // ������ ��

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
		System.out.println("�Ϲݺ���");
		System.out.println("���� ����: " + super.getAmount());
		System.out.println("���� ����: " + color);
	}
}

class FountainPen extends Ballpen { // ������

	FountainPen(int amount, String color) {
		super(amount, color);
	}

	public void refill(int n) {
		setAmount(n);
		System.out.println("�������� " + n + "�� �����մϴ�");
	}
}
