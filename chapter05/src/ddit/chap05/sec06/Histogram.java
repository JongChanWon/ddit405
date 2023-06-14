package ddit.chap05.sec06;

public class Histogram {
	int[] dice = new int[6]; // 기본적으로 배열을 초기화 해주지 않으면 저장공간(6개의공간) 하나하나에 0이 저장됨

	public void calcDice() {
		for (int i = 0; i < 50; i++) {
			int rnd = (int) (Math.random() * 6) + 1;
			dice[rnd - 1]++;
		}
//		System.out.println(Arrays.toString(dice));
	}

	public void showDiagram() {
		for (int i = 0; i < dice.length; i++) {
			System.out.println(i + 1 + "|");
			for (int j = 0; j < dice[i]; j++) {
				System.out.print("*");
			}
			System.out.print(dice[i]);
		}
	}
}
