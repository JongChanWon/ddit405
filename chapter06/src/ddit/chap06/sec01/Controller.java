package ddit.chap06.sec01;

public class Controller {
	public static void main(String[] args) {
		new Controller().init();

	}

	public void init() {
		EmployeeVO empVO = new EmployeeVO("r230101", "박길동", 30, 50000); // 객체 생성
		System.out.println(empVO.toString()); // .toString()이 생략된 형태 (Object가 갖고있는 메서드 이기때문에 toString이 없을때는 16진수 형태로
												// 출력됨)

		// 학생 클래스 출력
		StudentVO stdVO = new StudentVO(1809049, "원종찬", "영어영문학과");
		System.out.println(stdVO);

	}
}
