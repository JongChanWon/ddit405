package ddit.chap07.sec09;

public class Car {
	// has ~ a ����� ���ԵǾ����� ����� ��������� ���´�
//	Tire frontLeftTire = new Tire(5, "�� ����");
//	Tire frontRightTire = new Tire(3, "�� ������");
//	Tire backLeftTire = new Tire(6, "�� ����");
//	Tire backtRightTire = new Tire(4, "�� ������");

	Tire[] tire = new Tire[4];
	// 0��° ���ʿ���, 1��° ���ʿ�����, 2��° ���ʿ���, 3��° ���ʿ�����
	Car(Tire[] tire) {
		this.tire = tire;
	}

	
	int run() {
		for (int i = 0; i < tire.length; i++) {
			if (tire[i].roll() == false) {
				stop();
				return i;
			}
		}
		return 0;
	}

	void stop() {
		System.out.println("�ڵ����� ����ϴ�");

	}
}
