package examanmal04;

public class Whale extends Mammalia {
	@Override
	void eat() {
		System.out.println("고래 같이 먹는다");
	}

	@Override
	void cry() {
		System.out.println("고래 소리를 낸다");
	}

	@Override
	void move() {
		System.out.println("고래 같이 움직인다");
	}

	void onlyForWhale() {
		System.out.println("고래 기능");
	}
}
