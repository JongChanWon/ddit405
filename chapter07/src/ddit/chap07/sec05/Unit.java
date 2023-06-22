package ddit.chap07.sec05;

public class Unit {
	int x = 100;
	int y = 100;
	String name;

	Unit(String name) {
		this.name = name;
	}

	public void stop() {
		System.out.println(name + "이 좌표(" + x + ", " + y + ") 에 멈춥니다");

	}

	public void move(int x, int y) {
//		System.out.println(name + "이 좌표(" + x + ", " + y + ") 로 움직였습니다");
	}
}

class Marine extends Unit {

	Marine(String name) {
		super("해병");
	}

	@Override
	public void move(int x, int y) { // 부모클래스 메서드보다 넓거나 같게 해줘야함 (접근지정자)
		System.out.println(name + "이 좌표(" + this.x + ", " + this.y + ") 에서" + "이 좌표(" + x + ", " + y + ") 로 걸어서 이동합니다");
	}

	public void stimPack() {
		System.out.println("공격모드: 스팀팩 장전");
	}

}

class Tank extends Unit {

	Tank(String name) {
		super(name);
	}

	@Override
	public void move(int x, int y) { // 부모클래스 메서드보다 넓거나 같게 해줘야함 (접근지정자)
		System.out.println(name + "이 좌표(" + this.x + ", " + this.y + ") 에서" + "이 좌표(" + x + ", " + y + ") 로 걸어서 이동합니다");
	}

	public void sizeMode() {
		System.out.println("공격모드: 시즈모드로 변환");
	}
}