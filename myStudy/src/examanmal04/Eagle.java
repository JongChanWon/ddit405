package examanmal04;

public class Eagle extends Bird {
	@Override
	void eat() {
		System.out.println("독수리 같이 먹는다");
	}

	@Override
	void cry() {
		System.out.println("독수리 소리를 낸다");
	}

	@Override
	void move() {
		System.out.println("독수리 같이 움직인다");
	}

	void onlyForEagle() {
		System.out.println("독수리 기능");
	}
}
