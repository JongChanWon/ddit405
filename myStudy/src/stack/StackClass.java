package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackClass implements Stack {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		StackClass st = new StackClass();

		List<String> stack = new ArrayList<String>();

//		for (int i = 0; i < size; i++) {
//			System.out.print("���ڿ� �Է�>>");
//			String inputString = sc.next(); // list�� ����
//		}
		
		while(true) {
			
			int size = st.capacity();
			
			for(int i = 0; i <= size; i++) {
				
				System.out.print("���ڿ� �Է�>>");
				String inputString = sc.next();// list�� ����
				if(i == size) {
					System.out.println("������ ����á���ϴ�");
					sc.next();
				}
				
				else if(inputString == "�׸�") {
					stack.add(inputString);
					System.out.println("���ڿ� ����" + stack.get(i));
				}		
			}
			
			
		}



	}

	@Override
	public int length() { // ���ÿ� ����� ����
		
		
		return 0;
	}

	@Override
	public int capacity() { // ������ ��ü ���� ������ ����
		System.out.print("�� ���� ���� ������ ũ�� �Է�>>");
		int size = sc.nextInt();
		return size;
	}

	@Override
	public String pop() { // ������ top�� �Ǽ� ����
		List<String> stack = new ArrayList<String>();

		for (int i = 0; i < stack.size(); i++) {

		}
		return null;
	}

	@Override
	public boolean push(String val) { // ������ top�� ����� �Ǽ� ��ȯ

		return false;
	}

}
