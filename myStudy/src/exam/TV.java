package exam;

public class TV {
	private int size;

	public TV(int size) {
		this.size = size;
		System.out.println("���� TV��,, ColorTV ����Ǳ����� ������ ����Ǿ���");
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {

	private int resolution;

	ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}

	public int getResolution() {
		return resolution;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "��ġ" + resolution + "�÷�");
	}
}