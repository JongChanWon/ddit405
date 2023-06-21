package ddit.chap07.sec02;

public class LetterSend extends SendMessage {

	LetterSend(String sender, String receiver, String content) {
		super(sender, receiver, content);

	}

	public void sendMessage() {
		System.out.println(sender + "님이" + receiver + "에게" + content + "내용을 보냅니다");
	}

	public void receiveMessage() {
		System.out.println("메시지를 수신하다");
	}
}
