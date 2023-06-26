package ddit.chap07.sec08;

public class Sparrow extends Animal{
	// 추상메서드를 오버라이딩 하지 않으르면 상속받은 자식 클래스도 추상클래스여야 한다
	Sparrow(String kind){
		super(kind);
	}
	
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}
