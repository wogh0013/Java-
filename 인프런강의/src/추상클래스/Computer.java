package �߻�Ŭ����;

//�߻�Ŭ������ ����� ���� ������� Ŭ�����̴�.
//�߻�Ŭ������ �ν��Ͻ�ȭ�� �� ����.
//����Ŭ������ �߻�Ŭ������ ������� Ŭ������ �����. 
//�߻�޼���� ����Ŭ�������� ������ �ž� �Ѵ�.
//�⺻�޼���� �������� ���� �޼����̴�. -> �������̵� ����
//��ӿ����θ� ����ϴ� ��� �߻�Ŭ������ �����.
public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
