package ddit.chap06.sec06.study;

public class AccountExample {
	public static void main(String[] args) {
		Account acc = new Account("원종찬", 100000); // 기본 잔액
		System.out.println("현재 잔고: " + acc.getBalance()); // 현재잔액
		long depo = acc.deposit(1000000); // 예금 후 잔액
		System.out.println("예금 후 잔액: " + depo);
		long with = acc.withdraw(10000000);
//		System.out.println("출금 후 잔액: " + with);
//		System.out.println("남은 잔고: " + acc.getBalance());

	}
}
