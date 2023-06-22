package ddit.chap07.sec02.homework;

/*문제1]

부모클래스- 사람클래스( Person )
	   	 속성: 이름(name), 나이(age)
	   	 메서드: 생성자 및 이름을 출력하는 메서드( getName() )

자식클래스- 학생클래스(Student)
	          속성: 국어(kor), 영어(eng), 수학(mat) 성적
	          메서드: 생성자, 총점과 평균을 구하는 메서드 ( calculateScore() )
		 성적표를 출력하는 메서드( printScore() ) - 부모클래스 getName() 사용*/
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
		System.out.println("성적표");
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		calculateScore();
	}
}
