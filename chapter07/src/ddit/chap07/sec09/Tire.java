package ddit.chap07.sec09;

public class Tire {
	public int maxRotation; // 최대회전수(수명)
	public int accmulateRotation; // 누적회전수(사용량)
	public String location; // 위치

	Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation < maxRotation) {
			System.out.println(location + "tire의 수명: " + (maxRotation-accmulateRotation));
			return true;
		}else {
			System.out.println(location+ "tire 교체요망");
			return false;
		}
	}
}
class KumhoTire{
	
}
