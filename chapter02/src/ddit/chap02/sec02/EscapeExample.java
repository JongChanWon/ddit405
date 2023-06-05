package ddit.chap02.sec02;

import java.util.Random;

public class EscapeExample {
	public static void main(String[] args) {
		// \t, \n, \r, \", \', \\
		System.out.println("대한민국 대전시 중구 오류동");
		System.out.println("대한민국\t대전시\t\t중구 오류동");
		System.out.println("대한민국\n대전시\n\n중구 오류동");
		System.out.println("대한민국\r 대전시\r\r중구 오류동");
		System.out.println("\"대한민국\"");
		System.out.println("\'대한민국\'");
		System.out.println("\\대한민국\\");

		System.out.println(3 / 4);

		int r1 = (int) (Math.random() * 45) + 1;

		Random r = new Random();
		System.out.println(r.nextInt() * 0.01);
	}
}
