package Ŭ����3.�̱���;

//�̱��� : ��ü�� �ϳ��� ���� �� �ִ�. 
// by ����Ʈ �����ڸ� �ǵ����
public class Company {
	//private���� ���� �ܺο��� ������ ���X
	private Company() {}
	
	//���ο��� ������ Company �ν��Ͻ�
	private static Company instance = new Company();
	
	public static Company getInstance() {
		if(instance==null)
			instance = new Company();
		return instance;
	}

}
