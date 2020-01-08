package test.car;

public class Driver extends Owner {
	public static String LICENSE_NO1 = "1종";
	public static String LICENSE_NO2 = "2종";
	public static String LICENSE_BIG = "대형";
	
	public Driver(String name, String phone, String email, int age, String license) {
		super(name, phone, email, age);
		haveLicense(license);
	}

	@Override
	public void haveLicense(String license) {
		// TODO Auto-generated method stub
		if(getAge() < 19) {
			System.out.println(getName() + "은 19세 미만은 운전면허를 취득할 수 없습니다.");
			return;
		}
		setLicense(license);
	}
}
