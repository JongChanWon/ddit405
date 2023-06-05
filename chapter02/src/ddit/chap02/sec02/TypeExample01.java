package ddit.chap02.sec02;

public class TypeExample01 {
	public static void main(String[] args) {
		CalculateDays cd = new CalculateDays();
		cd.calcDays();
	}
}

class CalculateDays {
	double days = 365.2422;

	public void calcDays() {
		int day = (int) days;

		double hours = (days - day) * 24;
		int hour = (int) hours;
		double minutes = (hours - hour) * 60;
		int minute = (int) minutes;

		double secs = (minutes - minute) * 60;
		int sec = (int) secs;
		System.out.println("1년은 " + day + "일 " + hour + "시간 " + minute + "분 " + sec + "초");

	}
}