package ddit.chap06.sec03.homework;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.print("�������� �������ּ���: ");
		int gas = car.sc.nextInt();
		
		car.setGas(gas); //ó�� ���� ���� �Է�
		car.driveCar();
		
		
//		String to =car.toString();
//		car.getGas();
//		System.out.println(car.getGas());
//		System.out.println(to);

	}
}
