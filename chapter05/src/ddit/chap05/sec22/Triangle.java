package ddit.chap05.sec22;

public class Triangle {
	Point p1 = new Point();
//	Point p2 = new Point(200, 0);
//	Point p3 = new Point(100, 300);

	Point[] p = { new Point(), new Point(200, 0), new Point(100, 300) };

	public void drawShape() {
		System.out.println("시작점의 좌표" + p[0]); // .toString이 생략된거임
		System.out.println("두번째 꼭지점은 " + p[1]);
		System.out.println("세번째 꼭지점은 " + p[2]);

		System.out.println("시작점의 좌표" + p[0].x + ", " + p[0].y); // .toString이 생략된거임
		System.out.println("두번째 꼭지점은 (" + p[1].x + ", " + p[1].y + ")");
		System.out.println("세번째 꼭지점은 (" + p[2].x + ", " + p[2].y + ")");
	}
}
