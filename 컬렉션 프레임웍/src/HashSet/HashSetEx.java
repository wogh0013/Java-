package HashSet;

import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "3", "3", "2", "4", "4", "4"};
		Set set = new HashSet();
		
		//HashSet�� objArr�� ��ҵ� ����
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);		
		}
		
		System.out.println(set);
		//HashSet�� ���������Ƿ� �ߺ� ��� X, ���� ���� ���� X
		//1 : �ϳ��� String�ν��Ͻ�, ������ �ϳ��� Integer�ν��Ͻ��̹Ƿ� �ٸ� ��ü�� �ߺ����� �������� �ʴ´�.
	}
}
