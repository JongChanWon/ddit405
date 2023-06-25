package ddit.chap07.exam;

public class Employee {
	int empId; // ���
	String ename;// �̸�
	String dept;// �μ�
	String position; // ����
	int age; // ����
	String gender; // ����
	int yearSalary; // ����
	String phoneNum; // ��ȭ��ȣ
	String addr; // �ּ�

	Employee() {

	}

	Employee(int empId, String ename, String dept, String position, int yearSalary) {
		this.empId = empId;
		this.ename = ename;
		this.dept = dept;
		this.position = position;
		this.yearSalary = yearSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYearSalary() {
		return yearSalary;
	}

	public void setYearSalary(int yearSalary) {
		this.yearSalary = yearSalary;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	// ���� ���
	public int salaryInfo() {
		int salary = (int) ((yearSalary/12) - (yearSalary / 12) * 0.08); // ���� (�Ŵ� �������� 8%�� ���� ����)
		return salary;
	}

	// ���� ���� �ִ� 2.5%
	public int salaryNego() {
		int maxSalary = (int) (yearSalary * 0.025);

		return maxSalary;
	}
	
	// ���� ���� ���
	public void printEmpInfo() {
		System.out.println("�̸�: " + ename + "\n�μ�: " + dept + "\n����: " + position + "\n����: " + yearSalary);
	}
}
