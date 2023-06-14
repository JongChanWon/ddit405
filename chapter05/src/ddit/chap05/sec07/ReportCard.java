package ddit.chap05.sec07;

public class ReportCard {
	String[] name = { "�̼���", "������", "�念��", "�����", "�ӿ���" };
	int[][] score = { { 60, 80, 70, 0, 0, 1 }, { 90, 80, 90, 0, 0, 1 }, { 80, 90, 90, 0, 0, 1 },
			{ 60, 60, 60, 0, 0, 1 }, { 90, 90, 90, 0, 0, 1 } };// 5��6��

	public void rank() {
		for (int i = 0; i < score.length; i++) { // ���Ǽ�(5��)
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3]) { // ������ �������� ���
					score[i][5]++;
				}
			}
		}
	}

	public void ex() {
		for (int i = 0; i < score.length - 1; i++) { // 5-1�� ����
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j][5] > score[j + 1][5]) {
					// ���� ����
					int[] temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
					// �̸�����
					String temp2 = name[j];
					name[j] = name[j + 1];
					name[j + 1] = temp2;
				}
			}
		}
	}

	// ��ü�� �� 7��
	public void orderedRank() {
		// ����� �������� 1����� ������������ ����
		for (int i = 0; i < score.length; i++) {
			System.out.print((name[i] + "\t"));
			for (int j = 0; j < score[i].length; j++) {
				System.out.println(score[i][j] + "\t");
				for (int k = 0; k < name.length; k++) {

				}
			}
		}
	}

	public void calculateGrade() {
		for (int i = 0; i < score.length; i++) { // ���Ǽ�
			for (int j = 0; j < 3; j++) {
				score[i][3] += score[i][j]; // ���� score[i][3] = score[i][3] + score[i][j]
			}
			score[i][4] = score[i][3] / 3;// ���
		}
	}

	public void printReport() {
		System.out.println("\t<<����ǥ>>");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t���");
		System.out.println("====================================================");

		calculateGrade();
		rank();
//		ex();
		// �̸�, ���� �̾Ƴ��� for��
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) { // i���� ���Ǽ�
				System.out.print(score[i][j] + "\t");

			}
			System.out.println();
		}
	}
}
//�̸�	����	����	����	����	���	���
//====================================================
//�̼���	60	80	70	210	70	4	
//������	90	80	90	260	86	2	
//�念��	80	90	90	260	86	2	
//�����	60	60	60	180	60	5	
//�ӿ���	90	90	90	270	90	1	

//�̸�	����	����	����	����	���	���
//====================================================
//�ӿ���	90	90	90	270	90	1	
//������	90	80	90	260	86	2	
//�念��	80	90	90	260	86	2	
//�̼���	60	80	70	210	70	4	
//�����	60	60	60	180	60	5	
