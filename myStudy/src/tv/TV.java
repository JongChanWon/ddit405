package tv;

public class TV {
	public static void main(String[] args) {
		ColorTV mytv = new ColorTV(32, 1024);
		mytv.printProperty();
		
		IPTV iptv = new IPTV(32, 2048, "192.1.1.2");
		iptv.printProperty();
	}
}

class TVExam{
private int size;
	
	public TVExam(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TVExam{
	
	private int resolution;
	
	ColorTV(int size, int resolution){
		super(size);
		this.resolution = resolution;
	}
	protected int getResolution() {
		return resolution;
	}
	
	public void printProperty() {
		System.out.println("사이즈: " + super.getSize() + "해상도: " + getResolution());
	}
}

class IPTV extends ColorTV{
	
	private String ipAddr;
	
	IPTV(int size, int resolution, String ipAddr) {
		super(size, resolution);
		this.ipAddr = ipAddr;
	}
	
	protected String getIpAddr() {
		return ipAddr;
	}
	
	public void printProperty() {
		System.out.println(getIpAddr()+" "+super.getSize() + " " + super.getResolution());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}