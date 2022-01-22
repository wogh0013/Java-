package 쓰레드;

import javax.swing.JOptionPane;

//사용자로부터 입력받는 부분 (쓰레드1)
public class ThreadEx4 {
	public static void main(String[] args) {
		ThreadEx4_1 th1 = new ThreadEx4_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}

//화면에 숫자를 출력하는 부분 (쓰레드2)
class ThreadEx4_1 extends Thread{
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e) {}
		}
	}
}
