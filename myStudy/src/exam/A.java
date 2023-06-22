package exam;

public class A {
	private int a;

	public void set(int a) {
		this.a = a;
	}
}

class B extends A {
	protected int b, c;

}

class c extends B {
	public int d, e;
}