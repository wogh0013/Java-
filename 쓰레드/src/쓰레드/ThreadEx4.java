package ������;

import javax.swing.JOptionPane;

//����ڷκ��� �Է¹޴� �κ� (������1)
public class ThreadEx4 {
	public static void main(String[] args) {
		ThreadEx4_1 th1 = new ThreadEx4_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
	}
}

//ȭ�鿡 ���ڸ� ����ϴ� �κ� (������2)
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
