package ddit.chap07.sec05;

public class UnitExam {
	public static void main(String[] args) {
		Marine marine = new Marine("해병대");
		marine.move(5000, 2000);

		Unit unit = new Unit("개병대");
		unit.stop();
	}
}
