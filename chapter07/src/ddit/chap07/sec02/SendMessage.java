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
		System.out.println(sender + "님이" + receiver + "에게" + content + "내용을 보냅니다");
	}

	public void receiveMessage() {
		System.out.println(receiver + "님꼐서 메시지를 수신하셨습니다");
	}

	@Override
	public String toString() {
		return "SendMessage \n[보낸이= " + sender + "\n받는이= " + receiver + "\n내용= " + content + "]";
	}

}
