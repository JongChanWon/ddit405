package examanmal04;

public class Shark extends Fish {
	@Override
	void eat() {
		System.out.println("��� ���� �Դ´�");
	}

	@Override
	void cry() {
		System.out.println("��� �Ҹ��� ����");
	}

	@Override
	void move() {
		System.out.println("��� ���� �����δ�");
	}

	void onlyForShark() {
		System.out.println("��� ���");
	}
}
