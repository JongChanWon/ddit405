package ddit.chap06.sec04;

import java.util.List;

public class MemberController {
	public static void main(String[] args) {
		MemberService memberService = MemberService.getInstance();
		// MemberService memberService1 = new Member(name, id, password, age);
		List<String> list = memberService.selectOne();

		memberService.login(list);
//		boolean res = memberService.login(list);
//		if (res) {
//			System.out.println(list.get(2) + "님 로그인 되셨습니다.");
//		} else {
//			System.out.println("잘못된 아이디나 패쓰워드");
//		}

		// memberService.logout("won");

	}
}
