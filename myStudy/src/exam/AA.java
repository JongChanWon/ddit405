package exam;

public class AA {
	int x;

	public AA() {

		System.out.println("A");
	}

	public AA(int x) {
		System.out.println("A: " + x);
	}

}

class BB extends AA {
	public BB() {
		super(100);
	}

	public BB(int x) {
		System.out.println("B: " + x);
	}
}
