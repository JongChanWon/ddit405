package ddit.chap02.sec01;

public class CharExample {
	public static void main(String[] args) {
		char ch = 'A';
		byte b = 10;
		System.out.println(ch);
		System.out.println(ch + 5); // int로 변환
		System.out.println((char) (ch + 5)); // 102가 char로 변환됨

//		char res = b + ch; 
//		char는 byte로 형변환이 안됨(음수가 없기 때문에)

		short sh = 50;

//		char res = sh + ch;

		short res = (short) (sh + ch);
		System.out.println(res);

	}
}
