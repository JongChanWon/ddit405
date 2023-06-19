package ddit.chap06.sec02;

public class Car {
	private String company;
	private boolean isAuto;

	Car() {
		// 조건이 있어도 기본생성자가 된다
		// 기본생성자의 조건은 배열순서가 다르고 매개변수의 개수가 다르고 매개변수 타입이 다르면 overloading이 됨
		// overload = 다양한 데이터를 취급하기 위해 사용
		// this변수 자바에서 제공하는 특별한 참조변수

		// this() -> 생성자 메서드의 첫번째 문장 이어야 한다. 다른 생성자 메서드를 호출할때 쓰임
		// 코드의 중복을 피할 수 있다.
		company = "현대";
		isAuto = false;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	}

	public void carInfo() {
		System.out.println("제조회사: " + company);
		System.out.print("기어타입: ");

		if (isAuto) {
			System.out.println("Autometic");
		} else {
			System.out.println("manual");
		}
	}

} // 내 차는 한국GM(쉐보레) 스파크 검은색입니다. 얼음에도 쥐어 박았고요, 후진하다가 돌담에다가 긁어도 봤고요, 주차하다가 기둥 못보고
	// 쳐박았구요, 또 주차하다가 원룸 빌라 벽 살짝 들이 받았어요.
// 지금까지 저의 까망이의 수난시대였습니다.
