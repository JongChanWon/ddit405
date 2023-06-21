package ddit.chap07.sec02;

public class SendMessageExample {
	public static void main(String[] args) {
		SendMessage sm = new SendMessage("plumpjc@naver.com", "fdsf@gmail.com", "집가고싶다");
		System.out.println(sm);
		KaKaoSend kk = new KaKaoSend("sss", "rrr", "집가자", "제목");
		kk.sendMessage();
	}
}
