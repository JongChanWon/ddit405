package ddit.chap07.sec06;

public class Book {
	public String title;
	public String publisher;
	public String owner = "ȫ�浿";

	Book() {
	}

	Book(String title, String publisher) {
		this.title = title;
		this.publisher = publisher;
	}

	void getBookInfo() {
		System.out.println("����: " + title);
		System.out.println("���ǻ�: " + publisher);
		System.out.println();
	}
}
