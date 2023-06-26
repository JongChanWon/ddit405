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

		int n = 1;
		String answer = String.valueOf(n);
		System.out.println("==================");
		System.out.println(answer);

		String a = "programmers";

		String my_string = "programmers";
		String alp = "P";

		System.out.println(my_string.replace(alp, my_string));

		String answer1 = my_string.replaceAll(my_string, alp);
		System.out.println(answer1);
		System.out.println(my_string.compareTo(alp));
		
		int a1 = math();
		System.out.println(a1);
	}

	public static int math() {
		int[] num_list = { 1, 2, 4, 5 };
		int n1 = 3;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] == n1) {
				return 1;
			}
		}
		return 0;
	}
}
