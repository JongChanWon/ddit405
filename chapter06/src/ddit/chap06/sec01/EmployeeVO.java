package ddit.chap06.sec01;

// super(): �θ�Ŭ������ �޼���

// ����2] �����ȣ(���ڿ�), �����(���ڿ�), �ҼӺμ��ڵ�(������), �޿�(������) ������ �����ִ� ���Ŭ���� ����
public class EmployeeVO {
	private String empId;
	private String empName;
	private int deptId;
	private int salary;

// �������� �Ұ��� (�ܺο���)
	public EmployeeVO() {
	}

	// this: �� Ŭ������ �ּҸ� ���� ����, Ư�� ������ ����
	// this(): ������ �޼��� �ȿ����� ���� �� ���� (�� �����ڿ��� �ٸ� �����ڸ� ȣ�� �Ҷ�) ���� ���� �������
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
	public String toString() { // Object �� ���� �ִ� toString()�޼��带 ������ �ؼ� ���ڴ�~~ ��� �ؼ� override
		return "�����ȣ: " + empId + "\n�����: " + empName + "\n�μ��ڵ�: " + deptId + "\n�޿�: " + salary;
	}
}
