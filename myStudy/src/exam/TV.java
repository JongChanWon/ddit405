package exam;

public class TV {
	private int size;

	public TV(int size) {
		this.size = size;
		System.out.println("나는 TV여,, ColorTV 실행되기전에 나부터 실행되어져");
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
		System.out.println(super.getSize() + "인치" + resolution + "컬러");
	}
}