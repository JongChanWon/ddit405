package ddit.chap06.sec06.study;

public class AccountExample {
	public static void main(String[] args) {
		Account acc = new Account("������", 100000); // �⺻ �ܾ�
		System.out.println("���� �ܰ�: " + acc.getBalance()); // �����ܾ�
		long depo = acc.deposit(1000000); // ���� �� �ܾ�
		System.out.println("���� �� �ܾ�: " + depo);
		long with = acc.withdraw(10000000);
//		System.out.println("��� �� �ܾ�: " + with);
//		System.out.println("���� �ܰ�: " + acc.getBalance());

	}
}
