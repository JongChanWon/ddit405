package ddit.chap06.sec06.study;

public class Computer {
	public static void main(String[] args) {
		Computer c = new Computer();
		ComputerExam pc = new ComputerExam();
		String a = pc.osType[0];
		System.out.println(a);
	}
}

class ComputerExam {
	public final String[] osType = { "윈도7", "애플 OS X", "안드로이드" };
	int memory;

	public ComputerExam() {
		// TODO Auto-generated constructor stub
	}

	ComputerExam(int os, int memory) {

		this.memory = memory;
	}

}