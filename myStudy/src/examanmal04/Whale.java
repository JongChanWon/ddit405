package examanmal04;

public class Whale extends Mammalia {
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

	void onlyForWhale() {
		System.out.println("�� ���");
	}
}
