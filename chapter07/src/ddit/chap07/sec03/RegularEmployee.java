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
		System.out.println("����: " + jobTitle);
		System.out.println("���ʽ�: " + bonus);
	}

	public int calcSalary() {
		return (totalSalaryPerYear + bonus) / 12;
	}

}
//�����ڴ� �޼��� area
// �θ�Ÿ�� ���� = new �ڽ�Ŭ����
// ����.�޼���� ==> �θ�Ŭ������ �ִ� �޼��常 ȣ�� �Ѵ� �ٵ� �ڽ�Ŭ������ ��ӵ� �޼��尡 ������ ��ӵ� �޼��尡 ȣ��ȴ�
// ���������ڰ� ��� �θ�Ŭ�������� �аų� ���ƾ���