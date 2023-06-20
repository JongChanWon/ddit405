package ddit.chap06.sec05;

public class HimartExample {
	public static void main(String[] args) {
		Tv t = new Tv(1000);
		Computer c = new Computer(10000);
		Audio a = new Audio(1500);

		Customer gildong = new Customer();
		gildong.buy(c);
		gildong.buy(t);
		gildong.summary();
	}
}
