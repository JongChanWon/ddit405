package ddit.chap06.sec04;

/* �̱��� �������: ����, ��ü�� ������ ������ �޸� ������ �Ҵ�޾ƾ� �Ѵ�. ������ �ѹ��� new�� ���� ��ü�� �����Ѵٸ� �޸� ���� ������ �� �ִ�.
���� �̱������� ������ �ν��Ͻ��� '����'�̹Ƿ�, �ٸ� Ŭ������ �ν��Ͻ����� �����͸� �����ϴ� ���� ������ ������ �ִ�.*/
public class AccountExample {
	public static void main(String[] args) {

		// Account account = new Account(); private�� �ܺο��� ��ü���� �Ұ�
		Account account1 = Account.getInstance();
		Account account2 = Account.getInstance();

		System.out.println("account1 = " + account1);
		System.out.println("account2 = " + account2);

	}
}
