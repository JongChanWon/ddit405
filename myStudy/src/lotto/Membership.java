package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Membership {
	private static Membership m;

	public static Membership getInstance() {
		if (m == null) {
			m = new Membership();
		}
		return m;
	}

	public static void freeInstance() {
		m = null;
	}

	Scanner sc = new Scanner(System.in);

	private String name;
	private String bornYear;
	private String email;
	private String address;
	private String pw;

	public Membership() {
	}

	public Membership(String name, String bornYear, String email, String address, String pw) {
		this.name = name;
		this.bornYear = bornYear;
		this.email = email;
		this.address = address;
		this.pw = pw;
	}

	public void membershipGuide() {

		System.out.println("회원가입을 진행하시겠습니까?");
		System.out.println("1. 예  2. 아니오");

		String answer = "";

		for (;;) {
			System.out.print("입력: ");
			answer = sc.nextLine();

			if (answer == "1" || answer == "예") {
				// personalData();
				break;
			} else if (answer == "2" || answer == "아니오") {
				System.out.println("회원가입을 하지 않으면 로또를 살 수 없습니다.");
				System.exit(0);
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}

	}

	public void personalData() {
		List<Membership> member = new ArrayList<Membership>();
		System.out.print("성함: ");
		String name = sc.next();
		System.out.print("출생년도: ");
		String bornYear = sc.next();
		System.out.print("이메일: ");
		String email = sc.next();
		System.out.print("주소: ");
		String address = sc.next();
		System.out.println("패스워드: ");
		String pw = sc.next();

		member.add(new Membership(name, bornYear, email, address, pw));
	}

}
