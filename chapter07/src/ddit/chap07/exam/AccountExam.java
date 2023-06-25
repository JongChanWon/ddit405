package ddit.chap07.exam;

public class AccountExam {
	
	public static void main(String[] args) {
		Account account = new Account();
		account.setOwner("원종찬");
		account.setBalance(1000000); // 초기금액 설정
		
		account.deposit(10000);// 입금액
		account.printBalance();
		System.out.println();
		account.withdraw(1020000);// 출금액
		account.printBalance();
		
	}
}
