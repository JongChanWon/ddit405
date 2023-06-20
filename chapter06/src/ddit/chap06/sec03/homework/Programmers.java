package ddit.chap06.sec03.homework;

public class Programmers {
	public static void main(String[] args) {
		Programmers p1 = new Programmers();
		int answer = p1.solution("<", "=", 20, 50);
		
		System.out.println(answer);
	}
	public int solution(String ineq, String eq, int n , int m) {
		int answer = 0;
		boolean flag = false;
		if(ineq == "<" && eq == "=") {
			if(!(n >= m))
			answer = 1;
			else answer = 0;
		}
		
		
		
		
		return answer;
	}
}
