package ddit.chap06.sec03.homework;

/*요구사항1] 자동차 클래스를 생성하시오.
자동차 클래스는 연료(gas) 속성을 가지고 있으며 외부에서 참조될 수 없다.
연료는 필요할 때 주입할 수 있으며 남은 연료를 확인할 수 있는 기능의 버튼도 있다.
자동차는 연료가 남아 있으면 주행할 수 있고 주행할때마다 연료의 양이 일정량 감소되며
연료가 남아있지 않으면 주행할 수 없다.*/
public class Car {
	// 주행, setter, 연료양 확인하는 메서드
	Car car = new Car();
	private int gas;

	public void setGas(int gas) {
		this.gas = gas; // 받아와서 this.gas에 저장
	}

	public void gasQuantity(int gas) {
		car.setGas(10);
		if (gas <= 0) {
			System.out.println("기름이 없어서 차를 운행할 수 없습니다.");
		} else {

			System.out.println("갑니다~~");
		}
	}

	public int gasStation() {

		return gas;
	}

}
