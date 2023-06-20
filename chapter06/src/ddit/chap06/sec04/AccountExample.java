package ddit.chap06.sec04;

/* 싱글톤 사용이유: 먼저, 객체를 생성할 때마다 메모리 영역을 할당받아야 한다. 하지만 한번의 new를 통해 객체를 생성한다면 메모리 낭비를 방지할 수 있다.
또한 싱글톤으로 구현한 인스턴스는 '전역'이므로, 다른 클래스의 인스턴스들이 데이터를 공유하는 것이 가능한 장점이 있다.*/
public class AccountExample {
	public static void main(String[] args) {

		// Account account = new Account(); private라서 외부에서 객체생성 불가
		Account account1 = Account.getInstance();
		Account account2 = Account.getInstance();

		System.out.println("account1 = " + account1);
		System.out.println("account2 = " + account2);

	}
}
