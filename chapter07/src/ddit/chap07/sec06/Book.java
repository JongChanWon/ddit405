package ddit.chap07.sec06;

public class Book {
	public String title;
	public String publisher;
	public String owner = "홍길동";

	Book() {
	}

	Book(String title, String publisher) {
		this.title = title;
		this.publisher = publisher;
	}

	void getBookInfo() {
		System.out.println("제목: " + title);
		System.out.println("출판사: " + publisher);
		System.out.println();
	}
}
