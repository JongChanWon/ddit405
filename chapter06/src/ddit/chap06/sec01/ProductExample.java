package ddit.chap06.sec01;

public class ProductExample {
	public static void main(String[] args) {
		Product p1 = new Product(); // �����ڿ� pid++;�� �߱⶧���� �̹� ��ü �����Ǹ鼭 1�� �ʱ�ȭ ��
		System.out.println("pid(p1)= " + Product.pid);
		Product p2 = new Product();
		System.out.println("pid(p2)= " + Product.pid);
		Product p3 = new Product();
		System.out.println("pid(p3)= " + Product.pid);

	}
}

class Product {
	static int pid;

	Product() {
		pid++;
	}
}