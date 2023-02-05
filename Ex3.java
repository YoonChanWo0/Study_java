
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * char 타입과 byte & short 타입 간의 관계
		 * - byte 타입(1Byte = 8bit) : -128 ~ +127
		 *   short 타입(2Byte = 16bit) : -32768 ~ +32767
		 *   char 타입(2Byte = 16bit) : 0 ~ 65535
		 * - char 타입의 경우 문자 표현을 위해 양수로만 표현하므로
		 *   byte 타입과 short 타입에 비해 양수 표현 범위가 크다.
		 *   또한, byte 타입과 short 타입은 음수까지 표현이 가능하므로
		 *   char 타입에 비해 음수 표현 범위가 크다.
		 *   => 따라서, char 타입과 byte 또는 short 타입 양방향 간에는
		 *      자동 형변환이 일어나지 않고, 반드시 강제 형변환 필수! 
		 */
		
		byte b = 100;
		short s = 65;

		char ch;
		
		// byte 타입 -> char 타입으로 변환
//		ch = b; // 오류 발생! byte <-> char 명시적 형변환 필수!
		ch = (char)b; // char 타입으로 강제 형변환
		System.out.println(ch);
		
		// char 타입 -> byte 타입으로 변환
//		b = ch; // 오류 발생! byte <-> char 명시적 형변환 필수!
		b = (byte)ch; // byte 타입으로 강제 형변환
		System.out.println(b);
		
		System.out.println("-------------------------------------");
		
		// short 타입 -> char 타입으로 변환
//		ch = s; // 오류 발생! short <-> char 명시적 형변환 필수!
		ch = (char)s; // char 타입으로 강제 형변환
		System.out.println(ch);
		
		// char 타입 -> short 타입으로 변환
//		s = ch; // 오류 발생! short <-> char 명시적 형변환 필수!
		s = (short)ch; // short 타입으로 강제 형변환
		System.out.println(s);
		
		System.out.println("================================");
		
		// int형 타입은 char 타입 데이터를 온전히 담을 수 있다!
		// int형 변수 i에 변수 ch 값 저장
		int i = ch; // char -> int 자동 형변환 가능!
		System.out.println(i);
		
		
		
	
	}

}
















