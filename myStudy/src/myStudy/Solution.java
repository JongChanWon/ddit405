package myStudy;

class Solution {
	// "He11oWor1d" "lloWorl" 2
	String my_string = "He11oWor1d";
	String overwrite_string = "lloWorl";
	int s = 2;

	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution("HelloWor1d", "lloWorl", 2);
		s.solution("Program29b8UYP", "merS123", 7);
	}

	public String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		System.out.println(my_string + " " + overwrite_string + " " + s);
		answer = my_string.substring(2, 9);
		if (s == 2) {
		} else if (s == 7) {

		}
		return answer;
	}
}