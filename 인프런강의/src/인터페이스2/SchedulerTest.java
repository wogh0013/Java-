package �������̽�2;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		
		System.out.println("��ȭ ��� ��й���� �����ϼ���: R, L, P");
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch=='R' || ch=='r')
			scheduler = new RoundRobin();
		else if(ch=='L' || ch=='l')
			scheduler = new LeastJob();
		else if(ch=='P' || ch=='p')
			scheduler = new PriorityAllocation();
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
