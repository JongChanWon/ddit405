package ddit.chap07.sec02;

public class SendMessageExample {
	public static void main(String[] args) {
		SendMessage sm = new SendMessage("plumpjc@naver.com", "fdsf@gmail.com", "������ʹ�");
		System.out.println(sm);
		KaKaoSend kk = new KaKaoSend("sss", "rrr", "������", "����");
		kk.sendMessage();
	}
}
