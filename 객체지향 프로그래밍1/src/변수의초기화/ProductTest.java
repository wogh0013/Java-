package �������ʱ�ȭ;

class Product{
	static int count=0; // ������ �ν��Ͻ��� ������ �����ϱ� ���� ����
	int serialNo;		// �ν��Ͻ� ������ ��ȣ
	
	{
		++count;
		serialNo = count; // Product�ν��Ͻ��� ������ ������ count�� ���� 1�� �������Ѽ� serialNo�� �����Ѵ�.
	}
	
	public Product() {} // �⺻������, ��������
}

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 ��ǰ ��ȣ�� : " + p1.serialNo);
		System.out.println("p2 ��ǰ ��ȣ�� : " + p2.serialNo);
		System.out.println("p3 ��ǰ ��ȣ�� : " + p3.serialNo);
		System.out.println("����� ��ǰ�� ���� ��� " + Product.count + "���Դϴ�.");
	}
}
