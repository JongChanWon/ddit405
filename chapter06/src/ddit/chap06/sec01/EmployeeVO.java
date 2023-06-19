package ddit.chap06.sec01;

// super(): 부모클래스의 메서드

// 예제2] 사원번호(문자열), 사원명(문자열), 소속부서코드(정수형), 급여(정수형) 정보를 갖고있는 사원클래스 생성
public class EmployeeVO {
	private String empId;
	private String empName;
	private int deptId;
	private int salary;

// 직접접근 불가능 (외부에서)
	public EmployeeVO() {
	}

	// this: 내 클래스의 주소를 갖는 변수, 특수 참조형 변수
	// this(): 생성자 메서드 안에서만 쓰일 수 있음 (한 생성자에서 다른 생성자를 호출 할때) 제일 위에 써줘야함
	EmployeeVO(String empId, String empName, int deptId, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.salary = salary;

	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() { // Object 가 갖고 있는 toString()메서드를 재정의 해서 쓰겠다~~ 라고 해서 override
		return "사원번호: " + empId + "\n사원명: " + empName + "\n부서코드: " + deptId + "\n급여: " + salary;
	}
}
