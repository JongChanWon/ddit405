package ddit.chap06.sec06.study;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student();
//		int stdNo = student.stdNo = 1809049;
//		String dept = student.dept = "영어영문학과";

		student.setStdNo(1809049);
		student.setDept("영어영문학과");

		int stdNo = student.getStdNo();
		String dept = student.getDept();

		System.out.println("학번: " + stdNo + "\n학과: " + dept);

	}
}
