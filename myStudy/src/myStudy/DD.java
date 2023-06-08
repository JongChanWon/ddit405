package myStudy;

public class DD {
	public static void main(String[] args) {
//		¿¹Á¦6] +1 -2 +3 -4 +5 -6 +7 -8 +9 -10 = -5

		int oddSum = 0;
		int evenSum = 0;
		String expr = "";
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				if (i != 1) {
					expr += " +" + i;
				} else {
					expr += "" + i;
				}
				oddSum += i;
			} else {
				if (i == 10) {
					expr += " -" + i + " = ";
				} else {
					expr += " -" + i;

				}
				evenSum -= i;
			}
		}
		System.out.println(expr + (oddSum + evenSum));

	}
}
