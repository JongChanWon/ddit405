package ddit.chap07.sec01;

// ������: �θ�Ŭ�������� ���ǵ� �ż��常 ����
// upCasting, downCasting
public class Customer {
	private int sum;
	private int bonusPoint;
	private String items = "";

	public void buy(Goods goods) {
		sum += goods.price;
		bonusPoint += goods.bonusPoint;
		items += goods + ", "; // toString �ż��� ȣ��
	}

	public void summary() {
		System.out.println("�����հ�: " + sum);
		System.out.println("���ʽ�����Ʈ: " + bonusPoint);
		System.out.println("���� List: " + items);
	}
}
