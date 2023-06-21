package ddit.chap07.sec02;

public class SendMessage {
	String sender;
	String receiver;
	String content;

	public SendMessage(String sender, String receiver, String content) {
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}

	public void sendMessage() {
		System.out.println(sender + "����" + receiver + "����" + content + "������ �����ϴ�");
	}

	public void receiveMessage() {
		System.out.println(receiver + "�Բ��� �޽����� �����ϼ̽��ϴ�");
	}

	@Override
	public String toString() {
		return "SendMessage \n[������= " + sender + "\n�޴���= " + receiver + "\n����= " + content + "]";
	}

}
