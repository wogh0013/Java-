package HashSet;

import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "3", "3", "2", "4", "4", "4"};
		Set set = new HashSet();
		
		//HashSet에 objArr의 요소들 저장
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);		
		}
		
		System.out.println(set);
		//HashSet에 저장했으므로 중복 허용 X, 저장 순서 유지 X
		//1 : 하나는 String인스턴스, 나머지 하나는 Integer인스턴스이므로 다른 객체라서 중복으로 간주하지 않는다.
	}
}
