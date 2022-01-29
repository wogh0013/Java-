package 클래스3.싱글톤;

//싱글톤 : 객체를 하나만 가질 수 있다. 
// by 디폴트 생성자를 건드려서
public class Company {
	//private으로 인해 외부에서 생성자 사용X
	private Company() {}
	
	//내부에서 생성한 Company 인스턴스
	private static Company instance = new Company();
	
	public static Company getInstance() {
		if(instance==null)
			instance = new Company();
		return instance;
	}

}
