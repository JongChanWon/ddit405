package ddit.chap05.sec07;

public class ReportCard {
	String[] name = { "이순신", "정몽주", "장영실", "김춘삼", "임영수" };
	int[][] score = { { 60, 80, 70, 0, 0, 1 }, { 90, 80, 90, 0, 0, 1 }, { 80, 90, 90, 0, 0, 1 },
			{ 60, 60, 60, 0, 0, 1 }, { 90, 90, 90, 0, 0, 1 } };// 5행6열

	public void rank() {
		for (int i = 0; i < score.length; i++) { // 행의수(5행)
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3]) { // 총점을 기준으로 등수
					score[i][5]++;
				}
			}
		}
	}

	public void ex() {
		for (int i = 0; i < score.length - 1; i++) { // 5-1번 돌려
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j][5] > score[j + 1][5]) {
					// 점수 정렬
					int[] temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
					// 이름정렬
					String temp2 = name[j];
					name[j] = name[j + 1];
					name[j + 1] = temp2;
				}
			}
		}
	}

	// 교체할 방 7개
	public void orderedRank() {
		// 등수를 기준으로 1등부터 내림차순으로 정렬
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
		for (int i = 0; i < score.length; i++) { // 행의수
			for (int j = 0; j < 3; j++) {
				score[i][3] += score[i][j]; // 총점 score[i][3] = score[i][3] + score[i][j]
			}
			score[i][4] = score[i][3] / 3;// 평균
		}
	}

	public void printReport() {
		System.out.println("\t<<성적표>>");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("====================================================");

		calculateGrade();
		rank();
//		ex();
		// 이름, 점수 뽑아내는 for문
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) { // i행의 열의수
				System.out.print(score[i][j] + "\t");

			}
			System.out.println();
		}
	}
}
//이름	국어	영어	수학	총점	평균	등수
//====================================================
//이순신	60	80	70	210	70	4	
//정몽주	90	80	90	260	86	2	
//장영실	80	90	90	260	86	2	
//김춘삼	60	60	60	180	60	5	
//임영수	90	90	90	270	90	1	

//이름	국어	영어	수학	총점	평균	등수
//====================================================
//임영수	90	90	90	270	90	1	
//정몽주	90	80	90	260	86	2	
//장영실	80	90	90	260	86	2	
//이순신	60	80	70	210	70	4	
//김춘삼	60	60	60	180	60	5	
