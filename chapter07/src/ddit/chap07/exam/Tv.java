package ddit.chap07.exam;

public class Tv {
	public static void main(String[] args) {
		TvInfo tvInfo = new TvInfo("삼성", "2023년 1월 5일", 72);
		System.out.println(tvInfo);
	}
}

class TvInfo {
	String operator; // 제조사
	String prodYear; // 생산년도
	int size; // 크기

	TvInfo(String operator, String prodYear, int size) {
		this.operator = operator;
		this.prodYear = prodYear;
		this.size = size;
	}

	@Override
	public String toString() {
		return "TvInfo [operator=" + operator + ", prodYear=" + prodYear + ", size=" + size + "]";
	}

}
