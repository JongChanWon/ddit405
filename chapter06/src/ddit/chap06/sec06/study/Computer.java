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
	public final String[] osType = { "����7", "���� OS X", "�ȵ���̵�" };
	int memory;

	public ComputerExam() {
		// TODO Auto-generated constructor stub
	}

	ComputerExam(int os, int memory) {

		this.memory = memory;
	}

}