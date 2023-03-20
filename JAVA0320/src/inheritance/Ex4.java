package inheritance;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 상속에서의 생성자
		 * - 생성자 : 클래스명과 이름이 같고 리턴타입이 없는 메서드의 일종
		 * - 생성자는 상속되지 않음
		 *   => 상속받을 경우 자신의 클래스 이름과 생성자 이름이 다르기 떄문에
		 *   생성자 정의 규칙을 위반하게 됨
		 *   - 상속관계에서 인스턴스를 생성할 떄
		 *   서브 클래스의 인스턴스가 생성되기 전 슈퍼클래스의 인스턴스를
		 *   먼저 생성한 후 서브클래스의 인스턴스를 생성함
		 *   => 서브클래스의 생성자가 호출되면 가장 먼저
		 *   슈퍼클래스의 생성자를 호출하여 슈퍼클래스의 인스턴스를 생성하고
		 *   그 후에 서브클래스의 인스턴스가 생성되어 생성자 코드가 실행됨
		 */
		Manager m = new Manager();
		/*
		 * Manager 인스턴스를 생성하는 과정
		 * => 서브클래스의 인스턴스를 생산하는 과정에서
		 * 서브클래스 생성자에서 인스턴스 생성 전 슈퍼클래스 생성자 호출
		 * 즉, 슈퍼클래스의 인스턴스가 생성된 후 서브클래스의 인스턴스 생성됨
		 * 1) New Manager() 코드에 의해서 Manager() 생성자롱 ㅣ동
		 * 2) Manager() 생성자에서 슈퍼클래스 Employee 의 생성자 Employee() 호출
		 * 	=> super(); 문장에 의해서
		 * 	=> 기본적으로 생략되어 있음!
		 * 3) Employee() 생성자에서 슈퍼클래스 Object 의 생성자 Object()호출
		 * 4) Object 인스턴스가 생성되고, Object() 생성자 내의 코드 실행됨
		 * 5) Employee 인스턴스가 생성되고, Employee() 생성자 내의 코드 실행됨
		 * System.out.println("Employee() 생성자 호출됨!"); 실행!
		 * 6) Manager 인스턴스가 생성되고, Manager() 생성자 내의 코드 실행됨!
		 * System.out.println("Manager() 생성자 호출됨!"); 실행!
		 * 
		 */
		
		System.out.println("----------------------------");
		
		// Employee 클래스의 이름, 연봉ㅇ믈 전달받는 파라미터 생성자는
		// Manager 클래스에 상속되지 않으므로 (String, int) 형태로는
		// 호출할 수 없다!
//		Manager m2 = new Manager("홍길동", 4000); // 컴파일 애러 발생!
		
		Manager m2 = new Manager("홍길동", 4000, "개발팀");
	}

}

class Employee{
	String name;
	int salary;
	
	public Employee() {
		System.out.println("Employee() 생성자 호출됨!");
	}
	// 만약 파라미터 생성자를 정의했을 떄 기본 생성자가 없을 경우
	// 서브클래스의 생성자에서 기본적으로 수퍼클래스의 기본생성자를 호출하므로
	// 서브클래스의 생성자에서 컴파일에러가 발생할 수 있다!
	// => 슈퍼클래스의 파라미터 생성자를 정의할 떄 기본 생성자도 정의 필요

	// 이름, 연봉을 전달받아 초기화하는 파라미터 생성자 정의
	// alt + shift +s -> o
	public Employee(String name, int salary) {
		super();// Object 클래스 기본생성자 호출
		this.name = name;
		this.salary = salary;
	}
	
	
}

// Employee 클래스를 상속받는 서브클래스 Manager 정의
class Manager extends Employee{
	String depart;
	
	public Manager() {
		// 서브클래스의 생성자 호출하게 되면
		// 내부적으로 가장 먼저 슈퍼클래스의 기본생자를 자동으로 호출하게 됨
		// => 슈퍼클래스 생성자의 작업이 종료된 후 서브클래스 생성자의 작업 수행
//		super("홍길동",3000); // 슈퍼클래스인 Employee 의 기본생성자 호출
		System.out.println("Manager() 생성자 호출됨!");
	}

	public Manager(String name, int salary, String depart) {
		System.out.println("Manager(String, int, String) 생성자 호출됨!");
		
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
	
}