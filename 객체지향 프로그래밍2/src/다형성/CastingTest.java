package ������;

public class CastingTest {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe; ���� ����ȯ�� ������ ����
		//car.water(); -> ����, CarŸ���� ���������δ� water()�� ȣ���� �� ����
		fe2 = (FireEngine)car; // �ڽ�Ÿ�� <- �θ�Ÿ��
		fe2.water();
	}
}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, �θ���~~~!");
	}
	
	void stop() {
		System.out.println("stop, ����������!!!");
	}
}

class FireEngine extends Car{	//�ҹ���
	void water() {
		System.out.println("�� �Ѹ���!!");
	}
}