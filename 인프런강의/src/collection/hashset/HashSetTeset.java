package collection.hashset;

import java.util.HashSet;

public class HashSetTeset {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc"); //���� ��� X
		set.add("aaa"); //�ߺ� ��� x
		
		System.out.println(set);
	}
}
