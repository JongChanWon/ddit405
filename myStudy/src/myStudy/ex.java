package myStudy;

public class ex {
	public static void main(String[] args) {
		int[] scores;
//		scores = new int[] {1,2,3,4,5,6,};
//		scores = {1,2,3,4,5}; 이렇게 변수 선언을 하고 그다음에 값을 초기화 하여 배열을 생성 할 수 없음
		ex e = new ex();

		// int result = e.add({1,2,3,4}); 매개변수로 배열을 받아서 값을 넣어줄 때에도 중괄호 만으로 넣어줄 수 없다
		int score[] = { 80, 90, 100 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += score[i];
		}
		System.out.println("총합: " + sum1);

		int sum2 = e.add(new int[] { 10, 20, 30 });
		System.out.println("총합: " + sum2);
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