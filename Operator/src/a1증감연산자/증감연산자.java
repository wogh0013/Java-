package a1증감연산자;

public class 증감연산자 {
	public static void main(String[] args) {
		int i=5, j=0;
		
		j=i++;
		System.out.println("i=" + i + " " + "j=" + j);
		
		i=5; 
		j=0;	// 값 초기화
		
		j=++i;
		System.out.println("i=" + i + " " + "j=" + j);
	}
}
