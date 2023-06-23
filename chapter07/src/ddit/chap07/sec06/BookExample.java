package ddit.chap07.sec06;

public class BookExample {
	public static void main(String[] args) {
		BookExample.sc(); // static 메서드

//		Book book = new Book();
//		Book book1 = new Book("해저 2만리", "계림출판사");

		Book b = new Novel("해저 2만리", "계림출판사", "SF공상과학"); // 생성자 초기화
		Book c = new MajorBook("Operating System Concepts 6/E", "JOHN WILEY & SONS, INC", "Computer Science", 15000);

		b.getBookInfo(); // 부모클래스의 메서드가 불려져야 하지만 자식클래스의 getBookInfo가 오버라이딩 되어져서 그 메서드가 불리어 지는게 다형성!
		System.out.println("소유자 : " + b.owner); // 변수는 부모께 호출됨

		c.getBookInfo();
		System.out.println("소유자 : " + c.owner);

		// 자식클래스 변수 불러올려면 형변환 해줘야함
		if (b instanceof Novel) {
			Novel n = (Novel) b;
			System.out.println("소유자 : " + n.getOwner());
		}

		if (c instanceof MajorBook) {
			MajorBook mb = (MajorBook) c;
			System.out.println("소유자 : " + mb.getOwner());
		}
	}

	static void sc() {
		System.out.println("scv 고우썰");
	}
}
