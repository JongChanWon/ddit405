package ddit.chap07.sec06;

public class MajorBook extends Book {
	private String major;
	private int price;
	private String owner = "정몽주";

	MajorBook(String title, String publisher, String major, int price) {
		super(title, publisher);
		this.major = major;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	@Override
	void getBookInfo() {
		System.out.println("전공분야: " + major);
		super.getBookInfo();
		System.out.println("가격: " + price);

	}
}
