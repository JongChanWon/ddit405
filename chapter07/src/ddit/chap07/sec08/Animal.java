package ddit.chap07.sec08;

public abstract class Animal {
	public String kind;

	Animal(String kind) {
		this.kind = kind;
	}

	public void breathe() {
		System.out.println("���� ����");
	}

	public abstract void sound();
}
