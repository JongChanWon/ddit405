package ddit.chap07.sec02;

public class KaKaoSend extends SendMessage {

	String subject;

	KaKaoSend(String sender, String receiver, String content, String subject) {
		super(sender, receiver, content);

		this.subject = subject;

	}

	public void sendMessage() {
		System.out.println(sender + "��\n" + subject);
	}

	public void receiveMessage() {
		System.out.println("�޽����� �����ϴ�");
	}
}
