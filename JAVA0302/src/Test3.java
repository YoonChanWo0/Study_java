
public class Test3 {

	public static void main(String[] args) {
		/*
		 * 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산하는 문제
		 * 변수 money 의 금액을 동전으로 바꾸었을 때
		 * 각각 몇 개의 동전이 필요한지 계산해서 출력해보자.
		 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다!
		 * (힌트) 나눗셈 연산자와 나머지 연산자를 사용
		 * 
		 * [ 출력 예시 ]
		 * money = 2680;
		 * 500원 = 5
		 * 100원 = 1
		 *  50원 = 1
		 *  10원 = 3
		 */

		// 배열 생성(동전의 액수)
		int[] coinUnit = {500, 100, 50, 10};
		
		// 거스름돈 변수(money) 선언 및 초기화
		int money = 2680;
		
		System.out.println("money = " + money + "원");
		// for문을 통해 배열 접근
		for(int i  = 0; i < coinUnit.length; i++) {
			// => 거스름돈(money)을 각 동전으로 나누었을 때 몫 = 필요 동전 수
			//    거스름돈(money)를 각 동전으로 나눈 나머지 = 남은 거스름돈
			System.out.println(coinUnit[i] + "원 : " + (money / coinUnit[i] + "개") );
			money %= coinUnit[i];
			System.out.println("남은 거스름돈 : " + money + "원");
		}
		
		
		
		
		
	}

}
