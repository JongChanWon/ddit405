package lotto;

import java.util.ArrayList;
import java.util.Calendar;
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
	private String personalYY; // 태어난 년도
	private String personalMM; // 태어난 월
	private String personalDD; // 태어난 일
	private String email;
	private String address;
	private String pw;

	public Membership() {
	}

	public Membership(String name, String personalYY, String personalMM, String personalDD, String email,
			String address, String pw) {
		this.name = name;
		this.personalYY = personalYY;
		this.personalMM = personalMM;
		this.personalDD = personalDD;
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
		System.out.print("이름: ");
		String name = sc.next();
		
		int personalYY = 0;
		int personalMM = 0;
		int personalDD = 0;
		
		Calendar cal = Calendar.getInstance();
		int yy = cal.get(Calendar.YEAR);
		for(;;) {
			System.out.print("출생년도: ");
			personalYY = sc.nextInt();
			
			
		}
		
		System.out.print("이메일: ");
		String email = sc.next();
		System.out.print("주소: ");
		String address = sc.next();
		System.out.println("패스워드: ");
		String pw = sc.next();

		member.add(new Membership(name, bornYear, email, address, pw));
	}

}
