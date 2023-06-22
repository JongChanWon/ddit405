package ddit.chap07.sec05;

public class Unit {
	int x = 100;
	int y = 100;
	String name;

	Unit(String name) {
		this.name = name;
	}

	public void stop() {
		System.out.println(name + "�� ��ǥ(" + x + ", " + y + ") �� ����ϴ�");

	}

	public void move(int x, int y) {
//		System.out.println(name + "�� ��ǥ(" + x + ", " + y + ") �� ���������ϴ�");
	}
}

class Marine extends Unit {

	Marine(String name) {
		super("�غ�");
	}

	@Override
	public void move(int x, int y) { // �θ�Ŭ���� �޼��庸�� �аų� ���� ������� (����������)
		System.out.println(name + "�� ��ǥ(" + this.x + ", " + this.y + ") ����" + "�� ��ǥ(" + x + ", " + y + ") �� �ɾ �̵��մϴ�");
	}

	public void stimPack() {
		System.out.println("���ݸ��: ������ ����");
	}

}

class Tank extends Unit {

	Tank(String name) {
		super(name);
	}

	@Override
	public void move(int x, int y) { // �θ�Ŭ���� �޼��庸�� �аų� ���� ������� (����������)
		System.out.println(name + "�� ��ǥ(" + this.x + ", " + this.y + ") ����" + "�� ��ǥ(" + x + ", " + y + ") �� �ɾ �̵��մϴ�");
	}

	public void sizeMode() {
		System.out.println("���ݸ��: ������� ��ȯ");
	}
}