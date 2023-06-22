package exam;

public class IPTV extends ColorTV {
	String idAdd;

	IPTV(String idAdd, int size, int resolution) {
		super(size, resolution);
		this.idAdd = idAdd;
	}

	@Override
	public void printProperty() {
		// System.out.println("���� IPTV�� " + idAdd + " �ּ��� " + super.getSize() + "��ġ " +
		// super.getResolution() + "�÷�");
		System.out.print("���� IPTV��  " + idAdd + " �ּ��� ");
		super.printProperty();
	}
}
