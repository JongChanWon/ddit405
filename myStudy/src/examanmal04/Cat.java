package examanmal04;

public class Cat extends Mammalia {
	@Override
	void eat() {
		System.out.println("고양이 같이 먹는다");
	}

	@Override
	void cry() {
		System.out.println("고양이 소리를 낸다");
	}

	@Override
	void move() {
		System.out.println("고양이 같이 움직인다");
	}

	void onlyForCat() {
		System.out.println("고양이 기능");
	}

}
