package Iterator��ListIterator��Enumeration;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("5");
		list.add("4");
		
		Iterator it = list.iterator(); //hasNext�� ������ �о�´ٰ� �Ҷ� ���̻� �о�� ���� �ִ��� ������ ���� üũ�Ҷ� ����ϴ� �޼ҵ��Դϴ�.
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	}
}
