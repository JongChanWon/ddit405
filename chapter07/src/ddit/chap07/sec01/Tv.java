package ddit.chap07.sec01;

public class Tv extends Goods {

	Tv() { // �θ�Ŭ������ ��� ���� �� �θ�Ŭ������ �⺻�����ڰ� ������ �ڽ�Ŭ�������� �⺻�����ڸ� ������ �� ���� �ֳĸ� super()�� �ڽ�Ŭ������
			// �⺻�����ڿ��� �޾ƾ��ϴµ� �޾ƾ��� ������ ���� ������

	}

	Tv(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "ThinQ TV";
	}

}
