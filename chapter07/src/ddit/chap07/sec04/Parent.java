package ddit.chap07.sec04;

public class Parent extends Object {
	String name;

	Parent(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
//		String res = "�θ�Ŭ����(Object)�� toString�޼���: " + super.toString() + "\n�ڽ�Ŭ����(Parent)�� toString�޼���: " + name;
//		return res;
		return name;
	}
}
