package ddit.chap07.sec06;

public class Novel extends Book {
	private String genre;
	private String owner = "이순신";

	Novel(String title, String publisher, String genre) {
		super(title, publisher);
		this.genre = genre;
	}

	public String getOwner() {
		return owner;
	}

	@Override
	void getBookInfo() {
		System.out.println("장르: " + genre);
		System.out.println("제목: " + this.title);
		System.out.println("출판사: " + this.publisher);
		System.out.println();
	}
}
