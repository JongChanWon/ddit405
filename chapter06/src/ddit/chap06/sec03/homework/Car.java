package ddit.chap06.sec03.homework;

import java.util.Scanner;

/*요구사항1] 자동차 클래스를 생성하시오.
자동차 클래스는 연료(gas) 속성을 가지고 있으며 외부에서 참조될 수 없다.
연료는 필요할 때 주입할 수 있으며 남은 연료를 확인할 수 있는 기능의 버튼도 있다.
자동차는 연료가 남아 있으면 주행할 수 있고 주행할때마다 연료의 양이 일정량 감소되며
연료가 남아있지 않으면 주행할 수 없다.*/
public class Car {
	Scanner sc = new Scanner(System.in);
	// 주행, setter, 연료양 확인하는 메서드
	private int gas;

	public void setGas(int gas) {
		this.gas = gas;
	}

	// 연료 필요할때 주입 가능, 남은 연료 확인기능
	public void driveCar() {
		if (gas <= 0) {
			System.out.println("가스가 없어서 운행을 할 수 없습니다. 주유 하러 가자!!");
			gasStation();
		} else if (gas > 0 && gas <= 50) {
			System.out.println("운행 하셔도 됩니다. 현재 연료는 " + gas + "L");
//			for (int drive = 1; drive <= gas; drive++) {
			// 1키로 갈때마다 gas = 1씩감소
			while (true) {
				System.out.print("운행할 거리를 입력해주세요: ");
				int moveCar = sc.nextInt();
				if (moveCar == gas) {
					gas = 0;
					System.out.println("현재 가스: " + gas + "입니다. 충전이 필요해요");
					gasStation();
				} else if (moveCar < gas && moveCar != 0) {
					// 입력한 거리만큼 가스 감소
					// gas = moveCar;

					gas -= moveCar;
					System.out.println(moveCar + "km 이동해서" + "현재" + gas + "L 남았습니다.");
				} else {
					if (moveCar == 0) {
						System.out.println("잘못입력하셨습니다" + moveCar + "km는 갈 수 없습니다.");
					} else {
						System.out.println("잘못 입력하셨습니다. " + gas + "L로 갈수 있는 거리가 아닙니다.");
					}
				}
			}
//			}
		}
	}

	private void gasStation() {

		int limit = 50; // 가스 limit

		while (true) {
			System.out.print("충전할 양을 입력해주세요: ");
			int charge = Integer.parseInt(sc.next());

			if (charge > limit) {
				System.out.println("50L 가 정량입니다. 다시 입력해주세요");

			} else if (charge <= limit) {
				System.out.println(charge + "L 가 충전 되었습니다.");
				gas = charge;
				if (gas > 50) {
					System.out.println("주유가 완료 되었습니다. 현재 가스량: " + gas + "L \n50L 초과해서 채울 수 없습니다.");
//					driveCar();
//					return;
				}
				driveCar();
			}
		}
//		// 100 충전하면 가스 10증가
//		// 운행하면 5씩감소
//		System.out.print("가스충전비: ");
//		int charge = Integer.parseInt(sc.nextLine());
//
//		for (int i = 0; i < limit; i++) {
//
//		}
//
//	} else {

	}

	@Override
	public String toString() {
		return "현재 가스량 [gas=" + gas + "]";
	}

}
