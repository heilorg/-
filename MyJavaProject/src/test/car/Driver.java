package test.car;

public class Driver extends Owner { 
	// 부모 클래스가 추상 클래스이기 때문에  생성자를 무조건 써줘야 한다
	public static String LICENSE_NO1 = "1종";
	public static String LICENSE_NO2 = "2종";
	public static String LICENSE_BIG = "대형";
	
	public Driver(String name, String phone, String email, int age, String license) {
		super(name, phone, email, age); // 부모의 생성자
		haveLicense(license);
	}

	@Override
	public void haveLicense(String license) { // 부모의 추상메서드를 작성하지 않아서 무조건 오버라이딩을 해야함
		// TODO Auto-generated method stub
		if(getAge() < 19) {
			System.out.println(getName() + "은 19세 미만은 운전면허를 취득할 수 없습니다.");
			return;
		}
		setLicense(license);
	}
}
