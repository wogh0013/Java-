package ¹è¿­;

public class ArrayTest {
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.print(alphabets[i] + " ");
		}
	}
}
