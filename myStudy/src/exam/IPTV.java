package exam;

public class IPTV extends ColorTV {
	String idAdd;

	IPTV(String idAdd, int size, int resolution) {
		super(size, resolution);
		this.idAdd = idAdd;
	}

	@Override
	public void printProperty() {
		// System.out.println("나의 IPTV는 " + idAdd + " 주소의 " + super.getSize() + "인치 " +
		// super.getResolution() + "컬러");
		System.out.print("나의 IPTV는  " + idAdd + " 주소의 ");
		super.printProperty();
	}
}
