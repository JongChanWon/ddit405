package ddit.chap07.exam;

public class Student {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(1809049, "������а�");
		si.printInfo();

		System.out.println();

		StudentInfo si2 = new StudentInfo();
		si2.setStdId(23959112);
		si2.setDeptName("��ǻ�Ͱ��а�");
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
		System.out.println("�й�: " + stdId + "\n�а�: " + deptName);
	}

}