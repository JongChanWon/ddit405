package examanmal03;

public class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("개 같이 먹는다");
	}

	@Override
	void cry() {
		System.out.println("개 소리를 낸다");
	}

	@Override
	void move() {
		System.out.println("개 같이 움직인다");
	}

	void onlyForDog() {
		System.out.println("개 기능");
	}
}
