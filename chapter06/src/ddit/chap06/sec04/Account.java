package ddit.chap06.sec04;

public class Account {
	private static Account instance = null; // �ش�Ŭ������ ����Ǿ��� ��ü ���������� �����������... ���ѹ�!!(static)
	// ������ �޼��� ����, getInstance�޼���(�ܺο� �����Ҽ��ִ�..), �ܺο��� ������ �� ���� ��������
	// Account �ڽ��� �ּҰ��� �����ϱ� ���� ����

	private Account() { // �ܺο��� ��ü�� ���� �� �� ����(private��..)
	}

	public static Account getInstance() {
		// �ۿ��� ��ü�� ����� �� �� ���⶧���� getInstance�� �θ��� ���ؼ� static���� �Ǿ�� Ŭ�����̸�.�޼�������� ȣ�� ����
		// ��ü ���� ���� Account�� ȣ�� �Ǿ�������
		if (instance == null)
			instance = new Account();
		return instance; // ��ȯ Ÿ���� �ڱ� Ŭ����Ÿ��
	}
}
