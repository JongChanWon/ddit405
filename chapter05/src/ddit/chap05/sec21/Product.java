package ddit.chap05.sec21;

public class Product {
	private int price; // 단가
	private int bonusPoint; // 상품 판매가의 1%

	Product() {// 클래스는 1개 이상의 생성자가 있어야함
		// 기본생성자는 저절로 생성함 자바버츄어머신이..
		// 사용자가 필요한 생성자를 만들때 기본생성자는 기본적으로 넣어야함
	}

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price * 0.01);
	}
}
