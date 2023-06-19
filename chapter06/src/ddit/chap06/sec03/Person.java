package ddit.chap06.sec03;

public class Person {
	String name;
	int age;
	String gender;
	String phoneNumber;

	Person() {
		this("홍길동", 30, "남성", "010-1234-5678");
	}

	Person(String name) {
		this(name, 25);
	}

	Person(String name, int age) {
		this(name, age, "여성");
	}

	Person(String name, int age, String gender) {
		this(name, age, gender, "010-5643-5943");
	}

	public Person(String name, int age, String gender, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
		System.out.println("핸드폰번호: " + phoneNumber);
	}
}
