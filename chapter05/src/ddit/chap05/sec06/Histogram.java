package ddit.chap05.sec06;

public class Histogram {
	int[] dice = new int[6]; // �⺻������ �迭�� �ʱ�ȭ ������ ������ �������(6���ǰ���) �ϳ��ϳ��� 0�� �����

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
