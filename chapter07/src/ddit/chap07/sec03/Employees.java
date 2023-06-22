package ddit.chap07.sec03;

public class Employees {
	protected long empId;
	protected String empName;
	protected int salary;

	public Employees() {
	}

	Employees(long empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public void getInfo() {
		System.out.println("==================");
		System.out.println("사원번호: " + empId);
		System.out.println("이름: " + empName);
		System.out.println("급여: " + calcSalary());
	}

	public int calcSalary() {
		return salary;
	}
}
