package ddit.chap07.sec08;

public class HttpServletExample {
	public static void main(String[] args) {
		init(new LoginServlet());
		init(new FileDownloadServlet());
		
		// �θ�Ŭ���� Ÿ�Կ� ����Ǿ����°�(�� ����. �ϸ� �θ�޼���, �θ� ������ ������ �� �ֵ�, �ڽ�Ŭ���� �� ���������� �������̵� �Ǿ��־����)
	}
	
	public static void init(HttpServlet servlet) {
		servlet.service();
	}
}
