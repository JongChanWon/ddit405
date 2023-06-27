package ddit.chapter10.sec01;

public class DBConnectExample {
	public static void main(String[] args) {
		DBConnect dbconn = DBConnect.getInstance();
		dbconn.connect();
	}
}
