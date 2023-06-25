package ddit.chap07.exam;

public class Account {
	private String owner;
	private long balance;

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

	public long deposit(long amount) { // 입금
		System.out.println("입금한 금액: " + amount + "원");
		balance += amount;
		return balance;
	}

	public long withdraw(long amount) { // 출금
		if (amount > balance) {
			System.out.println("잔액이 부족하여 " + amount + "원 을 출금할 수 없습니다\n부족한 금액: " + (amount-balance) + "원");
			return balance;
		} else {
			System.out.println("출금한 금액: " + amount + "원");
			balance -= amount;
			return balance;
		}

	}

	public void printBalance() {
		System.out.println(owner + "님의 잔액: " + balance + "원");
	}
}
