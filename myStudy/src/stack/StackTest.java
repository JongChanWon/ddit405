package stack;

import java.util.Scanner;

public class StackTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int max = sc.nextInt();
		StringStack stack = new StringStack(max);
		System.out.println(stack.length());
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			String str = sc.next();
			if(str.equals("�׸�")) {
				break;
			}
			
			boolean choice = stack.push(str);
			if(choice == false) {
				System.out.println("���� ������");
			}
		}
		System.out.print("��繮�ڿ�: ");
		int len = stack.length();
		System.out.println(len);
		for(int i = 0; i < len; i++) {
			System.out.println(stack.pop() + " ");
		}
	}
}
