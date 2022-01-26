package Å¬·¡½º2;

public class cooperation {
	public static void main(String[] args) {
		
		Student james = new Student("James", 10000);
		Student tomas = new Student("Tomas", 20000);
		
		james.grade = 2;
		tomas.grade = 3;
		
		Bus bus566 = new Bus(566);
		Subway subwayGreen = new Subway(2);
		
		james.takeBus(bus566);
		james.takeSubway(subwayGreen);
		james.showInfo();
		bus566.showInfo();
		
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();	
	}
}
