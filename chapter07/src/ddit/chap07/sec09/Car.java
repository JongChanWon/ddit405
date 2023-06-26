package ddit.chap07.sec09;

public class Car {
	// has ~ a 관계는 포함되어지는 대상을 멤버변수로 갖는다
//	Tire frontLeftTire = new Tire(5, "앞 왼쪽");
//	Tire frontRightTire = new Tire(3, "앞 오른쪽");
//	Tire backLeftTire = new Tire(6, "뒤 왼쪽");
//	Tire backtRightTire = new Tire(4, "뒤 오른쪽");

	Tire[] tire = new Tire[4];
	// 0번째 앞쪽왼쪽, 1번째 앞쪽오른쪽, 2번째 뒤쪽왼쪽, 3번째 뒤쪽오른쪽
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
		System.out.println("자동차가 멈춥니다");

	}
}
