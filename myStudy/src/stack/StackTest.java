package stack;

import java.util.Scanner;

public class StackTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int max = sc.nextInt();
		StringStack stack = new StringStack(max);
		System.out.println(stack.length());
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.next();
			if(str.equals("그만")) {
				break;
			}
			
			boolean choice = stack.push(str);
			if(choice == false) {
				System.out.println("스택 가득참");
			}
		}
		System.out.print("모든문자열: ");
		int len = stack.length();
		System.out.println(len);
		for(int i = 0; i < len; i++) {
			System.out.println(stack.pop() + " ");
		}
	}
}
