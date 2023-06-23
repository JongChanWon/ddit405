package ddit.chap07.sec06;

public class Novel extends Book {
	private String genre;
	private String owner = "�̼���";

	Novel(String title, String publisher, String genre) {
		super(title, publisher);
		this.genre = genre;
	}

	public String getOwner() {
		return owner;
	}

	@Override
	void getBookInfo() {
		System.out.println("�帣: " + genre);
		System.out.println("����: " + this.title);
		System.out.println("���ǻ�: " + this.publisher);
		System.out.println();
	}
}
