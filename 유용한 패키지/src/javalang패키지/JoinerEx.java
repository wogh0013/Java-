package javalangÆÐÅ°Áö;

import java.util.StringJoiner;

public class JoinerEx {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",", "[", "]");
		String[] strArr = {"aaa", "bbb", "ccc"};
		
		for(String s : strArr)
			sj.add(s.toUpperCase());
		
		System.out.println(sj.toString());
	}
}
