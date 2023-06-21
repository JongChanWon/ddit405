package ddit.chap07.sec01;

public class Tv extends Goods {

	Tv() { // 부모클래스를 상속 받을 때 부모클래스에 기본생성자가 없으면 자식클래스에서 기본생성자를 생성할 수 없다 왜냐면 super()를 자식클래스의
			// 기본생성자에서 받아야하는데 받아야할 공간이 없기 때문에

	}

	Tv(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "ThinQ TV";
	}

}
