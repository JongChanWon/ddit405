package ddit.chap07.exam;

public class EmployeeExam {
	public static void main(String[] args) {
		Employee emp = new Employee(42385, "È«±æµ¿", "°³¹ßÆÀ", "ºÎÀå", 30000000);
		emp.printEmpInfo();
		int salary = emp.salaryInfo();
		int yearSalaryNego = emp.salaryNego();
//		emp.setYearSalary(1000000);
		System.out.println("¿ù±Þ: " + salary);
		System.out.println("Çù»ó ±Ý¾×: " + yearSalaryNego);

	}
}
