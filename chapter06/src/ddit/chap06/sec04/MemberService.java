package ddit.chap06.sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {
	private static MemberService instance = null; // 싱글톤 객체변수
	private Scanner sc = new Scanner(System.in);

	Member member = new Member("홍길동", "a001", "12345", 25);

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

		System.out.println("아이디: ");
		String tid = sc.next();
		System.out.println("비밀번호: ");
		String tpwd = sc.next();

		if (tid.equals(list.get(0)) && tpwd.equals(list.get(1))) {
			System.out.println(list.get(2) + "님 로그인 되었습니다.");
			return true;
		} else {
			System.out.println("아이디나 패스워드가 잘못 되었습니다.");
			return false;
		}
	}

	void logout(String id) {
		System.out.println(id + "회원님이 로그아웃 되셨습니다.");

	}

}
