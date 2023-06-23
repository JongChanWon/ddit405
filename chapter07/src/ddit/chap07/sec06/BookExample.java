package ddit.chap07.sec06;

public class BookExample {
	public static void main(String[] args) {
		BookExample.sc(); // static �޼���

//		Book book = new Book();
//		Book book1 = new Book("���� 2����", "�踲���ǻ�");

		Book b = new Novel("���� 2����", "�踲���ǻ�", "SF�������"); // ������ �ʱ�ȭ
		Book c = new MajorBook("Operating System Concepts 6/E", "JOHN WILEY & SONS, INC", "Computer Science", 15000);

		b.getBookInfo(); // �θ�Ŭ������ �޼��尡 �ҷ����� ������ �ڽ�Ŭ������ getBookInfo�� �������̵� �Ǿ����� �� �޼��尡 �Ҹ��� ���°� ������!
		System.out.println("������ : " + b.owner); // ������ �θ� ȣ���

		c.getBookInfo();
		System.out.println("������ : " + c.owner);

		// �ڽ�Ŭ���� ���� �ҷ��÷��� ����ȯ �������
		if (b instanceof Novel) {
			Novel n = (Novel) b;
			System.out.println("������ : " + n.getOwner());
		}

		if (c instanceof MajorBook) {
			MajorBook mb = (MajorBook) c;
			System.out.println("������ : " + mb.getOwner());
		}
	}

	static void sc() {
		System.out.println("scv ����");
	}
}
