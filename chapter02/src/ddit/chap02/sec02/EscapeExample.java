package ddit.chap02.sec02;

import java.util.Random;

public class EscapeExample {
	public static void main(String[] args) {
		// \t, \n, \r, \", \', \\
		System.out.println("���ѹα� ������ �߱� ������");
		System.out.println("���ѹα�\t������\t\t�߱� ������");
		System.out.println("���ѹα�\n������\n\n�߱� ������");
		System.out.println("���ѹα�\r ������\r\r�߱� ������");
		System.out.println("\"���ѹα�\"");
		System.out.println("\'���ѹα�\'");
		System.out.println("\\���ѹα�\\");

		System.out.println(3 / 4);

		int r1 = (int) (Math.random() * 45) + 1;

		Random r = new Random();
		System.out.println(r.nextInt() * 0.01);
	}
}
