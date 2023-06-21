package ddit.chap07.sec01;

public class HimartExample {
	public static void main(String[] args) {
		Tv tv = new Tv(1500);
		System.out.println(tv); // toString 메서드가 호출된것
		System.out.println(tv.price); // 부모클래스의 price를 가져다 써서 자식클래스에서 재정의 함
		System.out.println(tv.bonusPoint);

		Audio audio = new Audio(2000);
		System.out.println(audio);
		System.out.println(audio.price);
		System.out.println(audio.bonusPoint);

		Computer computer = new Computer(3000);
		System.out.println(computer);
		System.out.println(computer.price);
		System.out.println(computer.bonusPoint);
		System.out.println("====================");

		System.out.println(new Tv(1500));
		new Audio(1500);
		new Computer(1500);
		System.out.println("===================");
		Customer customer = new Customer();
		customer.buy(tv);
		customer.buy(computer);
		customer.buy(audio);
		customer.summary();

	}
}
