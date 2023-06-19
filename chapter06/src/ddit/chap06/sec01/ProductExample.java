package ddit.chap06.sec01;

public class ProductExample {
	public static void main(String[] args) {
		Product p1 = new Product(); // 생성자에 pid++;을 했기때문에 이미 객체 생성되면서 1로 초기화 됨
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