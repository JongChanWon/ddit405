package ddit.chap07.sec09;

public class CarExample {

	public static void main(String[] args) {
		Tire[] tire = new Tire[] { new Tire(5, "�� ����"), new Tire(5, "�� ������"), new Tire(5, "�� ����"),
				new Tire(5, "�� ������") };

		Car car = new Car(tire);
		
		for(int i = 0; i < tire.length; i++) {
			int problemLocation = car.run();
			System.out.println(problemLocation);
			switch (problemLocation) {
			case 0:
				System.out.println("���� ���� Ÿ�̾� �ѱ�Ÿ�̾�� ��ü");
			
				break;
			case 1:
				System.out.println("���� ������ Ÿ�̾� �ѱ�Ÿ�̾�� ��ü");
				
				break;
			case 2:
				System.out.println("���� ���� Ÿ�̾� �ѱ�Ÿ�̾�� ��ü");
				 
				break;
			case 3:
				System.out.println("���� ������ Ÿ�̾� �ѱ�Ÿ�̾�� ��ü");
				 
				break;
			}
		}
	}
}
