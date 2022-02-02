package collection.arraylist;

import java.util.ArrayList;

class Mystack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return arrayStack.remove(len-1);
	}
	
	public String peek() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return arrayStack.get(len-1);
	}
}

public class StackTest {
	public static void main(String[] args) {
		Mystack stack = new Mystack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		//peek�� ���� ���� �ε����� ����ϱ⸸ �� (get)
		//pop�� ���� ���� �ε����� ���� (remove)
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
