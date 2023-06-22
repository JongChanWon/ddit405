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
		System.out.println("�����ȣ: " + empId);
		System.out.println("�̸�: " + empName);
		System.out.println("�޿�: " + calcSalary());
	}

	public int calcSalary() {
		return salary;
	}
}
