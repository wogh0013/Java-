package javalang패키지;

public class StringEx {
	public static void main(String[] args) {
		int i=100;
		String str =  String.valueOf(i); //int를 String으로 변환
		
		double d = 200.0;
		String str2 = d + ""; //double을 String으로 변환
		
		double sum = Integer.parseInt("+"+str) + Double.parseDouble(str2);
		double sum2 = Integer.valueOf(str) + Double.valueOf(str2);
		
		System.out.println(String.join("", str,"+", str2,"=")+sum);
		System.out.println(str+"+"+str2+"="+sum2);
	}
}
