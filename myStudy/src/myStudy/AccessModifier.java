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

	// myStudy ��Ű�� ���ο����� ���� ia,ib,ic�� �����Ӱ� ������ �� ������ id�� �ܺο��� ����x
	// AccessModifier Ŭ������ ���� ��Ű�� �������� public, protected, default�� ���� ȿ��
	// AccessModifier�� ��ӹ��� �ڽ�Ŭ���������� ia,ib,ic�� ���� �����ϴ�

}
