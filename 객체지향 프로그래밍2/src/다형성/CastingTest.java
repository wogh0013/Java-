package 다형성;

public class CastingTest {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe; 에서 형변환이 생략된 형태
		//car.water(); -> 에러, Car타입의 참조변수로는 water()를 호출할 수 없음
		fe2 = (FireEngine)car; // 자식타입 <- 부모타입
		fe2.water();
	}
}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, 부르릉~~~!");
	}
	
	void stop() {
		System.out.println("stop, 끼이이이익!!!");
	}
}

class FireEngine extends Car{	//소방차
	void water() {
		System.out.println("물 뿌리기!!");
	}
}