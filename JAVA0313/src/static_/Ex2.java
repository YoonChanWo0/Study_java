package static_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 
		 */

	}

}

class staticMethod{
	
	// 인스턴스 멤버변수 normalVar 선언(int형) - 10 초기화
	private int normalVar = 10;
	// 정적 멤버변수 staticVar 선언(int형) - 20 초기화
	private static int staticVar = 20;
	
	// 일반 메서드 normalMethod() 메서드 정의 - 파라미터, 리턴값 없음
	public void normalMethod() {
		System.out.println("일반메서드 normalMethod()");
		
		// 일반 메서드는 인스턴스가 생성되는 시점에 메모리에 로딩함
		System.out.println("일반 메서드에서 인스턴스 변수 접근 : " + normalVar);
		System.out.println("일반 메서드에서 statoc 변수 접근 :" + staticVar);
	}
	
	// static 메서드 staticMethod() 메서드 정의 - 파라미터, 리턴값 없음
	public static void staticMethod() { 
		System.out.println("정적메서드 staticMethod()");
		
//		System.out.println("static메서드에서 인스턴스 변수 접근 :" + normalVar);
		// 컴파일 에러 발생
		// => 인스턴스 변수는 아직 메모리에 로딩되기 전이므로 접근 불가능
		System.out.println("static 메서드에서 static 뱐수 접근 :" + staticVar);
		// static 메서드에서 일반 메서드 호출 불가! (변수와 원인이 동일하다 new키워드를 만들어야지만 사용가능하다.)
//		normalMethod();
		
		// Getter/Setter 생성 단축키 : alt shift s + r
		// 내용을 가져오는 get에는 파라미터가 없다.
		
	}

	// 인스턴스 변수 normalVar 에 대한 Setter 정의
	public void setNormalVar(int normalVar) {
		this.normalVar = normalVar;
	}
	// static 변수 staticVar 에 대한 Setter 정의
	public static void setStaticVar(int staticVar) {
//		this.staticVar = staticVar;
		// 래퍼런스 this를 사용할수없기 떄문에 오류가 남
		// => 레퍼런스 this는 인스턴스 생성 시점에 생성되지만
		// static 메서드가 로딩되는 시점에는 레퍼런스 this가 존재하지 않는다
		// 래퍼런스 this 대신 클래스명으로 static 변수 접근 가능함
		staticMethod.staticVar = staticVar;
	}
	
}