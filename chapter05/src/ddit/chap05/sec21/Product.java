package ddit.chap05.sec21;

public class Product {
	private int price; // �ܰ�
	private int bonusPoint; // ��ǰ �ǸŰ��� 1%

	Product() {// Ŭ������ 1�� �̻��� �����ڰ� �־����
		// �⺻�����ڴ� ������ ������ �ڹٹ����ӽ���..
		// ����ڰ� �ʿ��� �����ڸ� ���鶧 �⺻�����ڴ� �⺻������ �־����
	}

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price * 0.01);
	}
}
