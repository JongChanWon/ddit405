package ddit.chap07.sec05;

public class UnitExam {
	public static void main(String[] args) {
		Marine marine = new Marine("해병대");
		marine.move(5000, 2000);

		Unit unit = new Unit("개병대");
		unit.stop();

		UnitExam ux = new UnitExam();
		int x = ux.ex(11, 11);
		System.out.println(x);

	}

	int num1 = 11;
	int num2 = 11;

	public int ex(int num1, int num2) {
		int answer = 0;
		answer = (num1 != num2) ? -1 : 1;

		return answer;
	}
}
