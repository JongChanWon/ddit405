package ddit.chap07.sec08;

public class HttpServletExample {
	public static void main(String[] args) {
		init(new LoginServlet());
		init(new FileDownloadServlet());
		
		// 부모클래스 타입에 저장되어지는것(그 변수. 하면 부모메서드, 부모 변수만 가져올 수 있따, 자식클래스 껄 가져오려면 오버라이딩 되어있어야함)
	}
	
	public static void init(HttpServlet servlet) {
		servlet.service();
	}
}
