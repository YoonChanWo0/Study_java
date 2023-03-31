package constant;

import java.util.Calendar;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 상수(Constant)
		 * - 변하지 않는 데이터 = 변하지 않는 데이터를 저장한 변하지 않는 변수
		 * - 보통 클래스 내에서 상수를 선언 시 public static final 형태로 선언
		 *   1) public : 누구나 접근 가능
		 *   2) static : 클래스 로딩 시 함께 로딩되어 인스턴스 생성과 무관하며,
		 *   			 클래스 하나 당 하나만 생성되도, 모든 인스턴스가 공유함
		 *   			 => 클래스명만으로 접근 가능(클래스명.변수명)
		 *   3) final : 데이터 변경 불가 = 상수
		 */

		CarInfo ci = new CarInfo();
		
		// 객체에 차량 정보를 저장하는 경우
		// => 값을 입력할 때 문자열 등의 오타로 인한 오류 발생 가능성 있음
		ci.setCompany("hyundai");
		ci.setCarModelName("SONATA");
		ci.setColor(0x000000); // 복잡한 값을 지정하기 어려움
		
		// 차량 정보를 비교해야 할 경우
		// => 문자열의 경우 대소문자에 대한 차이 등으로 잘못된 판별도 가능
		if(ci.getCompany() == "HYUNDAI") { // hyundai 와 HYUNDAI 는 다른 문자열
			System.out.println("현대자동차입니다!");
		} else {
			System.out.println("현대자동차가 아닙니다!");
		}
		
		if(ci.getCarModelName() == "SONATA") {
			System.out.println("쏘나타입니다!");
		} else {
			System.out.println("쏘나타가 아닙니다!");
		}
		
		System.out.println("==============================================");
		
		CarInfoWithConstant ci2 = new CarInfoWithConstant();
		
		// Setter를 호출하여 값을 저장할 때 직접 입력하지 않고
		// 클래스명.상수명을 통해 상수를 불러와서 지정 가능하므로
		// 잘못된 데이터를 저장할 확률이 낮아지게 된다!
		
		ci2.setCompany(CarInfoWithConstant.COMPANY_HYUNDAI); // 제조사 입력
		ci2.setCarModelName(CarInfoWithConstant.CAR_MODEL_NAME_SONATA); // 모델명
		ci2.setColor(CarInfoWithConstant.COLOR_PERPECT_BLACK); // 색상
		
		// 값을 비교할 때도 상수명만으로 비교하면 되므로 오류 발생 확률 없음
		if(ci2.getCompany() == CarInfoWithConstant.COMPANY_HYUNDAI) {
			System.out.println("현대자동차입니다!");
		} else {
			System.out.println("현대자동차가 아닙니다!");
		}
		
		if(ci2.getCarModelName() == CarInfoWithConstant.CAR_MODEL_NAME_SONATA) {
			System.out.println("쏘나타입니다!");
		} else {
			System.out.println("쏘나타가 아닙니다!");
		}
		
		System.out.println("======================================");
		
		// 상수 활용의 예
		// - Calendar 클래스를 사용하여 날짜 정보를 관리할 때
		//   Calendar 클래스의 get() 메서드를 통해
		//   연도, 월, 일 등의 정보를 가져와야 하는데
		//   항목을 지정할 때 Calender 클래스에서 제공하는 상수를 통해 지정
		Calendar cal = Calendar.getInstance();
		System.out.println("올해는 몇 년도? " + cal.get(Calendar.YEAR));
		
	}

}

// 상수를 활용한 클래스
class CarInfoWithConstant {
	private String company;
	private String carModelName;
	private int color;
	
	/*
	 * 특정 클래스 내에서 사용되는 데이터를 상수로 제공하면
	 * 문자열의 오타나, 정수형 파라미터 사용 시 등의
	 * 다양한 어려움에서 오는 문제점을 해결할 수 있다!
	 * => 주로 상수는 public static final 키워드 사용
	 *    public 에 의해 어디서든 접근이 가능하며,
	 *    static 에 의해 클래스명만으로 인스턴스 생성없이 접근 가능하고,
	 *    final 에 의해 데이터가 변경되지 않음!
	 *    => 상수의 이름은 명확하게 지정함으로써
	 *       복잡한 데이터도 이름만으로 단순히 사용이 가능하게 된다!
	 */
	
	// 1. 제조사 정보를 문자열로 저장하는 상수 선언
	public static final String COMPANY_HYUNDAI = "HYUNDAI";
	public static final String COMPANY_KIA = "KIA";
	public static final String COMPANY_CHEVROLET = "CHEVROLET";
	
	// 2. 차량 모델 정보를 문자열로 저장하는 상수 선언
	public static final String CAR_MODEL_NAME_SONATA = "SONATA";
	public static final String CAR_MODEL_NAME_K5 = "K5";
	public static final String CAR_MODEL_NAME_SPARK = "SPARK";
	
	// 3. 차량 색상 정보를 정수로 저장하는 상수 선언
	public static final int COLOR_PERPECT_BLACK = 0x000001;
	public static final int COLOR_CREAM_WHITE = 0xFFFFCC;
	public static final int COLOR_BARCELONA_RED = 0xFF0000;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCarModelName() {
		return carModelName;
	}
	
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
}

// ------------------------------------------------------------------
// 상수를 활용하지 않는 클래스
class CarInfo {
	private String company;
	private String carModelName;
	private int color;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCarModelName() {
		return carModelName;
	}
	
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
}










