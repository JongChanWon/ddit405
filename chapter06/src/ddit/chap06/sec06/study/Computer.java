package ddit.chap06.sec06.study;

public class Computer {
	public static void main(String[] args) {
		ComputerExam pc = new ComputerExam(0, 16);
	}
}

class ComputerExam {
	public final String[] osType = { "����7", "���� OS X", "�ȵ���̵�" };
	int memory;

	ComputerExam(int os, int memory) {

		this.memory = memory;
	}

}