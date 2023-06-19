package ddit.chap06.sec03;

public class CalculateExample {
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		System.out.println("add(byte+short)" + cal.add((byte) 10, (short) 10));
		System.out.println(cal.add(-1, -1));
	}
}
