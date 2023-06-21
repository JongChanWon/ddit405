package ddit.chap07.sec02.homework;

public class StudentExample {
	public static void main(String[] args) {
		Student st = new Student("won", 11, 55, 66, 77);
		st.calculateScore();
		st.printScore(st);
	}
}
