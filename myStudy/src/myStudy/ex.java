package myStudy;

public class ex {
	public static void main(String[] args) {
		int[] scores;
//		scores = new int[] {1,2,3,4,5,6,};
//		scores = {1,2,3,4,5}; �̷��� ���� ������ �ϰ� �״����� ���� �ʱ�ȭ �Ͽ� �迭�� ���� �� �� ����
		ex e = new ex();

		// int result = e.add({1,2,3,4}); �Ű������� �迭�� �޾Ƽ� ���� �־��� ������ �߰�ȣ ������ �־��� �� ����
		int score[] = { 80, 90, 100 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += score[i];
		}
		System.out.println("����: " + sum1);

		int sum2 = e.add(new int[] { 10, 20, 30 });
		System.out.println("����: " + sum2);
		System.out.println();

	}

	int add(int[] scores) {

		int result = 0;
		for (int i = 0; i < 3; i++) {
			result += scores[i];
		}
		return result;
	}

}