package ddit.chap06.sec03;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printInfo();
		System.out.println("=================");
		Person p2 = new Person("ȫ�浿");
		p2.printInfo();
		System.out.println("=================");
		Person p3 = new Person("������", 34);
		p3.printInfo();
		System.out.println("=================");
		Person p4 = new Person("������", 33, "����");
		p4.printInfo();
	}
}
