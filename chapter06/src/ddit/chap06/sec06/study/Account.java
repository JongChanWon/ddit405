package ddit.chap06.sec06.study;

public class Account {
	private String owner;
	private long balance; // 잔고

	Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long deposit(long amount) { // 예금

		return balance += amount;
	}

	public long withdraw(long amount) { // 출금

		if (amount > balance) {
			System.out.println("잔고보다 더 많이 출금 할 수 없습니다.");
		}
		return balance -= amount;
	}
}
