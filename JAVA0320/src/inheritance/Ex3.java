package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 *  has-a 관계(포함) vs is-a 관계(상속)
		 *  1. has-a관계(포함)
		 *  -A has a B = A 가 B 를 포함한다 로 표현 가능한 관계
		 *  - 가장 일반적인 객체간의 관계
		 *  - 특정 클래스 내에서 다른 클래스의 인스턴스를 생산하며
		 *  해당 인스턴스를 다루는 관계
		 *  - 예) 자동차 - 엔진, 스마트폰 - 카메라
		 *  
		 *  2. is-a 관계(상속)
		 *  - A is a B = A는 B 이다 로 표햔 가능한 관계
		 *  - 특정 클래스가 다른 클래스를 상속받아
		 *  해당 클래스의 멤버를 선언없이 다루는 관계
		 *  - 에) 자동차 - 소방차, 핸드폰 - 스마트폰
		 */
		
	}

}
class Engine{
	int cc = 3000; // 배기량
}

// wkehdck(Car)와 엔진(Engine)의 관계는? has-a(포함) 관계이다.
// => 자동차는 엔진을 포함한다. = Car has a Engine.
class Car{
	// 포함관계일 경우 해당 클래스의 인스턴스를 통해 접근 가능한 관계
	
	Engine engine = new Engine();
	// => Engine 클래스의 인스턴스 생성
	
	String modelName = "그랜져";
	
	public void showCarInfo() {
		// 자신이 멤버변수에 접근 시 변수명만으로 접근 가능
		System.out.println("모델명 :" + modelName);
		
		// 포함관계에 있는 클래스의 멤버에 접근 시 참조변수 통해 접근 가능
		System.out.println("배기량 :" + engine.cc);
	}
}

// 소방차와 자동차의 관계는? is-a 관계(상속)이다.
// => 소방차는 자동차이다 = 소방차 is a 자동차.
class FireEngine extends Car{
	int supplyLimit = 10000; // 급수량
	public void showFireEnginInfo() {
		// 자신의 멤버에 접근
		System.out.println("급수량 :" + supplyLimit);
		
		// 부모의 멤버에 접근
		System.out.println("모델명 :" + modelName);
		
		// 부모와 포함곤계인 Engine 객체의 멤버에 접근
		System.out.println("배기량 :" + engine.cc);
		
		
	}
}