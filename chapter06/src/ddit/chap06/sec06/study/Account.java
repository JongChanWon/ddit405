package ddit.chap06.sec06.study;

public class Account {
	private String owner;
	private long balance; // �ܰ�

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

	public long deposit(long amount) { // ����

		return balance += amount;
	}

	public long withdraw(long amount) { // ���

		if (amount > balance) {
			System.out.println("�ܰ��� �� ���� ��� �� �� �����ϴ�.");
		}
		return balance -= amount;
	}
}
