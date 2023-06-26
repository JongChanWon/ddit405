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

		System.out.println("ȸ�������� �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��  2. �ƴϿ�");

		String answer = "";

		for (;;) {
			System.out.print("�Է�: ");
			answer = sc.nextLine();

			if (answer == "1" || answer == "��") {
				// personalData();
				break;
			} else if (answer == "2" || answer == "�ƴϿ�") {
				System.out.println("ȸ�������� ���� ������ �ζǸ� �� �� �����ϴ�.");
				System.exit(0);
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}

	}

	public void personalData() {
		List<Membership> member = new ArrayList<Membership>();
		System.out.print("����: ");
		String name = sc.next();
		System.out.print("����⵵: ");
		String bornYear = sc.next();
		System.out.print("�̸���: ");
		String email = sc.next();
		System.out.print("�ּ�: ");
		String address = sc.next();
		System.out.println("�н�����: ");
		String pw = sc.next();

		member.add(new Membership(name, bornYear, email, address, pw));
	}

}
