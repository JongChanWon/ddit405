package ddit.chap06.sec01;

public class Controller {
	public static void main(String[] args) {
		new Controller().init();

	}

	public void init() {
		EmployeeVO empVO = new EmployeeVO("r230101", "�ڱ浿", 30, 50000); // ��ü ����
		System.out.println(empVO.toString()); // .toString()�� ������ ���� (Object�� �����ִ� �޼��� �̱⶧���� toString�� �������� 16���� ���·�
												// ��µ�)

		// �л� Ŭ���� ���
		StudentVO stdVO = new StudentVO(1809049, "������", "������а�");
		System.out.println(stdVO);

	}
}
