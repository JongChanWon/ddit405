package ddit.chap07.sec09;

public class Tire {
	public int maxRotation; // �ִ�ȸ����(����)
	public int accmulateRotation; // ����ȸ����(��뷮)
	public String location; // ��ġ

	Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation < maxRotation) {
			System.out.println(location + "tire�� ����: " + (maxRotation-accmulateRotation));
			return true;
		}else {
			System.out.println(location+ "tire ��ü���");
			return false;
		}
	}
}
class KumhoTire{
	
}
