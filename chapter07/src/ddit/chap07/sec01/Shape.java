package ddit.chap07.sec01;

// �θ�Ŭ������ �⺻�����ڸ� ȣ�� �ؾ��ϴµ�(�Ķ���Ͱ� �ִ� �����ڴ� �Ķ���Ͱ� � ���� �𸣴� ��� ���� �� ����) �θ�Ŭ������ �⺻�����ڰ� ������
// �ڽ�Ŭ���� ���� ��� ���� �� ��� ������ ��(�ڽ�Ŭ������ �⺻�����ڿ��� super()�� �޾Ƽ� �����
public class Shape { // �θ�
	String color;
	String kind;

	Shape() {
	}

	Shape(String color, String kind) {
		this.color = color;
		this.kind = kind;
	}

	public void draw() {
		System.out.println(color + "������ " + kind + "������ �׸���.");
	}
}
