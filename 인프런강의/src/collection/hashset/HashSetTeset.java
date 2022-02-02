package collection.hashset;

import java.util.HashSet;

public class HashSetTeset {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc"); //순서 상관 X
		set.add("aaa"); //중복 허용 x
		
		System.out.println(set);
	}
}
