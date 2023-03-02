
public class Test4 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				// array 배열 내의 모든 요소를 누적변수 sum에 누적
				sum += array[i][j];
				count++;
			}
			
		}	
		// 평균은 합계 계산이 완료된 후 계산하면 되기 때문에 for문 종료 후 계산
		avg = (double)sum / count;
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		
		System.out.println("===============================");
		
		/*
		 * 학생 이름을 1차원 배열(names)에 저장하고
		 * 학생 점수를 2차원 배열(score)에 다음과 같이 저장 후 출력
		 * 		   < 학생 점수표 >
		 * 			국어	영어	수학
		 * 홍길동	 80		 70		 80
		 * 이순신	 90		 90		 90
		 * 강감찬	 50		 60		 77
		 * 손영신	 100	 100	 100
		 * 강병수	 80		 80		 60
		 * -------------------------------------------------------
		 * 학생별 총점을 계산하여 1차원 배열(studentTotal)에 
		 * 다음과 같이 저장 후 출력하세요.
		 * < 학생별 총점 >
		 * 홍길동 : 230점 = 0행(0열, 1열, 2열) => studentTotal[0]
		 * 이순신 : 270점 = 1행(0열, 1열, 2열) => studentTotal[1]
		 * 강감찬 : 187점 = 2행(0열, 1열, 2열) => studentTotal[2]
		 * 손영신 : 300점 = 3행(0열, 1열, 2열) => studentTotal[3]
		 * 강병수 : 220점 = 4행(0열, 1열, 2열) => studentTotal[4]
		 */
		
		// 1차원 배열 names 에 이름 저장
		String[] names = {"홍길동", "이순신", "강감찬", "손영신", "강병수"};
		
		// 2차원 배열 score 에 점수 저장
		int[][] score = {
				{80, 70, 80},
				{90, 90, 90},
				{50, 60, 77},
				{100, 100, 100},
				{80, 80, 60}
		};
		
		System.out.println("     < 학생 점수표 >    ");
		System.out.printf(" %s   국어 영어 수학\n","   ");
		
		for(int i = 0; i < score.length; i++) {
			// 점수를 저장한 2차원 배열의 행크기(score.length)와
			// 이름을 저장한 1차원 배열의 크기(names.length)가 같다!
			// 행크기 반복문의 제어변수로 이름 인덱스 사용 가능!
			System.out.print(names[i]);
			
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf(" %3d ", score[i][j]);
//				System.out.println(score[i][j]);
			}
			
			System.out.println(); // 줄바꿈
			
		}
		
		System.out.println("================================");
		
		int[] studentTotal = new int[5]; // 5명의 총점을 저장할 배열 생성
		
		// 반복문을 사용하지 않고 합계를 계산하는 경우
//		studentTotal[0] = score[0][0] + score[0][1] + score[0][2];
//		studentTotal[1] = score[1][0] + score[1][1] + score[1][2];
//		studentTotal[2] = score[2][0] + score[2][1] + score[2][2];
//		studentTotal[3] = score[3][0] + score[3][1] + score[3][2];
//		studentTotal[4] = score[4][0] + score[4][1] + score[4][2];
//		
//		 System.out.println("< 학생별 총점 >");
//		 System.out.println(names[0] + " : " + studentTotal[0] +"점");
//		 System.out.println(names[1] + " : " + studentTotal[1] +"점");
//		 System.out.println(names[2] + " : " + studentTotal[2] +"점");
//		 System.out.println(names[3] + " : " + studentTotal[3] +"점");
//		 System.out.println(names[4] + " : " + studentTotal[4] +"점");
		
		
		// 학생 점수 누적을 위해 2차원 배열에 대한 반복문 작성 시
	  	System.out.println("< 학생별 총점 >");
	  	
	  	for(int i = 0; i < score.length; i++) {
	  		
	  		for(int j = 0; j < score[i].length; j++) {
	  			// 학생 점수 인덱스 중 행번호에 해당하는 인덱스가
	  			// 학생 총점의 인덱스로 사용될 수 있다!
	  			// => 즉, 각 학생의 행번호(i)를 사용하여 학생의 3과목 점수를
	  			//    총점 배열의 인덱스에 행번호를 사용하여 누적
	  			studentTotal[i] += score[i][j];
	  		}
	  		
	  		// 1명의 점수 누적이 끝난 시점에서 이름과 총점을 출력
	  		System.out.println(names[i] + " : " + studentTotal[i] +"점");
	  	}
		
		
		
		

	}

}
