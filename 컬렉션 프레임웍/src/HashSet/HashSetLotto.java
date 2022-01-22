package HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet(); //중복된 값 저장 X
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45+1);
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);
		Collections.sort(list); //번호를 크기순으로 정렬
		System.out.println(list);
	}
}
