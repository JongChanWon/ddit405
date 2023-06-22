package ddit.chap07.sec03;

public class RegularEmployee extends Employees {
	private int bonus;
	private String jobTitle;
	private int totalSalaryPerYear;

	RegularEmployee(long empId, String empName, int bonus, String jobTitle, int totalSalaryPerYear) {
		super(empId, empName);
		this.bonus = bonus;
		this.jobTitle = jobTitle;
		this.totalSalaryPerYear = totalSalaryPerYear;

	}

	public void getInfo() {
		super.getInfo();
		System.out.println("직위: " + jobTitle);
		System.out.println("보너스: " + bonus);
	}

	public int calcSalary() {
		return (totalSalaryPerYear + bonus) / 12;
	}

}
//생성자는 메서드 area
// 부모타입 변수 = new 자식클래스
// 변수.메서드명 ==> 부모클래스에 있는 메서드만 호출 한다 근디 자식클래스에 상속된 메서드가 있으면 상속된 메서드가 호출된다
// 접근지정자가 적어도 부모클래스보다 넓거나 같아야함