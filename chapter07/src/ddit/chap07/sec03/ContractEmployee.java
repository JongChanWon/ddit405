package ddit.chap07.sec03;

public class ContractEmployee extends Employees {
	String startDate;
	String period;
	int contractSalary;

	ContractEmployee() {
	}

	ContractEmployee(long empId, String empName, String startDate, String period, int contractSalary) {
		super(empId, empName);
		this.startDate = startDate;
		this.period = period;
		this.contractSalary = contractSalary;
		salary = contractSalary / 12;
	}

	public void getInfo() {
		super.getInfo();
		System.out.println("시작일: " + startDate);
		System.out.println("계약기간  " + period);
	}

}
