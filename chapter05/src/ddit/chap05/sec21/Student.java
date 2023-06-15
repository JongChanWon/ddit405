package ddit.chap05.sec21;

public class Student {
	// 이름, 나이, 성별
	// 힙영역에 위치함
	private String name; // 현 클래스 내부에서만 접근 가능
	private int age;
	private boolean gender;

	// 매개변수를 통해서 클래스 밖에서 가져와야 변수값을 변경할 수 있다 (클래스 밖에서 가지고 올때) - setter
	// 밖으로 내보낼땐 반환값이 필요함 - getter
//	public Student(String name, int age, boolean gender) {
//		// 생성자 메서드는 멤버변수를 초기화 하기 위해 사용
//		// 파라미터로 받은 변수(지역변수)는 stack영역에 위치함
//		// new로 생성할때 잠깐 나타났다가 사라짐 (생성자 메서드) 그래서 this를 써서 안사라지게..
//		// this: 자기가 속한 클래스의 위치값 => 클래스 안 어디서든 쓸 수 있음
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
