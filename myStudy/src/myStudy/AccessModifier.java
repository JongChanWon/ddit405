package myStudy;

public class AccessModifier {
	public int ia;
	protected int ib;
	int ic;
	private int id;

	public static int ie;
	protected static int ig;
	private static int ih = 3;
	private static int ii;
	public static int getIh() {
		return ih;
	}
	public static void setIh(int ih) {
		AccessModifier.ih = ih;
	}

//	public AccessModifier() {
//
//	}
//
//	public AccessModifier(int ia, int ib, int ic, int id) {
//		super();
//		this.ia = ia;
//		this.ib = ib;
//		this.ic = ic;
//		this.id = id;
//	}

	// myStudy 패키지 내부에서는 변수 ia,ib,ic를 자유롭게 접근할 수 있지만 id는 외부에서 접근x
	// AccessModifier 클래스는 같은 패키지 내에서는 public, protected, default가 같은 효과
	// AccessModifier를 상속받은 자식클래스에서도 ia,ib,ic는 접근 가능하다

}
