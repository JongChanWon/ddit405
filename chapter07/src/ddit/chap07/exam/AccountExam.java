package ddit.chap07.exam;

public class AccountExam {
	
	public static void main(String[] args) {
		Account account = new Account();
		account.setOwner("������");
		account.setBalance(1000000); // �ʱ�ݾ� ����
		
		account.deposit(10000);// �Աݾ�
		account.printBalance();
		System.out.println();
		account.withdraw(1020000);// ��ݾ�
		account.printBalance();
		
	}
}
