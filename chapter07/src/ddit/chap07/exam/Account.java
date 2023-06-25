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

	public long deposit(long amount) { // �Ա�
		System.out.println("�Ա��� �ݾ�: " + amount + "��");
		balance += amount;
		return balance;
	}

	public long withdraw(long amount) { // ���
		if (amount > balance) {
			System.out.println("�ܾ��� �����Ͽ� " + amount + "�� �� ����� �� �����ϴ�\n������ �ݾ�: " + (amount-balance) + "��");
			return balance;
		} else {
			System.out.println("����� �ݾ�: " + amount + "��");
			balance -= amount;
			return balance;
		}

	}

	public void printBalance() {
		System.out.println(owner + "���� �ܾ�: " + balance + "��");
	}
}
