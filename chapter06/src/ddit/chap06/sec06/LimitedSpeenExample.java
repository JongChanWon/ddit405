package ddit.chap06.sec06;

import java.util.Scanner;

// values() => enum요소들을 순서대로 enum타입의 배열로 반환함
// valueOf(String args) => 괄호안의 String값을 enum에서 가져온다. 값이없으면 exception

public class LimitedSpeenExample {
	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 스쿨존");
		System.out.println("2. 시내주행");
		System.out.println("3. 시외주행");
		System.out.println("=============");
		System.out.print("번호선택: ");
		int num = sc.nextInt();

		if (num == 1) {
			str = "SchoolZone";
		} else if (num == 2) {
			str = "DownTown";
		} else if (num == 3) {
			str = "CountrySide";
		} else {
			System.out.println("번호 선택 다시해주세요");
			System.exit(0);
		}

		LimitedSpeed limitedSpeed = LimitedSpeed.valueOf(str);
		switch (limitedSpeed) {
		case SchoolZone:
			System.out.println(limitedSpeed.getValues() + "이하의 속도를 유지해야 합니다.");
			System.out.println(limitedSpeed.ordinal() + 1); // ordinal() => 해당 열거객체가 몇번째인지 알려줌
			break;
		case DownTown:
			System.out.println(limitedSpeed.getValues() + "이하의 속도를 유지해야 합니다.");
			System.out.println(limitedSpeed.ordinal() + 1);
			break;
		case CountrySide:
			System.out.println(limitedSpeed.getValues() + "이하의 속도를 유지해야 합니다.");
			System.out.println(limitedSpeed.ordinal() + 1);
			break;

		default:
			break;
		}
	}
}
