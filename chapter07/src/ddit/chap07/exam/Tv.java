package ddit.chap07.exam;

public class Tv {
	public static void main(String[] args) {
		TvInfo tvInfo = new TvInfo("�Ｚ", "2023�� 1�� 5��", 72);
		System.out.println(tvInfo);
	}
}

class TvInfo {
	String operator; // ������
	String prodYear; // ����⵵
	int size; // ũ��

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
