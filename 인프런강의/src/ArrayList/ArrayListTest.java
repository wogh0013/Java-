package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		for(String s : list)
			System.out.println(s);
	}
}
