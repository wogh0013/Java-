package Iterator과ListIterator과Enumeration;

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
		
		Iterator it = list.iterator(); //hasNext는 파일을 읽어온다고 할때 더이상 읽어올 값이 있는지 없는지 등을 체크할때 사용하는 메소드입니다.
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	}
}
