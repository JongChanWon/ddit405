package ddit.chap06.sec06.study;

public class SalaryManExample {
	public static void main(String[] args) {
//		SalaryMan sm = new SalaryMan(2000000);
//		int a = sm.salary;
//		System.out.println(a);
//		SalaryMan sm1 = new SalaryMan();
//		int b = sm1.salary;
//		System.out.println(b);

		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(4000000).getAnnualGross());

	}
}
