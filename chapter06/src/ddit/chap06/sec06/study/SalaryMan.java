package ddit.chap06.sec06.study;

public class SalaryMan {
	int salary = 1000000;

	SalaryMan() {
	}

	SalaryMan(int salary) {
		this.salary = salary; // �� �޿���
	}

	public int getAnnualGross() {
		salary *= 5;
		return salary;
	}

}
