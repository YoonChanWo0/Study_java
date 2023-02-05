
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 논리 연산자(&&, ||, !, ^)
		 * - 두 피연산자간의 논리적인 판별을 수행하는 연산자
		 * - 피연산자는 모두 boolean 타입 데이터(true, false)만 사용 가능하며,
		 *   결과값도 boolean 타입으로 리턴
		 *   
		 * < AND 연산자(& 또는 &&) - 논리곱 >
		 * - 두 피연산자가 모두 true일 경우에만 결과값이 true 이고,
		 *   하나라도 false 일 경우 결과값이 false
		 * - F AND F = F, F AND T = F, T AND F = F, T AND T = T
		 * - 그리고, ~이고 등의 접속사에 해당하는 의미로 사용됨
		 *   => 주로 A ~ B 사이 범위 판별하는데 사용
		 *      ex) A 가 5보다 크고 10보다 작다 
		 *      
		 * < OR 연산자(| 또는 ||) - 논리합 >
		 * - 두 피연산자가 하나라도 true 일 경우 결과값이 true 이고,
		 *   둘 다 false 일 때만 결과값이 false
		 * - F OR F = F, F OR T = T, T OR F = T, T OR T = T 
		 * - 또는, ~이거나 등의 접속사에 해당ㅎ아는 의미로 사용됨
		 *   => 주로 A 조건 또는 B 조건 중 하나라도 만족하는 조건을
		 *      판별하는데 사용
		 *      ex) A 가 0보다 작거나 100보다 크다
		 *  
		 * < NOT 연산자(!) - 논리부정 >
		 * - 단항연산자로 피연산자 앞에 ! 기호를 붙임
		 * - 현재 boolean 값을 반대로 반전(현재 상태 반전)
		 * - !true = false, !false = true     
		 * 
		 * < XOR 연산자(^) - 배타적 논리합(exclusive OR)
		 * - 두 피연산자가 서로 다를 경우 결과값이 true이고,
		 *   서로 같을 경우 결과값이 false
		 * - F XOR F = F, F XOR T = T, T XOR F = T, T XOR T = F
		 * 
		 */

		boolean a = false;
		boolean b = true;
		
		System.out.println("AND(&&) 연산 진리표");
		System.out.println("a(false) && a(false) = " + (a && a));
		System.out.println("a(false) && b(true ) = " + (a && b));
		System.out.println("b(true ) && a(false) = " + (b && a));
		System.out.println("b(true ) && b(true ) = " + (b && b));
		
		System.out.println("----------------------------------");
		
		System.out.println("OR(||) 연산 진리표");
		System.out.println("a(false) || a(false) = " + (a || a));
		System.out.println("a(false) || b(true ) = " + (a || b));
		System.out.println("b(true ) || a(false) = " + (b || a));
		System.out.println("b(true ) || b(true ) = " + (b || b));
		
		System.out.println("----------------------------------");
		
		System.out.println("NOT(!) 연산 진리표");
		System.out.println("!a(false) = " + (!a));
		System.out.println("!b(true ) = " + (!b));
		
		System.out.println("----------------------------------");
		
		System.out.println("XOR(^) 연산 진리표");
		System.out.println("a(false) ^ a(false) = " + (a ^ a));
		System.out.println("a(false) ^ b(true ) = " + (a ^ b));
		System.out.println("b(true ) ^ a(false) = " + (b ^ a));
		System.out.println("b(true ) ^ b(true ) = " + (b ^ b));
		
		System.out.println("==================================");
		
		// 관계 연산자와 결합하여 대소 관계에 대한 논리적인 판별 확인 가능
		int num = 1;
		
		// 두 가지 관계연산을 각각 적용할 경우
		// => 각 연산자에 대한 결과만 판별함
		System.out.println(num > 5);  // num 이 5보다 큰가? false
		System.out.println(num < 10); // num 이 10보다 작은가? true
		
		// 만약, 두 가지 관계연산을 하나로 결합하여 적용할 경우
		// ex) num 이 5보다 크고, 10보다 작은가?
		//     => ~이고, 그리고 등의 의미는 AND 연산자 && 사용하여 결합
		System.out.println(num > 5 && num < 10);
		
		// ex) num 이 0보다 작거나 100보다 큰가?
		//     => ~이거나, 또는 등의 의미는 OR 연산자 || 사용하여 결합
		System.out.println(num < 0 || num > 100);
		
		num = 150;
		
		// NOT 연산자(!)는 현재 조건을 만족하는가 판별
		// ex) num 이 0보다 작거나 100보다 큰 수가 아닌가?
		//     = num 이 0 이상이고 100 이하인 수인가?
		System.out.println(!(num < 0 || num > 100));
		System.out.println(num >= 0 && num <= 100);
		
		
		
		
		
		
	}

}






