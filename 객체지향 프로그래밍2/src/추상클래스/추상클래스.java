package 추상클래스;

abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() { /*현재 위치에 정지*/ };
}

class Marine extends Unit{
	void move(int x, int y) {
		x++;
		y++;
	}
	void stimPack() {
		/*스팀팩을 사용한다.*/
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		++x;
		++y;
	}
	void sizMode() {
		/*시즈모드를 한다.*/
	}
}

class Dropship extends Unit{
	void move(int x, int y) {
		x += x;
		y += y;
	}
	void load() {
		/*선택된 대상을 태운다.*/
	}
	void unload() {
		/*선택된 대상을 내린다.*/
	}
}

public class 추상클래스 {
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
