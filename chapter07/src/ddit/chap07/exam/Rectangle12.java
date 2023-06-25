package ddit.chap07.exam;

/*문제 12 -다음을 만족하는 클래스 Rectangle을 작성하시오.
· 사각형의 가로와 세로로 객체를 생성하는 생성자
· 면적을 반환하는 메소드 getArea(), 둘레를 반환하는 메소드 getCircumference(),
· 다음과 같이 클래스 Rectangle 이용

Rectangle rc =newRectangle(3.82, 8.65);
System.out.println("면적: "+ rc.getArea());
System.out.println("둘레: "+ rc.getCircumference());*/

public class Rectangle12 {
	public static void main(String[] args) {
		RectangleInfo rc = new RectangleInfo(3.82, 8.65);
		System.out.println("면적: " + rc.getArea());
		System.out.println("둘레: " + rc.getCircumference());
	}
}

class RectangleInfo{
	private double width; // 가로
	private double length; // 세로

	RectangleInfo(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getArea() { // 면적구하는 메서드
		return width*length;
	}
	
	public double getCircumference() {
		return (width*length)*2;
	}
}