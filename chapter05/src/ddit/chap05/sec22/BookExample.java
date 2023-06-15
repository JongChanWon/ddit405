package ddit.chap05.sec22;

public class BookExample {
	public static void main(String[] args) {
//		Book[] b = new Book[3];
//		b[0]=new Book("왕초보영어","EBS",15000);
//		b[1]=new Book("경제 인문학","박정호",30000);
//		b[2]=new Book("소크라테스 변론","강유원",10000);

		Book[] b = { new Book("왕초보영어", "EBS", 15000), new Book("경제 인문학", "박정호", 30000),
				new Book("소크라테스 변론", "강유원", 10000) };

		for (Book x : b) {
			System.out.println("=================");
			System.out.println(x);
		}
	}
}

class Book {
	// 외부에서 접근하는것을 막기 위해 private을 쓴다
	private String title;
	private String writer;
	private int price;

	public Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	@Override
	public String toString() {
		return "책명: " + title + "\n작가: " + writer + "\n가격: " + price;
	}
}