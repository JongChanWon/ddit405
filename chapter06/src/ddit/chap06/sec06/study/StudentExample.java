package ddit.chap06.sec06.study;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student();
//		int stdNo = student.stdNo = 1809049;
//		String dept = student.dept = "������а�";

		student.setStdNo(1809049);
		student.setDept("������а�");

		int stdNo = student.getStdNo();
		String dept = student.getDept();

		System.out.println("�й�: " + stdNo + "\n�а�: " + dept);

	}
}
