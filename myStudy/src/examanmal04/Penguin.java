package examanmal04;

public class Penguin extends Bird {
	@Override
	void eat() {
		System.out.println("�ر� ���� �Դ´�");
	}

	@Override
	void cry() {
		System.out.println("�ر� �Ҹ��� ����");
	}

	@Override
	void move() {
		System.out.println("�ر� ���� �����δ�");
	}

	void onlyForPenguin() {
		System.out.println("�ر� ���");
	}
}
