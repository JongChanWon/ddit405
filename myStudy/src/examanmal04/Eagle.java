package examanmal04;

public class Eagle extends Bird {
	@Override
	void eat() {
		System.out.println("������ ���� �Դ´�");
	}

	@Override
	void cry() {
		System.out.println("������ �Ҹ��� ����");
	}

	@Override
	void move() {
		System.out.println("������ ���� �����δ�");
	}

	void onlyForEagle() {
		System.out.println("������ ���");
	}
}
