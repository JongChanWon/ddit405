package myStudy2;

import myStudy.AccessModifier;

public class AccessModifier2 {
//	public static void main(String[] args) {
//		AccessModifier am = new AccessModifier(); // ia�� ���ٰ���(public)
////		AccessModi amodi = new AccessModi(); // ia�� ���ٰ���
//		// new AccessModi().ie;
//
//	}
}

class AccessModi extends AccessModifier { // A/M�� �ڽ�Ŭ����
	// myStudy���ִ� AccessModifier Ŭ������ �ִ�
	// ia, ib, ie, ig ���� ����

	int a = AccessModi.ie;

	// �Ű������� �ִ� �����ڸ� ���������� �ٸ� Ŭ�������� ��ü�� �����ϰ� ������ �⺻�����ڸ� ���� ������Ѵ�.
	// �Ű������� �ִ� �����ڵ� ���� �⺻�����ڰ� ������ �⺻�����ڸ� �������� �ʾƵ� �ٸ�Ŭ�������� new�� ���� ��ü�� ���� �� �� �ִ�
	// �⺻�����ڴ� �Ⱥ������� �ڵ����� ���� �Ǳ� ������

	// static final ���� ���
	AccessModi(int a) {
		this.a = a;
	}

	public AccessModi() {
		// TODO Auto-generated constructor stub
	}

	public void Access() {
		int c = this.a;
		System.out.println(this);
	}

	public static void main(String[] args) {
		AccessModi amodi = new AccessModi();
		int bb = AccessModi.ie; // static ����

		int bb1 = AccessModifier.getIh();
		System.out.println("bb1: " + bb1);

		amodi.Access();
		int a = amodi.ia;
		int b1 = AccessModifier.ie;
		int b = amodi.ie; // static������ ��ü������ ������ �ʰ� �ҷ��;���

		System.out.println(bb);

	}
}