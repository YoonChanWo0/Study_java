package static_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * static 메서드(= 정적 메서드)
		 * - 메서드 정의 시 리턴타입 앞에 static 키워드 를 붙여서 정의
		 * - 클래스가 메모리에 로딩될 때 static 변수와 함께 메모리에 로딩
		 *   되므로 인스턴스 생성과는 무관함
		 * - 클래스명만으로 접근 가능(클래스명.메서드명() 형태로 호출)
		 * 
		 * < static 메서드 정의 시 주의 사항 >
		 * - 인스턴스 생성 시점에서 생성되는 것은 static 메서드 내에서
		 *   접근 불가!
		 * 1. 인스턴스 변수 사용 불가
		 *    => 원인 : static 메서드가 로딩되는 시점은 클래스가 로딩되는 시점이며
		 *              인스턴스 변수는 인스턴스 생성 시점에 로딩되므로 static 메서드가
		 *              로딩되는 시점에서는 존재하지 않는다!
		 * 
		 * 2. 레퍼런스 this 또는 super 사용 불가
		 *    => 원인 : static 메서드가 로딩되는 시점은 클래스가 로딩되는 시점이며
		 *              레퍼런스 this는 인스턴스 생성 시점에 생성되므로 
		 *              static 메서드가 로딩되는 시점에서는 존재하지 않는다!
		 *    => 해결책 : this.XXX 또는 super.XXX 대신
		 *                클래스명.XXX 형식으로 접근
		 * 
		 * 3. 메서드 오버라이딩 불가(상속 단원에서 배움)
		 *              
		 */
		
		
		
		

		
	}

}

class StaticMethod {
	
	// 인스턴스 멤버변수 normalVar 선언(int형) - 10 초기화
	private int normalVar = 10;
	// 정적 멤버변수 staticVar 선언(int형) - 20 초기화
	private static int staticVar = 20;
	
	// 일반 메서드 normalMethod() 메서드 정의 - 파라미터, 리턴값 없음
	public void normalMethod() {
		System.out.println("일반메서드 normalMethod()");
		
		// 일반 메서드는 인스턴스가 생성되는 시점에 메모리에 로딩됨
		System.out.println("일반 메서드에서 인스턴스 변수 접근 : " + normalVar);
		System.out.println("일반 메서드에서 static 변수 접근 : " + staticVar);
		
		// 일반 메서드에서 static 메서드 호출 가능
		staticMethod();
		
	}
	
	// static 메서드 staticMehtod() 메서드 정의 - 파라미터, 리턴값 없음
	public static void staticMethod() {
		System.out.println("정적메서드 staticMethod()");
		
		// static 메서드는 클래스가 메모리에 로딩되는 시점에 함께 로딩됨
//		System.out.println("static 메서드에서 인스턴스 변수 접근 : " + normalVar);
		// => 컴파일 에러 발생
		//    Cannot make a static reference to the non-static field normalVar
		// => 인스턴스 변수는 아직 메모리에 로딩되기 전이므로 접근 불가능
		System.out.println("static 메서드에서 static 변수 접근 : " + staticVar);
		
		// static 메서드에서 일반 메서드 호출 불가! (변수와 원인 동일함)
//		normalMethod();
		
		// Getter/Setter 생성 단축키 : alt + shift + s -> r
		
		
	}

	// 인스턴스 변수 normalVar 에 대한 Setter 정의
	public void setNormalVar(int normalVar) {
		this.normalVar = normalVar;
	}

	// static 변수 staticVar 에 대한 Setter 정의
	public static void setStaticVar(int staticVar) {
//		this.staticVar = staticVar;
		// static 메서드 내에서 레퍼런스 this 사용 불가
		// (Cannot use this in a static context)
		// => 레퍼런스 this 는 인스턴스 생성 시점에 생성되지만
		//    static 메서드가 로딩되는 시점에는 레퍼런스 this가 존재하지 않음
		
		// 레퍼런스 this 대신 클래스명으로 static 변수 접근 가능함
		StaticMethod.staticVar = staticVar;
	}
	
}









