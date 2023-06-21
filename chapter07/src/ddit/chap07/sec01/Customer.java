package ddit.chap07.sec01;

// 다형성: 부모클래스에서 정의된 매서드만 실행
// upCasting, downCasting
public class Customer {
	private int sum;
	private int bonusPoint;
	private String items = "";

	public void buy(Goods goods) {
		sum += goods.price;
		bonusPoint += goods.bonusPoint;
		items += goods + ", "; // toString 매서드 호출
	}

	public void summary() {
		System.out.println("구매합계: " + sum);
		System.out.println("보너스포인트: " + bonusPoint);
		System.out.println("구매 List: " + items);
	}
}
