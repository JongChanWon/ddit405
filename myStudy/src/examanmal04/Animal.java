package examanmal04;

public abstract class Animal { // 추상클래스
	// 메서드에 중괄호가 있으면 정의를 한단 얘기
	// 그래서 abstract로 정의하지 않겠다 라고 표현
	// 추상클래스는 인스턴스를 생성할 수 없다
	// 타입으로서의 의미는 그대로 갖는다
	// 클래스 설계할때 사용
	abstract void eat();
	abstract void cry();
	abstract void move();
}
