package ddit.chap07.sec02;

public class EmailSend extends SendMessage {

	EmailSend(String sender, String receiver, String content) {
		super(sender, receiver, content);

	}

	public void sendMessage() {
		System.out.println(sender + "����" + receiver + "����" + content + "������ �����ϴ�");
	}

	public void receiveMessage() {
		System.out.println("�޽����� �����ϴ�");
	}
}
