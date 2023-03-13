package static_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * < 자바 프로그램 실행 과정 >
		 * 0. 소스 코드 작성 및 컴파일 후 클래스 실행
		 * 1. 클래스 로딩
		 *    => static 변수 및 메서드가 메모리에 로딩됨
		 * 2. main() 메서드 호출(실행)
		 * 3. 인스턴스 생성
		 *    => 인스턴스 변수 및 메서드가 메모리에 로딩됨
		 * 4. 인스턴스 메서드 호출(실행)
		 *    => 로컬 변수가 메모리에 로딩됨
		 * 5. 결과 출력
		 * 6. 프로그램 종료
		 * 
		 * < static 키워드 >
		 * - 클래스, 메서드, 변수의 제한자로 사용
		 * - 메서드 또는 변수에 static 키워드를 사용할 경우
		 *   인스턴스 생성과 상관없이 클래스가 로딩되는 시점에
		 *   메모리에 로딩됨
		 *   (클래스가 로딩되는 Method Area 에 함께 로딩됨)
		 *   => 따라서, 참조변수 없이 클래스명만으로 멤버에 접근 가능함
		 *      (= 인스턴스 생성 없이도 접근 가능한 멤버)
		 * - 클래스명.멤버변수명 형태로 접근
		 * 
		 */
//		System.out.println("NormalMember.a : " + NormalMember.a);
		// => 컴파일 에러 발생
		// => Cannot make a static reference to 
		//    the non-static field NormalMember.a
		// => static 이 정의되어 있지 않은 인스턴스 멤버변수 a에 접근하려고
		//    하면 에러가 발생한다!
		
		NormalMember n1 = new NormalMember(); // 인스턴스 생성
		NormalMember n2 = new NormalMember(); // 인스턴스 생성
		// => 두 개의 인스턴스가 생성되며, 인스턴스 멤버변수도 각각
		//    두 개씩 생성됨
		
		System.out.printf("n1.a : %d, n2.a : %d\n", n1.a, n2.a);
		System.out.printf("n1.b : %d, n2.b : %d\n", n1.b, n2.b);
		
		// n1 인스턴스의 인스턴스 멤버변수 a 값을 99로 변경
		// n1 인스턴스의 인스턴스 멤버변수 b 값을 999로 변경
		
		n1.a = 99;
		n1.b = 999;
		
		System.out.printf("n1.a : %d, n2.a : %d\n", n1.a, n2.a);
		System.out.printf("n1.b : %d, n2.b : %d\n", n1.b, n2.b);
		
		// 인스턴스 멤버변수인 a 와 b 는 인스턴스마다 생성되므로 
		// 하나의 인스턴스에서 인스턴스 멤버변수 값을 바꾸더라도
		// 다른 인스턴스 멤버변수에는 아무런 영향이 없다!
		// => 생성된 메모리 공간이 다르기 때문!
		
		System.out.println("===================================");
		
		// StaticMember 클래스의 인스턴스 생성 전에 static 멤버 접근
		System.out.println("StaticMember.a : " + StaticMember.a);
		// => 인스턴스가 생성되기 전이지만 이미 메모리에 로딩되어 있으므로
		//    클래스명만으로 static 변수에 접근할 수 있다!
		
		StaticMember s1 = new StaticMember(); // 인스턴스 생성
		StaticMember s2 = new StaticMember(); // 인스턴스 생성
		// => 두 개의 인스턴스가 생성되며, 인스턴스 멤버변수도 두 개씩 생서됨
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		System.out.printf("s1.b : %d, s2.b : %d \n", s1.b, s2.b);
		
		s1.a = 99; // staic(클래스 = 정적) 멤버변수 값을 변경
		s1.b = 999; // 인스턴스 멤버변수 값을 변경
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		System.out.printf("s1.b : %d, s2.b : %d \n", s1.b, s2.b);
		// Static 멤버변수 값(a)을 s1 인스턴스에서 변경하게 되면
		// s2 인스턴스도 동일한 변수 값을 공유하므로
		// 변경된 값이 두 인스턴스 모두 적용(공유)됨
		// => 즉, 하나의 인스턴스에서 값을 변경하면 모든 인스턴스가 
		//    영향을 받음
		
		System.out.println("---------------------------");
		
		s2.a = 1000;
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		
		// static 멤버는 참조변수명 대신 클래스명만으로 접근 가능
		StaticMember.a = 500;
//		StaticMember.b = 500; 
		//=> 컴파일 에러 발생! 클래스명만으로는 접근 불가! 
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		
		System.out.println("===============================");
		
		// Static 멤버변수의 대표적인 예
		// => java.lang.Math 클래스의 PI 변수
		System.out.println("PI 값 : " + Math.PI);
		
	}
	
}

class NormalMember {
	int a = 10; // 인스턴스 변수(=멤버변수 = 필드)
	int b = 20; // 인스턴스 변수
}

class StaticMember {
	static int a = 10; // static 멤버변수(= 클래스 멤버변수 = 정적 멤버변수)
	int b = 20; // 인스턴스 멤버변수
}






