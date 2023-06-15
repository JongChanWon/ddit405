package ddit.chap05.sec22;

public class Point { // 내가 만든 클래스의 가장 위는 object클래스
	int x;
	int y;

	Point() { // 오리지널 포인트
		this.x = 0;
		this.y = 0;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override // @컴파일 되어지는 주석 , 부모클래스를 재정의 하겠다는것(override)
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
