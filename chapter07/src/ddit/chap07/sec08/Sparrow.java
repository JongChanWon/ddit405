package ddit.chap07.sec08;

public class Sparrow extends Animal{
	// �߻�޼��带 �������̵� ���� �������� ��ӹ��� �ڽ� Ŭ������ �߻�Ŭ�������� �Ѵ�
	Sparrow(String kind){
		super(kind);
	}
	
	@Override
	public void sound() {
		System.out.println("±±");
	}
}
