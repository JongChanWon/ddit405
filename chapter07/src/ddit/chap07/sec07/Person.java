package ddit.chap07.sec07;

public class Person {
	String name;
	int age;

	public void speak() {
		System.out.println("말소리를 내다");
	}
}

class Dancer extends Person {
	int career;

	Dancer(int career) {
		super(); // person은 컴파일러에 의해 기본생성자가 생성 되었으니까 무조건 super를 받아야한다
		this.career = career;
	}

	public void dance() {
		System.out.println("춤을 춘다!!");
	}
}
