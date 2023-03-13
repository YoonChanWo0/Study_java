package static_;

public class Ex {

	public static void main(String[] args) {
	
		
		A a = new A(); // 왼쪽 a는 참조변수
		a.method(); // 인스턴스를 만들어야만 호출 가능
		
		method2(); // 
	}
	public static void method2() {
		
	}
}

class A{
	public void method() {
		
//		System.out.println("NormalMember : "+ NormalMember.a); // static이 정의되어 있지 않은 인스턴스 멤버변수 a에 접근하려고하면 에러가 발생한다!
		
		NormalMember n1 = new NormalMember(); // 인스턴스 생성
		NormalMember n2 = new NormalMember(); // 인스턴스 생성
		// => 두개의 인스턴스가 생성되며, 인스턴스 멤버변수도 각각
		//    두 개씩 생성됨
		
		System.out.printf("n1.a : %d, n2.a : %d\n", n1.a, n2.a); // printf("하고싶은말 %d\n",x); : %d에 x가 들어감, ex)문자열일 경우 %s
		System.out.printf("n1.b : %d, n2.b : %d\n", n1.b, n2.b); // ex) int x = 10; print("하고싶은말 %d\n",x); => 하고싶은 말 10 출력
		
		// n1 인스턴스의 인스턴스 멤버변수 a 값을 99로 변경
		// n1 인스턴스의 인스턴스 멤버변수 b 값을 999로 변경
		
		n1.a = 99;
		n1.b = 999;
		
		System.out.printf("n1.a : %d, n2.a : %d\n", n1.a, n2.a);
		System.out.printf("n1.b : %d, n2.b : %d\n", n1.b, n2.b);
		
		// 인스턴스 멤버변수인 a와 b 는 인스턴스마다 생성되므로
		// 하나의 인스턴스에서 인스턴스 멤버변수 값을 바꾸더라도
		// 다른 인스턴스 멤버변수에는 아무런 영향이 없다!
		// => 생성된 메모리 공간이 다르기 떄문!
		
		System.out.println("=================================");
		
		// StaticMember 클래스의 인스턴스 생성 전에 Static 멤버 접근
		System.out.println("StaticMember.a :" + StaticMember.a);
		// => 인스턴스가 생성되기 전이지만 이미 메모리에 로딩되어 있으므로 
		// 클래스명만으로 static 변수에 접근할 수 있다!
		
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		// => 두 개의 인스턴스가 생성되며, 인스턴스 멤버변수 두 개씩 생성됨
		
		System.out.println("s1.a : %d, n2.a : %d\\n\", s1.a, s2.a");
		System.out.println("s2.b : %d, n2.b : %d\\n\", s1.b, s2.b");
		
		s1.a = 99;
		s1.b = 999;
		
		System.out.println("s1.a : %d, n2.a : %d\\n\", s1.a, s2.a");
		System.out.println("s2.b : %d, n2.b : %d\\n\", s1.b, s2.b");
		// Static 멤버변수 값(a)을 s1 인스턴스에서 변경하게 되면
		// s2 인스턴스도 동일한 변수 값을 공유하므로
		// 변경된 값이 두 인스턴스 모두 적용(공유)됨
		// => 즉, 하나의 인스턴스에서 값을 변경하면 모든 인스턴스가
		// 영향을 받음
		
		System.out.println("--------------------------");
		
		s2.a=1000;
		
		System.out.println("s1.a : %d, n2.a : %d\\n\", s1.a, s2.a");
		
		// static 멤버는 참조변수명 대신 클래스명만으로 접근 가능
		StaticMember.a = 500;
//		StaticMember.b = 500;
		//=> 컴파일 에러 발생! 클래스명만으로는 접근 불가!
		
		System.out.println("s1.a : %d, n2.a : %d\\n\", s1.a, s2.a");
		
		System.out.println("--------------------------");
		
		// Static 멤버변수의 대표적인 예
		// => java.lang.Math 클래스의 PI 변수
		System.out.println("PI의 값 :" + Math.PI);
		
	}
	
}

class NormalMember{
	int a = 10; // 인스턴스 변수(=멤버변수 = 필드)
	int b = 20; // 인스터느 변수
}

class StaticMember{
	static int a = 10; // static 멤버변수(= 클래스 멤버변수 = 정적 맴버변수)
	int b = 20; // 인스턴스 변수
}