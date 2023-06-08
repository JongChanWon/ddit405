package myStudy;

public class TT {
	public static void main(String[] args) {

		String[] scores = new String[] { "dd", "ee", "ttt" };

		String[] dd = { "11", "22", "33" };

		int result = add(new int[] { 90, 91, 92 });

		System.out.println(result);

	}

	private static int add(int[] is) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += is[i];
		}
		return sum;
	}

}
