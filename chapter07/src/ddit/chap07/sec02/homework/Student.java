package ddit.chap07.sec02.homework;

/*����1]

�θ�Ŭ����- ���Ŭ����( Person )
	   	 �Ӽ�: �̸�(name), ����(age)
	   	 �޼���: ������ �� �̸��� ����ϴ� �޼���( getName() )

�ڽ�Ŭ����- �л�Ŭ����(Student)
	          �Ӽ�: ����(kor), ����(eng), ����(mat) ����
	          �޼���: ������, ������ ����� ���ϴ� �޼��� ( calculateScore() )
		 ����ǥ�� ����ϴ� �޼���( printScore() ) - �θ�Ŭ���� getName() ���*/
public class Student extends Person {
	int kor;
	int eng;
	int mat;

	Student() {
	}

	Student(String name, int age, int kor, int eng, int mat) {

		super(name, age);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}

	public void calculateScore() {
		int sum = 0;
		double avg = 0;
		sum = kor + eng + mat;
		avg = (double) (sum / 3);
	}

//	public int calculateScore() {
//		int sum = kor + eng + mat;
//		return sum;
//	}

	public void printScore(Person person) {
		person.getName();
		System.out.println("����ǥ");
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		calculateScore();
	}
}
