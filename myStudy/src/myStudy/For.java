package myStudy;

public class For {
	// 1~ 100���� �����߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ�
	public static void main(String[] args) {
		// 3, 6, 9, 12 ,,,
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println(sum);

		// while���� Math.random() �޼ҵ带 �̿��ؼ� 2����
		// �ֻ����� 1~6���� 2���� �ֻ����� ����

		while (true) {
			int s = (int) (Math.random() * 6) + 1;
			int s1 = (int) (Math.random() * 6) + 1;
			System.out.println(s + s1);
			if (s + s1 == 5) {
				break;
			}
		}
	}
}
