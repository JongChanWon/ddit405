package ddit.chap06.sec04;

public class Account {
	private static Account instance = null; // 해당클래스가 저장되어질 객체 참조변수가 만들어져야함... 딱한번!!(static)
	// 생성자 메서드 생성, getInstance메서드(외부와 소통할수있는..), 외부에서 접근할 수 없게 만들어야함
	// Account 자신의 주소값을 저장하기 위한 변수

	private Account() { // 외부에서 객체가 생성 될 수 없음(private라서..)
	}

	public static Account getInstance() {
		// 밖에서 객체가 만들어 질 수 없기때문에 getInstance를 부르기 위해선 static으로 되어야 클래스이름.메서드명으로 호출 가능
		// 객체 생성 전에 Account에 호출 되어져야함
		if (instance == null)
			instance = new Account();
		return instance; // 반환 타입이 자기 클래스타입
	}
}
