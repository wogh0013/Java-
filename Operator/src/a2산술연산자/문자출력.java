package a2산술연산자;

public class 문자출력 {
	public static void main(String[] args) {
		char c = 'a';
		for(int i=0; i<26; i++)
		{
			System.out.print(c++);
		}
		System.out.println();
		
		c = 'A';
		for(int i=0; i<26; i++)
		{
			System.out.print(c++);	
		}
		System.out.println();
		
		c = '0';
		for(int i=0; i<10; i++)
		{
			System.out.print(c++); // 출력값은 문자형임
		}
	}
}
