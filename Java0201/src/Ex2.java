
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 자바에서의 데이터타입간의 형변환(타입 변환)
		 * - 어떤 데이터타입이 다른 데이터타입으로 변환되는 것
		 * - 기본 데이터타입 중 boolean 타입을 제외한 나머지 타입간의 변환
		 * 
		 * 자바 데이터타입 크기 관계
		 * byte < short < int < long < float				**long < float 만 주의해서 기억 8byte, 4byte지만
		 * (	char	)
		 * 
		 * 1. 자동 형변환(= 묵시적 형변환 = 암시적 형변환)
		 * - 작은 데이터타입의 데이터를 큰 데이터타입으로 변환하는 것
		 * - 자바 컴파일에 의해 자동으로 형변환이 일어남
		 * 		=> 아무런 문제가 생기지 않으므로 개발자가 신경쓸 필요없이
		 * 			자바에 의해 자동으로 변환됨
		 * 			ex) byte -> int, int -> long, long -> float
		 * - 정수 타입보다 실수 타입이 무조건 큰 타입으로 취급되기 때문에
		 * 		메모리 크기가 long이 flaot보다 더 크더라도 flaot타입이 더 크다
		 * 
		 * 
		 * 2. 강제 형변환(명시적 형변환)
		 * - 큰 데이터타입의 데이터를 작은 데이터타입으로 변환하는 것
		 * - 작은 데이터타입 허용치보다 커서 Overflow(넘침)
		 * 		=> 따라서, 자바가 자동으로 형변환을 수행해주지 않음
		 * 
		 * - 반드시 우변의 데이터 앞에 '형변환 연산자'를 사용하여
		 * 		강제 형변환 수행해야함(형변환 연산자에는 좌변의 작은 데이터 타입명 명시)
		 * 		=> '(작은데이터타입명)우변의데이터' 형식으로 지정		ex) (short)b1;
		 * - 강제 형변환으로 인해 오류가 없어지더라도
		 *   형변환 후의 데이터는 원본 데이터와 다를 수 있음(= Overflow)
		 *   => 따라서 형변환 후의 책임을 개발자에 맡김
		 * - 작은 데이터타입 허용치 이내의 데이터일 경우
		 * 	 강제 형변환 후에도 원본 데이터가 유지될 수 있다.
		 */
		
		int a1 = 32768; //큰 데이터타입
		short a2 = 32767; //작은 데이터타입
		
		System.out.printf("변환 전 a1(int) : %d, a2(short) : %d\n", a1, a2);
		
		// 자동 형변환
		// 작은 데이터타입(a2) 데이터를 큰 데이터타입(a1)으로 이동
		a1 = a2; // 컴파일러에 의해 자동으로 형변환 일어남
		// => 변환 후에도 원본 데이터에는 아무런 영향이 없다.
		
		System.out.printf("변환 전 a1(int) : %d, a2(short) : %d\n", a1, a2);
		
		System.out.println("=================================================");
		
		int b1 = 9999999; //큰 데이터타입
		short b2 = 32767; // 작은 데이터타입
		
		System.out.printf("변환 전 b1(int) : %d, b2(short) : %d\n", b1, b2);
		
		// 강제 형변환
		// 큰 데이터타입(b1) 데이터를 작은 데이터타입(b2)로 이동
//		b2 = b1;	// => 타입이 다르므로 오류 발생
		
		
		
		b2 = (short)b1;
		System.out.printf("변환 후 b1(int) : %d, a2(short) : %d\n", b1, b2);
		
		
		System.out.println("====================================================");
		
		int c1 = 100;
		short c2 = (short)c1;	// (short)가 없으면 오류 발생, 강제 형변환 필수
		
		System.out.printf("변환 후 c1(int) : %d, c2(short) : %d\n", c1, c2);
		// => short 타입에 저장 가능한 범위 내의 데이터이기 때문에
		//	  명시적 형변환 후에도 Overflow 발생이 없으므로 원본 데이터 유지됨
		
		System.out.println("====================================================");
		
		// 정수 -> 실수로 변환하는 경우
		int d1 = 100;
		double d2 = 3.14;
		
		System.out.printf("변환 전 d1(int) : %d, d2(double) : %f\n", d1, d2);
		
		d2 = d1; // <= 자동 형변환(= 묵시적 형변환)
				// => double 타입이 int 타입보다 크므로 컴파일러에 의해서 자동으로 변환
		
		System.out.printf("변환 후 d1(int) : %d, d2(double) : %f\n", d1, d2);
		System.out.println("=====================================================");
		
		// 실수 -> 정수로 변환하는 경우
		int e1 = 100;
		double e2 = 3.14;
		
		System.out.printf("변환 전 e1(int) : %d, e2(double) : %f\n", e1, e2);
		
//		e1 = e2; // int타입이 double타입보다 작으므로 오류 발생
		
		e1 = (int)e2;
		System.out.printf("변환 후 e1(int) : %d, e2(double) : %f\n", e1, e2); //<= 소수점 앞에있는 숫자만 출력
		
		System.out.println("=====================================================");
		
		// long타입(8Byte) vs float(4Byte)
		long l = 100L;
		float f = l; // long => float 변환 시 자동 형변환 가능
		
		System.out.printf("변환 전 l(long) : %d, f(float) : %f\n", l, f);
		
		
//		l = f; // => 오류 발생, float=>long 변환 시 자동 형변환 불가
		l = (long)f; // 강제형변환 시켜주면 오류 발생하지 않음
		
		System.out.printf("변환 후 l(long) : %d, f(float) : %f\n", l, f);

	}

}
