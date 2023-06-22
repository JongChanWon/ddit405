package ddit.chap07.sec04;

public class Parent extends Object {
	String name;

	Parent(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
//		String res = "부모클래스(Object)의 toString메서드: " + super.toString() + "\n자식클래스(Parent)의 toString메서드: " + name;
//		return res;
		return name;
	}
}
