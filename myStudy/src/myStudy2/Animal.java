package myStudy2;

public class Animal { // 3개의 클래스가 Animal을 상속받는다
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eating() {

	}
}

class Human extends Animal { // 사람클래스
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal { // 호랑이클래스
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal { // 독수리클래스
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉펴고 멀리 날아갑니다.");
	}
}

class dog extends Animal {
	public void move() {
		System.out.println("강아쥐가 날라댕겨요");
	}

	public void playing() {
		System.out.println("강아쥐가 꼬리를 흔들며 놀아요");
	}
}
