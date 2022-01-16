package javalang패키지;

public class StringEx2 {
	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		int index = fullName.indexOf('.');
		System.out.println(".의 위치는 " + index);
		
		//fullName의 '첫 번째 글자' ~ '.' 까지의 문자열 추출
		String fileName = fullName.substring(0, index);
		
		//그 뒤의 나머지 문자열 추출
		//String ext = fullName.substring(index+1, fullName.length());
		String ext = fullName.substring(index);
		
		System.out.println("파일명은 " + fileName);
		System.out.println("확장자는 " + ext);
	}
}
