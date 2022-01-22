package 쓰레드;

public class ThreadEx5 {
	public static void main(String[] args) {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		ThreadEx5_2 th2 = new ThreadEx5_2();
		th1.start();
		th2.start();
		
		try {
			th1.sleep(2000);
		}catch(InterruptedException e) {}
		
		System.out.print("<<main 종료>>");
	}
}

class ThreadEx5_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++)
			System.out.print("-");
		System.out.print("<<th1 종료>>");
	}
}

class ThreadEx5_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++)
			System.out.print("|");
		System.out.println("<<th2 종료>>");
	}
}