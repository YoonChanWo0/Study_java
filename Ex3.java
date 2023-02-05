
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 데이터타입(Data Type) = 자료형
		 * -사용할 데이터의 종류를 구분해 놓은것
		 * - 기본 데이터타입(Primitive Type=기본형)
		 * - 참조 데이터타입(Reference Type=참조형)
		 * 
		 *  1. 기본 데이터타입(8가지)
		 *  --------------------------------------
		 *       1Byte(8bit) 2Byte(16bit) 4Byte(32bit) 8Byte(64bit)
		 *  ---------------------------------------
		 *  논리형 boolean
		 *  정수형 byte  short  int       long
		 *  실수형              float     double
		 *  문자형       char
		 *  ---------------------------------------
		 *  
		 *  (정수형 데이터타입 표현 범위)
		 *  -메모리 크기에 따라 표현 가능한 정수의 범위가 달라짐
		 *  -byte(1Byte = 8bit) : 2^8 = 256가지 = -128 ~ +127 표현 가능
		 *  short(2Byte = 18 bit) : 2^16 =65536가지 = -32768~+32767
		 *  int(4Byte = 32 bit) :  2^32 =약 -21억 ~ +21억 => 정수의 기본형
		 *  int(8Byte = 64 bit) :  2^64 =약 -922경 ~ +922경
		 *  
		 *  
		 *  
		 *  
		 */
		//byte 타입 변수 b 선언(데이터타입 변수명)
         byte b;
         //byte 타입 변수 b에 정수 100 저장(변수명 = 데이터)
         b = 100;
         
         //위의 두 문장(선언 및 초기화)을 한 문장으로 결합
//         byte b = 100;
         
         System.out.println(b); // 변수 b에 저장된 정수 100 출력됨

        b = 127;
   //     b = 128; // 오류 발생! byte 타입에 저장 가능한 수 -128 ~ +127까지
        b = -128;
        System.out.println(b);
        
        // short 타입 변수 s를 선언하고 정수 128 저장
        short s = 128;
        System.out.println(s);
        
        s = 32767;
//        s = 32768;
        // => 오류 발생! short 타입 저장 가능한 정수 -32768 ~ +32767까지
        
        //int형 변수 i를 선언하고 정수 32768 저장 후 출력
        int i = 32768;
        System.out.println(i);
        
        i = 2147483647;
//        i = 2147483648; // 오류 발생!
        // => 정수에 접미사가 없으면 기본적으로 int형의 기본 범위를 사용
        // 최대치가 2147483646 까지만 표기가 가능
        // => int 범위를 벗어나는 리터럴은 반드시 접미사 'L'을 붙여서 사용
        // long 타입으로 표기해야한다!
//        i = 2147483648L; // 오류 발생! long 타입 정수는 int 타입 변수에 저장 
        
        // long 타입 리터럴은 접미사 L을 붙이면 되는데
        // int 타입보다 크지 않은 정수도 접미사 L을 붙이면 long타입으로 취급됨
//        i  = 5L; // 오류 발생! 정수 5는 int범위에 포함되지만, L을 붙이면 
        
        // 실수 데이터타입
        double d = 3.14; // 실수형 데이터타입 (double) 변수 d에 3.14초기화
//        float f = 3.14; // 오류 발생!
        // 접미사가 없으면 double 타입으로 인식되므로 float타입에 변수 저장
        float f = 3.14f;
        System.out.println(d);
        System.out.println(f);
        
        // 논리형 데이터타입
        // boolean 데이터타입 : 특수한 값인 true 또는 false 만 사용 가능
        boolean bool = true;
//        boolean bool = 1; // 타입이 다른 값을 넣으려고 하면 오류 발생!
        
        bool = false;
        System.out.println(bool);
//        bool = FALSE; // 오류 발생!
        
//        System.out.println("--------------------------------");
        
        // 2진수, 8진수, 10진수, 16진수 표현 방법
        // 1. 10진수 : 일반적인 정수 그대로 표현
        int num = 10; // 10진수 10저장
        System.out.println(num);
        
        //2. 2진수 : 0 또는 1 숫자만을 사용하며, 접두사 0b 붙임
        num = 0b1010; // 2진수 -> 10진수로 변환하여 저장됨
        System.out.println(num);
        // 주의! 0 또는 1외의 값 사용 불가
        // num = 0b1012; // 오류 발생! 2 사용 불가
        
        //3. 8진수 : 0~7 사이의 숫자 사용하며, 접두사 0붙임
        num = 012;
        System.out.println(num);
//        num = 018; // 오류 발생! 8 사용 불가
        
        // 4. 16진수 : 0~9 사이의 숫자와 A~F 사이의 알파벳 사용
        //             (0~15), 접두사 0x 붙임
        num = 0xA;
        System.out.println(num);
        num = 0xa; // 16진수 알파벳 대소문자는 무관
        System.out.println(num);
        
//        num = 0xG; // 오류 발생! 16진수 알파벳은 A~F 까지만 사용
        
	}

}
