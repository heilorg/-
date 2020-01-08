package test.car;

abstract public class Owner {
	// 필드 (멤버변수)
	private String name;
	private String phone;
	private String email;
	private int age;
	
	private String license = "없음";
	
	// 메서드 (기능)
	public Owner(String name, String phone, String email, int age) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	abstract public void haveLicense(String license); 
	// 추상 메서드 - 일반 클래스는 추상메서드를 가질 수 없다. 일반클래스를 추상 클래스로 변경하였다. 

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}
}