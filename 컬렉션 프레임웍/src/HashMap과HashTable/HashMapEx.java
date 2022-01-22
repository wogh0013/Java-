package HashMap과HashTable;

import java.util.HashMap;
import java.util.Scanner;


//키는 중복을 허용하지 않으므로 실제로 데이터는 (myId, 1234), (asdf, 1234) 두 개가 저장된다.
public class HashMapEx {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1234");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(!(map.get(id).equals(password))) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			}
			else {
				System.out.println("아이디와 비밀번호가 일치합니다.");
				break;
			}
		}
	}
}
