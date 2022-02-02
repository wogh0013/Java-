package ¶÷´Ù½Ä;

public class TestMyNumber {
	public static void main(String[] args) {
		Mynumber maxNum = (x, y) -> (x >= y) ? x : y;
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
	}
}
