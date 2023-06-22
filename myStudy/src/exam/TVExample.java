package exam;

public class TVExample {
	public static void main(String[] args) {
//		ColorTV myTV = new ColorTV(32, 1024);
//		myTV.printProperty();
		IPTV ipTv = new IPTV("192.1.1.2", 32, 2048);
		ipTv.printProperty();
	}
}
