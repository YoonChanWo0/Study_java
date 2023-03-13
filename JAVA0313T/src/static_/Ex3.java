package static_;

public class Ex3 {
	
	/*
	 * static 멤버와 인스턴스 멤버의 메모리 할당 순서
	 * 0. Ex3 클래스가 메모리에 로딩됨
	 * 1. static 키워드가 선언된 모든 멤버가 메모리에 로딩됨
	 * 2. static 멤버가 메모리에 로딩될 때
	 *    static 변수 a 와 c 에 check() 메서드 리턴값이 전달되어야 하므로
	 *    static 메서드인 chekc() 메서드 호출됨
	 *    => 2-1. "static 변수 a" 출력(static 변수 a 로딩됨)
	 *    => 2-2. "static 변수 c" 출력(static 변수 c 로딩됨)
	 * 3. main() 메서드 자동으로 호출됨
	 *    => "main() 메서드 호출!" 출력
	 * 4. main() 메서드 내에서 Ex3 인스턴스 생성됨
	 * 5. Ex3 인스턴스 생성 시 인스턴스 변수 b 가 메모리에 로딩되며
	 *    인스턴스 변수 b 가 로딩될 때 check() 메서드가 호출됨
	 *    => "인스턴스 변수 b" 출력
	 * 6. Ex3 인스턴스 생성 후 main() 메서드의 다른 코드 실행
	 *    => "Ex3 인스턴스 생성 완료" 출력
	 *    
	 */

	int b = check("인스턴스 변수 b");
	
	static int a = check("static 변수 a");
	
	public static int check(String str) {
		System.out.println("check() 호출 : " + str);
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("main() 메서드 호출!");
				
		Ex3 ex = new Ex3();
		System.out.println("Ex3 인스턴스 생성 완료!");
		
	} // main() 메서드 끝
	
	static int c = check("static 변수 c");

} // Ex3 클래스 끝
