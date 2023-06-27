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
//			System.out.print("문자열 입력>>");
//			String inputString = sc.next(); // list에 저장
//		}
		
		while(true) {
			
			int size = st.capacity();
			
			for(int i = 0; i <= size; i++) {
				
				System.out.print("문자열 입력>>");
				String inputString = sc.next();// list에 저장
				if(i == size) {
					System.out.println("스택이 가득찼습니다");
					sc.next();
				}
				
				else if(inputString == "그만") {
					stack.add(inputString);
					System.out.println("문자열 개수" + stack.get(i));
				}		
			}
			
			
		}



	}

	@Override
	public int length() { // 스택에 저장된 개수
		
		
		return 0;
	}

	@Override
	public int capacity() { // 스택의 전체 저장 가능한 개수
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		int size = sc.nextInt();
		return size;
	}

	@Override
	public String pop() { // 스택의 top에 실수 저장
		List<String> stack = new ArrayList<String>();

		for (int i = 0; i < stack.size(); i++) {

		}
		return null;
	}

	@Override
	public boolean push(String val) { // 스택의 top에 저장된 실수 반환

		return false;
	}

}
