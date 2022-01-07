package �߻�Ŭ����;

abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() { /*���� ��ġ�� ����*/ };
}

class Marine extends Unit{
	void move(int x, int y) {
		x++;
		y++;
	}
	void stimPack() {
		/*�������� ����Ѵ�.*/
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		++x;
		++y;
	}
	void sizMode() {
		/*�����带 �Ѵ�.*/
	}
}

class Dropship extends Unit{
	void move(int x, int y) {
		x += x;
		y += y;
	}
	void load() {
		/*���õ� ����� �¿��.*/
	}
	void unload() {
		/*���õ� ����� ������.*/
	}
}

public class �߻�Ŭ���� {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		
		m.move(1, 2);
		m.stimPack();
		
		t.move(3, 4);
		t.sizMode();
	}
}
