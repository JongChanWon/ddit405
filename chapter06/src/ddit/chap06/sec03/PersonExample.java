package ddit.chap06.sec03;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printInfo();
		System.out.println("=================");
		Person p2 = new Person("홍길동");
		p2.printInfo();
		System.out.println("=================");
		Person p3 = new Person("원종찬", 34);
		p3.printInfo();
		System.out.println("=================");
		Person p4 = new Person("박진영", 33, "남성");
		p4.printInfo();
	}
}
