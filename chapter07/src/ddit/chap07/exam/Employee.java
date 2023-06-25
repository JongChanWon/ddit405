package ddit.chap07.exam;

public class Employee {
	int empId; // 사번
	String ename;// 이름
	String dept;// 부서
	String position; // 직급
	int age; // 나이
	String gender; // 성별
	int yearSalary; // 연봉
	String phoneNum; // 전화번호
	String addr; // 주소

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

	// 월급 계산
	public int salaryInfo() {
		int salary = (int) ((yearSalary/12) - (yearSalary / 12) * 0.08); // 월급 (매달 세금으로 8%를 빼고 수령)
		return salary;
	}

	// 연봉 협상 최대 2.5%
	public int salaryNego() {
		int maxSalary = (int) (yearSalary * 0.025);

		return maxSalary;
	}
	
	// 직원 정보 출력
	public void printEmpInfo() {
		System.out.println("이름: " + ename + "\n부서: " + dept + "\n직급: " + position + "\n연봉: " + yearSalary);
	}
}
