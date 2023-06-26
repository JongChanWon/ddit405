package lotto;

import java.util.Calendar;
import java.util.Random;

public class DatePrinter {
	public static void printDateTime(Calendar cal) {
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);

	}
}

// 프로그램을 주어진 시간동안 대기
class Loading {
	public void loading() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Lottery {
	String randomNum = "";
	String[] randomNumbers = new String[6];

	public static int random(int min, int max) {
		Random random = new Random();
		int num = random.nextInt(max - min + 1) + min;
		return num;
	}
	public void randomLotteryNum() {
		for(int i = 0; i < 6; i++) {
			//randomNum += PersonalData.getInstance().random(0,9);
		}
	}
}










