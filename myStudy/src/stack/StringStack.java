package stack;

import java.util.ArrayList;
import java.util.List;

// Q3. ���� Stack �������̽��� �����ϴ� StringStack Ŭ������ ����ÿ�. 
// �׸��� ���� ���� ���� ���� �۵��ϵ��� main() �޼ҵ带 �ۼ��Ͻÿ�. 
// "�׸�"�� �Է��ϸ� �Է��� ����˴ϴ�.
public class StringStack implements Stack {
	
	private String[] stack;
	private int top;
	
	protected StringStack() {
		// �⺻������
	}
	
	protected StringStack(int capacity){
		stack = new String[capacity];
		top = -1;
	}
	
	
	@Override
	public int length() { // ���� ���ÿ� ����� ����
		return top + 1;
	}

	@Override
	public int capacity() { // ������ ��ü ���� ������ ����
		return stack.length;
	}

	@Override
	public String pop() { // ������ top�� �Ǽ� ����
		if(top == -1) {
			return null;
		}
		String str = stack[top];
		top--;
		return str;
	}

	@Override
	public boolean push(String val) { // ������ top�� ����� �Ǽ� ��ȯ
		if(top == stack.length-1) return false;
		else {
			top++;
			stack[top] = val;
			return true;
		}
	}

}
