package ddit.chap02.sec01;

public class CharExample {
	public static void main(String[] args) {
		char ch = 'A';
		byte b = 10;
		System.out.println(ch);
		System.out.println(ch + 5); // int�� ��ȯ
		System.out.println((char) (ch + 5)); // 102�� char�� ��ȯ��

//		char res = b + ch; 
//		char�� byte�� ����ȯ�� �ȵ�(������ ���� ������)

		short sh = 50;

//		char res = sh + ch;

		short res = (short) (sh + ch);
		System.out.println(res);

	}
}
