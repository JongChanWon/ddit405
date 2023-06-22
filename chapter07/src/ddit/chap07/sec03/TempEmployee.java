package ddit.chap07.sec03;

public class TempEmployee extends Employees {
	int workingHoursPerMonth;
	int payAnHourly;

	TempEmployee(long empId, String empName, int payAnHourly, int workingHoursPerMonth) {
		super(empId, empName);
		this.payAnHourly = payAnHourly;
		this.workingHoursPerMonth = workingHoursPerMonth;
		salary = payAnHourly * workingHoursPerMonth;
	}

	public void getInfo() {
		super.getInfo();
		System.out.println("근무시간: " + workingHoursPerMonth);

	}

}
