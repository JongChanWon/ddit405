package ddit.chap06.sec03.homework;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.print("가스량을 세팅해주세요: ");
		int gas = car.sc.nextInt();
		
		car.setGas(gas); //처음 셋팅 가스 입력
		car.driveCar();
		
		
//		String to =car.toString();
//		car.getGas();
//		System.out.println(car.getGas());
//		System.out.println(to);

	}
}
