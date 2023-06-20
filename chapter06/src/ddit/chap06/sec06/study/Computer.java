package ddit.chap06.sec06.study;

public class Computer {
	public static void main(String[] args) {
		ComputerExam pc = new ComputerExam(0, 16);
	}
}

class ComputerExam {
	public final String[] osType = { "윈도7", "애플 OS X", "안드로이드" };
	int memory;

	ComputerExam(int os, int memory) {

		this.memory = memory;
	}

}