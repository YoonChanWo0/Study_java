package overriding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * Car 클래스 정의
 * - 멤버변수 : speed(현재 속력, int), maxSpeed(최대 속력, int)
 * - 메서드
 *   speedUp() : "자동차 속도 증가!" 출력(리턴타입, 파라미터 없음)
 *   speedDown() : "자동차 속도 감소!" 출력(리턴타입, 파라미터 없음)
 *   addFuel() : "자동차 연료 주입!" 출력(리턴타입, 파라미터 없음)
 */
class Car {
	int speed; // 현재 속력
	int maxSpeed; // 최대 속력
	
	public void speedUp() {
		System.out.println("자동차 속도 증가!");
	}
	
	public void speedDown() {
		System.out.println("자동차 속도 감소!");
	}
	
	public void addFuel() {
		System.out.println("자동차 연료 주입!");
	}
}

/*
 * 자동차(Car) 클래스를 상속받는 전기자동차(ElectricCar) 정의
 * - 멤버변수 : batteryCapacity(배터리 용량, int)
 * - 메서드
 *   speedUp() : "ElectricCar 전기모터의 힘으로 속도 증가!" 출력(리턴타입, 파라미터 없음)
 *   speedDown() : "ElectricCar 속력 감소하면서 전기배터리 충전!" 출력(리턴타입, 파라미터 없음)
 *   addFuel() : "전기차 충전소에서 배터리 충전!" 출력(리턴타입, 파라미터 없음)
 */
class ElectricCar extends Car {
	int batteryCapacity; // 배터리 용량
	
	// Car 클래스의 메서드 오버라이딩
	@Override
	public void speedUp() {
		System.out.println("ElectricCar 전기모터의 힘으로 속도 증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("ElectricCar 속력 감소하면서 전기배터리 충전!");
	}

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
	
	
	
}

/*
 * 자동차(Car) 클래스를 상속받는 디젤자동차(DieselCar) 정의
 * - 멤버변수 : cc(엔진 배기량, int)
 * - 메서드
 *   speedUp() : "디젤 엔진의 힘으로 속도 증가!" 출력(리턴타입, 파라미터 없음)
 *   speedDown() : "디젤 자동차 속도 감소!" 출력(리턴타입, 파라미터 없음)
 *   addFuel() : "주유소에서 디젤 연료 주입!" 출력(리턴타입, 파라미터 없음)
 */

class DieselCar extends Car {
	int cc; // 엔진 배기량
	
	// Car 클래스의 메서드 오버라이딩
	@Override
	public void speedUp() {
		System.out.println("디젤 엔진의 힘으로 속도 증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("디젤 자동차 속도 감소!");
	}

	@Override
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 주입!");
	}
	
	
	
}






















