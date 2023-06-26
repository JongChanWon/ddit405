package ddit.chap07.sec09;

public class CarExample {

	public static void main(String[] args) {
		Tire[] tire = new Tire[] { new Tire(5, "앞 왼쪽"), new Tire(5, "앞 오른쪽"), new Tire(5, "뒤 왼쪽"),
				new Tire(5, "앞 오른쪽") };

		Car car = new Car(tire);
		
		for(int i = 0; i < tire.length; i++) {
			int problemLocation = car.run();
			System.out.println(problemLocation);
			switch (problemLocation) {
			case 0:
				System.out.println("앞쪽 왼쪽 타이어 한국타이어로 교체");
			
				break;
			case 1:
				System.out.println("앞쪽 오른쪽 타이어 한국타이어로 교체");
				
				break;
			case 2:
				System.out.println("뒤쪽 왼쪽 타이어 한국타이어로 교체");
				 
				break;
			case 3:
				System.out.println("뒤쪽 오른쪽 타이어 한국타이어로 교체");
				 
				break;
			}
		}
	}
}
