package examanmal03;

public class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("�� ���� �Դ´�");
	}

	@Override
	void cry() {
		System.out.println("�� �Ҹ��� ����");
	}

	@Override
	void move() {
		System.out.println("�� ���� �����δ�");
	}

	void onlyForDog() {
		System.out.println("�� ���");
	}
}
