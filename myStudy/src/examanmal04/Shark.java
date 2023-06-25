package examanmal04;

public class Shark extends Fish {
	@Override
	void eat() {
		System.out.println("상어 같이 먹는다");
	}

	@Override
	void cry() {
		System.out.println("상어 소리를 낸다");
	}

	@Override
	void move() {
		System.out.println("상어 같이 움직인다");
	}

	void onlyForShark() {
		System.out.println("상어 기능");
	}
}
