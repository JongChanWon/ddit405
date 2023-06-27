package stack;

import java.util.ArrayList;
import java.util.List;

// Q3. 다음 Stack 인터페이스를 구현하는 StringStack 클래스를 만드시오. 
// 그리고 다음 실행 예와 같이 작동하도록 main() 메소드를 작성하시오. 
// "그만"을 입력하면 입력이 종료됩니다.
public class StringStack implements Stack {
	
	private String[] stack;
	private int top;
	
	protected StringStack() {
		// 기본생성자
	}
	
	protected StringStack(int capacity){
		stack = new String[capacity];
		top = -1;
	}
	
	
	@Override
	public int length() { // 현재 스택에 저장된 개수
		return top + 1;
	}

	@Override
	public int capacity() { // 스택의 전체 저장 가능한 개수
		return stack.length;
	}

	@Override
	public String pop() { // 스택의 top에 실수 저장
		if(top == -1) {
			return null;
		}
		String str = stack[top];
		top--;
		return str;
	}

	@Override
	public boolean push(String val) { // 스택의 top에 저장된 실수 반환
		if(top == stack.length-1) return false;
		else {
			top++;
			stack[top] = val;
			return true;
		}
	}

}
