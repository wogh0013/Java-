package javalang��Ű��;

class Point implements Cloneable{ //Cloneable �������̽��� �����ؾ߸� clone()�� ȣ���� �� �ִ�.
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone(); //clone()�� �ݵ�� ����ó���� ����� ��
		} catch(CloneNotSupportedException e) {}
		return obj;
	}
}

public class CloneEx {
	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone(); //����(clone)�ؼ� ���ο� ��ü�� ����
		
		System.out.println(original);
		System.out.println(copy);
	}
}
