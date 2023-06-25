package ddit.chap07.exam;

/*문제 4 – 정수형 원점의 좌표(x,y)와 실수 타입의 가로와 세로를 입력받아 사각형을 만드는 클래스를 설계하고, 
3 개의 사각형을 만든 뒤 첫 번째 사각형에 나머지 두 개의 사각형이 포함되었는지 여부를 판단할 수 있는 메서 드를 포함시키시오.*/

public class Rectangle {
	private int x, y;
	private double width, length;

	Rectangle() {
	}

	Rectangle(int x, int y, double width, double length) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
		System.out.println("초기좌표-> x: " + x + ", y: " + y); // 초기 좌표
	}

	// 면적을 통해 사각형 생성
	public void getVolume() {
		System.out.println("면적: " + width * length);
		
		System.out.println("x좌표: " + (x += width) + " y좌표: " + (y += length));
		System.out.println("가로: " + width + "\n세로: " + length + "\n사각형이 생성되었습니다");

	}

}
