package ddit.chap07.sec07;

public class Person {
	String name;
	int age;

	public void speak() {
		System.out.println("���Ҹ��� ����");
	}
}

class Dancer extends Person {
	int career;

	Dancer(int career) {
		super(); // person�� �����Ϸ��� ���� �⺻�����ڰ� ���� �Ǿ����ϱ� ������ super�� �޾ƾ��Ѵ�
		this.career = career;
	}

	public void dance() {
		System.out.println("���� ���!!");
	}
}
