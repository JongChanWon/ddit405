package ddit.chap07.exam;

/*���� 12 -������ �����ϴ� Ŭ���� Rectangle�� �ۼ��Ͻÿ�.
�� �簢���� ���ο� ���η� ��ü�� �����ϴ� ������
�� ������ ��ȯ�ϴ� �޼ҵ� getArea(), �ѷ��� ��ȯ�ϴ� �޼ҵ� getCircumference(),
�� ������ ���� Ŭ���� Rectangle �̿�

Rectangle rc =newRectangle(3.82, 8.65);
System.out.println("����: "+ rc.getArea());
System.out.println("�ѷ�: "+ rc.getCircumference());*/

public class Rectangle12 {
	public static void main(String[] args) {
		RectangleInfo rc = new RectangleInfo(3.82, 8.65);
		System.out.println("����: " + rc.getArea());
		System.out.println("�ѷ�: " + rc.getCircumference());
	}
}

class RectangleInfo{
	private double width; // ����
	private double length; // ����

	RectangleInfo(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getArea() { // �������ϴ� �޼���
		return width*length;
	}
	
	public double getCircumference() {
		return (width*length)*2;
	}
}