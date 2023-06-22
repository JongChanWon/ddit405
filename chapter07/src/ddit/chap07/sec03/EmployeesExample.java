package ddit.chap07.sec03;

import java.util.ArrayList;
import java.util.List;

public class EmployeesExample {
	public static void main(String[] args) {
		Employees[] employees = new Employees[3];
		employees[0] = new ContractEmployee(1234, "contract", "2020.01.02", "2022.01.02", 2000000);
		employees[1] = new RegularEmployee(6531, "Regular", 500000, "프로그래머", 5000000);
		employees[2] = new TempEmployee(7890, "Temp", 100, 1000);

		List<Employees> emp = new ArrayList<Employees>();
		emp.add(new ContractEmployee(1234, "contract", "2020.01.02", "2022.01.02", 2000000));
		emp.add(new RegularEmployee(6531, "Regular", 500000, "프로그래머", 5000000));
		emp.add(new TempEmployee(7890, "Temp", 100, 1000));

		for (Employees e : emp) {
			e.calcSalary();
			e.getInfo();
		}

//		Employees contract = new ContractEmployee(1234, "contract", "2020.01.02", "2022.01.02", 2000000);
//		contract.calcSalary();
//		contract.getInfo();
//		Employees regular = new RegularEmployee(6531, "Regular", 500000, "프로그래머", 5000000);
//		regular.calcSalary();
//		regular.getInfo();
//		Employees temp = new TempEmployee(7890, "Temp", 100000, 1000000);
//		temp.calcSalary();
//		temp.getInfo();

	}
}
