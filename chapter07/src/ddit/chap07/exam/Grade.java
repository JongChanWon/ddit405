package ddit.chap07.exam;

public class Grade {
	public static void main(String[] args) {
		GradeInfo gradeInfo = new GradeInfo(91, 83, 77);
		gradeInfo.print();
	}
}

class GradeInfo {
	int kor;
	int eng;
	int mat;

	GradeInfo(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int sum() {
		int sum = kor + eng + mat;

		return sum;
	}

	public void print() {
		int sum = sum();
		System.out.println("����: " + kor + "\n����: " + eng + "\n����: " + mat);
		System.out.println("����: " + sum() + " ���: " + (double) (sum / 3));

	}
}
