package examanmal02;

public class Cat extends Animal {
	@Override
	void eat() {
		System.out.println("����� ���� �Դ´�");
	}

	@Override
	void cry() {
		System.out.println("����� �Ҹ��� ����");
	}

	@Override
	void move() {
		System.out.println("����� ���� �����δ�");
	}

	void onlyForCat() {
		System.out.println("����� ���");
	}
}
