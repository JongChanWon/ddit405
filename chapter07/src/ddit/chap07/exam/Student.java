package ddit.chap07.exam;

public class Student {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(1809049, "영어영문학과");
		si.printInfo();

		System.out.println();

		StudentInfo si2 = new StudentInfo();
		si2.setStdId(23959112);
		si2.setDeptName("컴퓨터공학과");
		si2.printInfo();

	}

}

class StudentInfo {
	private int stdId;
	private String deptName;

	StudentInfo() {
	}

	StudentInfo(int stdId, String deptName) {
		this.stdId = stdId;
		this.deptName = deptName;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	void printInfo() {
		System.out.println("학번: " + stdId + "\n학과: " + deptName);
	}

}