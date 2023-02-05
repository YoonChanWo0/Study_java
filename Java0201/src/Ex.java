
public class Ex {

	public static void main(String[] args) {
		/*
		 * 화면에 데이터를 출력하는 print(), printf(), println() 메서드
		 * - System.out.XXX() 메서드 형태로 사용
		 * 
		 * 1. println() 메서드
		 *  - 소괄호() 내부에 출력할 데이터를 전달하면 화면에 출력
		 *  - 화면에 데이터를 출력한 뒤 줄바꿈을 수행
		 *    => 출력 후 엔터키 입력한 것과 동일한 결과
		 *  - 아무런 데이터도 전달하지 않을 경우 단순 줄바꿈 기능 수행
		 *  
		 * 2. print() 메서드
		 *  - 소괄호() 내부에 출력할 데이터를 전달하면 화면에 출력
		 *  - 화면에 데이터를 출력한 뒤 줄바꿈 수행하지 않음
		 *  - 아무런 데이터도 전달하지 않을 경우 오류 발생! 
		 *  
		 * 3. printf() 메서드
		 *  - 출력할 데이터가 변수 및 여러 가지 타입이 복합적으로 사용될 경우
		 *    출력할 데이터의 모양을 유지하기 위한 용도로 사용
		 *  - 소괄호() 내부에 출력할 데이터를 전달하면 화면에 출력
		 *  - 화면에 데이터를 출력한 뒤 줄바꿈 수행하지 않음
		 *  - 아무런 데이터도 전달하지 않을 경우 오류 발생! 
		 *    <특징>
		 *    - 소괄호() 내부에 문자열 데이터를 첫번째로 사용하고
		 *      화면에 출력할 데이터 형식을 문자열 내부에서 지정함
		 *      이 때, 변수 등을 사용할 경우 해당 변수가 표시될 자리를
		 *      '형식 지정 문자'를 사용하여 표시만 하고
		 *      문자열이 끝난 후 콤마(,) 기호 뒤에 형식 지정 문자에 들어갈
		 *      데이터를 각각 명시함
		 *      ex) printf("출력할데이터형식", 데이터1, 데이터2, ..., 데이터n)
		 */
		
		System.out.println("Hello, World!"); // "Hello, World!" 출력 후 줄바꿈
		System.out.println("강진석"); // "강진석" 출력 후 줄바꿈
		
		int age = 20;
		System.out.println("나이는 age세 입니다."); // age 가 문자열로 취급됨
		// 만약, age 라는 변수를 사용하여 데이터를 활용해야하는 경우
		// 문자열 바깥에 + 기호를 사용하여 변수를 문자열에 연결해야 함
		System.out.println("나이는 " + age + "세 입니다.");
		
		System.out.println("----------------"); // "---" 출력 후 줄바꿈
		
		System.out.print("Hello, World!");
		System.out.print("강진석");
		System.out.println(); // 줄바꿈 수행(엔터키 역할)
		System.out.print("Hello, World!");
		System.out.print("강진석");
		System.out.print(1);
		System.out.println(); // 줄바꿈 수행(엔터키 역할)
		System.out.println("----------------"); // "---" 출력 후 줄바꿈
		
		// 형식 지정 문자를 사용한 printf() 메서드
		// %d : 10진수 1개를 표현
		// %xd : x 자릿수만큼 자리를 차지
		// %0xd : x 자릿수만큼 자리를 차지하고, 빈자리를 0으로 채움
		System.out.printf("%d", 1);
		// => System.out.println("1"); 와 같은 결과
		System.out.println(); // 줄바꿈
		System.out.printf("나이는 %d세 입니다.\n", 20);
		System.out.printf("나이는 %d세 입니다.", age);
		
		System.out.println(); // 줄바꿈
		System.out.printf("현재 시각은\n%02d시 %02d분 %02d초 입니다.",14,34,5);
		// %d 기호가 3개이므로, 데이터 3개가 순서대로 대입됨
		
		
		System.out.println(); // 줄바꿈
		
		// %f : 실수 표현
		// %.xf : 실수 표현(소수점 x 자리만큼만 표시)
		System.out.printf("평균 나이는 %.1f세 입니다.\n", 27.55);
		
		// %c : 문자 표현
		System.out.printf("정수 65에 해당하는 문자는 %c\n",'A');
		System.out.printf("정수 65에 해당하는 문자는 %c\n", 65);
		
		// char 타입 변수 ch 에 문자 'r' 저장
		char ch = 'r';
		System.out.printf("%c\n", ch);
		
		// %s : 문자열 표현
		// String 타입 변수 str에 문자열 "아이티윌 부산교육센터" 저장
		String str = "아이티윌 부산교육센터";
		System.out.printf("교육기관명 : %s\n", str);
		
		
		String name = "강진석";
		
		System.out.println("나이는 " + age + "세 입니다. 이름은 " + 
							name + "입니다." );
		System.out.printf("나이는 %d세 입니다. 이름은 %s입니다.", age, name);
		
		
		

	}

}





