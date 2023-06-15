package ddit.chap05.sec22;

public class Point { // ���� ���� Ŭ������ ���� ���� objectŬ����
	int x;
	int y;

	Point() { // �������� ����Ʈ
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

	@Override // @������ �Ǿ����� �ּ� , �θ�Ŭ������ ������ �ϰڴٴ°�(override)
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
