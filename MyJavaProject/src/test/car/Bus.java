package test.car;

public class Bus extends Car implements Driveable {
	final private int MAX_SPEED = 130; // 상수 
	private int seat;
	
	public Bus(String name, Owner owner, float max_oil_level, float oil_level_gauge, float fuel_efficiency, int seat) {
		this.setName(name);
		this.setOwner(owner);
		this.setMax_oil_level(max_oil_level);
		this.setOil_level_gauge(oil_level_gauge);
		this.setFuel_efficiency(fuel_efficiency);
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	// 오버라이딩 상속받은 메서드를 수정
	@Override
	public void setMaxSpeed(float maxSpeed) {
		// TODO Auto-generated method stub
		if(maxSpeed > MAX_SPEED) {
			System.out.println("최고속도는 " + MAX_SPEED + "km/h를 넘을 수 없어서 " + MAX_SPEED + "km/h으로 설정하였습니다.");
			maxSpeed = MAX_SPEED;
		}
		super.setMaxSpeed(maxSpeed);
	}
	
	// 인터페이스의 메서드를 구현하지 않으면 오류가 난다
	@Override
	public boolean chkLicense() {
		if(super.getOwner().getLicense().equals(Driver.LICENSE_BIG)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	void move(int speed, int minute) {
		if(chkLicense()) {
			super.move(speed, minute);
		}else {
			System.out.println("버스를 운전할 면허증이 없어서 운전할 수 없습니다.");
		}
	}
	
	@Override
	void move(float distance) {
		if(chkLicense()) {
			super.move(distance);
		}else {
			System.out.println("버스를 운전할 면허증이 없어서 운전할 수 없습니다.");
		}		
	}
}
