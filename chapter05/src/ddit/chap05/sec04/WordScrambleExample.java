package ddit.chap05.sec04;

// 5개의 단어 중 임의의 한단어를 선택하여 단어 내부의 철자들을 섞어 제시한다.
// 사용자는 제시된 철자를 보고 원래의 단어를 맞추는 게임으로 시도횟수도 출력.
public class WordScrambleExample {
	public static void main(String[] args) {
		WordScramble ws = new WordScramble();
		ws.init();
	}
}