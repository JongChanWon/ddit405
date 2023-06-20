package ddit.chap06.sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {
	private static MemberService instance = null; // �̱��� ��ü����
	private Scanner sc = new Scanner(System.in);

	Member member = new Member("ȫ�浿", "a001", "12345", 25);

	private MemberService() {

	}

	public static MemberService getInstance() {
		if (instance == null) {
			instance = new MemberService();
		}
		return instance;
	}

	List<String> selectOne() {
		List<String> list = new ArrayList<String>();
		list.add(member.getId());
		list.add(member.getPassword());
		list.add(member.getName());

		return list;
	}

	boolean login(List<String> list) {

		System.out.println("���̵�: ");
		String tid = sc.next();
		System.out.println("��й�ȣ: ");
		String tpwd = sc.next();

		if (tid.equals(list.get(0)) && tpwd.equals(list.get(1))) {
			System.out.println(list.get(2) + "�� �α��� �Ǿ����ϴ�.");
			return true;
		} else {
			System.out.println("���̵� �н����尡 �߸� �Ǿ����ϴ�.");
			return false;
		}
	}

	void logout(String id) {
		System.out.println(id + "ȸ������ �α׾ƿ� �Ǽ̽��ϴ�.");

	}

}
