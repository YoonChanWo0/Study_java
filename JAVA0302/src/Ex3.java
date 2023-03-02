
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 배열 내의 데이터에 대한 연산 누적
		 * 0. 연산을 누적할 변수 선언 및 초기화
		 * 1. 배열 생성 및 데이터 저장
		 * 2. for문을 사용하여 배열 내의 모든 인덱스에 차례대로 접근
		 *    => 배열의 인덱스 번호를 제어변수로 지정하여
		 *       해당 배열 내의 데이터를 누적 변수에 누적
		 * 3. for문 종료 후 누적 변수 값 사용
		 */
		
		// 0. 합계를 누적할 누적변수(int형 변수 total) 선언 및 초기화
		int total = 0;
		
		// 1. 정수형 데이터 1 ~ 10까지를 저장하는 배열 arr 생성
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 2. for문을 사용하여 배열 내의 모든 인덱스에 차례대로 접근
		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]); // 배열 내의 모든 데이터 출력
			
			// 배열 내의 모든 데이터를 차례대로 total 변수에 누적
			total += arr[i]; // 배열 arr 의 i번 인덱스 데이터를 total 에 누적
			
		}
		
		// 3. 누적 변수(합계) 출력
		System.out.println(total);
		
		System.out.println("============================");
		
		int oddTotal = 0; // 홀수의 합을 누적할 변수
		int evenTotal = 0; // 짝수의 합을 누적할 변수
		
		// 배열 내의 모든 인덱스에 차례대로 접근
		// => 이 때, 각 인덱스 데이터가 홀수, 짝수일 때 각각의 변수에 누적
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) { // 배열 데이터 arr[i] 가 짝수일 때
				// 짝수 합을 저장하는 evenTotal 에 배열 데이터를 누적
				evenTotal += arr[i];
			} else { // 배열 데이터 arr[i] 가 홀수일 때
				// 홀수 합을 저장하는 oddTotal 에 배열 데이터를 누적
				oddTotal += arr[i];
			}
		}
		
		System.out.println("배열 내의 홀수의 합 = " + oddTotal); // 25
		System.out.println("배열 내의 짝수의 합 = " + evenTotal); // 30
		
		System.out.println("============================");
		
		// 배열 내의 정수 중 최대값을 max 에 저장 후 출력
		int max = 0;
		int[] array = {1, 5, 3, 8, 7};
		
		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
			
			// max에 저장된 값과 배열(array)의 i번에 저장된 값을 비교하여
			// max 값 보다 배열 데이터(array[i]) 더 클 경우
			// 배열 데이터(array[i])를 max 변수에 저장
			if(array[i] > max) { // if(max < array[i]) {}
				System.out.println(array[i] + "가(이)" + max + "보다 크다!");
				max = array[i];
				System.out.println("=======> max = " + max);
			} else {
				System.out.println(array[i] + "가(이)" + max + "보다 크지 않다!");
			}
		}
		
		System.out.println("max = " + max);
		
		System.out.println("==============================");
		
		// 주의! 최대값 등의 비교 시 비교 대상을 변수에 직접 저장할 경우
		// 조건에 만족하지 않은 데이터가 있을 수 있다!
		// 따라서, 배열 내의 데이터를 비교해야 하는 경우
		// 비교 대상 값으로 배열 내의 데이터를 갖고 시작하는 것이 좋다!
		// ex) 음수끼리의 최대값을 계산하는데 초기값으로 0을 설정하는 경우
		//     모든 데이터가 0 보다 크지 않으므로 최대값 계산이 불가능하게 됨
		//     => 따라서, 0 대신 배열의 첫 번째 데이터를 초기값으로 갖고 비교
		
		int[] array2 = {-9, -5, -3, -8, -7};
		
		// array2 배열의 0번 인덱스 데이터를 최대값으로 저장
		int max2 = array2[0];
		
		// 주의! 0번의 데이터를 이미 최대값으로 저장했기 때문에
		// 0번 인덱스를 제외한 나머지값만 비교하면 됨(1번부터 반복)
		for(int i = 1; i < array2.length; i++) {
			System.out.println(array2[i] + " vs " + max2);
			if(array2[i] > max2) {
				max2 = array2[i];
			}
		}
		
		System.out.println("max2 = " + max2);
		
	}

}







