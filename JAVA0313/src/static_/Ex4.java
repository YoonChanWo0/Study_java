package static_;

public class Ex4 {

	public static void main(String[] args) {
		
		// SingletonClass 클래스의 인스턴스 생성
//		SingletonClass cs = new SingletonClass(); // <- new 뒤에 있는 SingletonClass는 생성자 이름
//		SingletonClass cs2 = new SingletonClass();
		// => 생성자가 private 접근제한자이므로 외부에서 호출 불가
		// 즉, 외부에서 인스턴스 생성이 차단됨
		
		// 클래스 내에서 인스턴스를 생성하여 멤버변수 instance에 주소값을
		// 저장했기 때문에 해당 변수를 통해 인스턴스의 주소값을 가져올 수 있음
		// => 이 때, 해당 변수는 static 변수이므로 클래스명만으로 접근 가능함.
//		 SingletonClass sc = SingletonClass.instance;
		
		// 주의! SingletonClass 로 부터 리턴받은 인스턴스를 통해
		// 클래스 내의 SingletonClass 타입 변수 instance 에 접근이 가능하므로
		// 해당 변수 값을 변경할 우려가 있음.
//		 SingletonClass.instance=null;
//		 sc.instance = null;
		 // => 외부에서 멤버변수에 함부로 접근하지 못하도록
		 // private 접근제한자를 붙여서 외부 접근을 차단해야 한다!
		 
		 // SingletonClass 내에서 싱글톤 디자인 패턴으로 생성된 인스턴스를
		 // 변수 instance에 저장했으나, private 접근제한자로 인해 접근 불가하므로
		 // getInstance() 메서드 호출을 통해 가져오기
		 // => 이 떄, getInstance() 메서드는 static 메서드이므로
		 // 클래스명,메서드명() 형태로 호출 가능
		 // => 즉, 인스턴스 생성 없어도 클래스 내의 메서드 호출 가능
		 SingletonClass sc = SingletonClass.getInstance();
		 
		 // 리턴받은 인스턴스는 참조변수(sc)를 통해 접근 가능함
		 sc.str = "싱글톤 패턴으로 생성한 인스턴스의 str";
		 // SingletonClass 타입 변수 sc2에 인스턴스를 리턴받아 저장
		 SingletonClass sc2 = SingletonClass.getInstance();
		 // 리턴받은 인스턴스는 참조변수(sc2)를 통해 접근 가능함
		 System.out.println("sc.str :"+ sc.str);
		 System.out.println("sc2.str :"+ sc2.str);
		 
		 if(sc == sc2) {
			 System.out.println("sc와 sc2는 같은 인스턴스!");
		 }else {
			 System.out.println("sc와 sc2s는 다른 인스턴스!");
		 }
		 
		
	}//main 클래스 끝

}//Ex4 클래스 끝
class SingletonClass{
	String str; // 임시 확인용 변수
	
	// 기본생성자 정의 : 접근제한자가 붙어 있으면 같은 패키지 내에서 누구나 사용가능하다
//	public SingletonClass() {}
	
	// 1. 외부에서 생성자 호출이 불가능하도록
	// 생성자에 private 접근제한자 선언
	private SingletonClass() {} // 생성자 앞에 private 을 붙이면 외부에서 다른 생성자를 사용하지 못하도록 한다.
	
	// 2. 자신의 클래스 내에서 인스턴스를 직접 생성 후 참조변수에 저장
	// => 인스턴스 생성없이 접근을 해야함으로 static 키워드 사용
	// 외부에서 함부로 접근하지 못하도록 private 접근제한자 선언
	private static SingletonClass instance = new SingletonClass(); // static이 없으면 Ex4에서 사용할 수가 없다.
	
	// 3. 생성된 인스턴스를 외부로 리턴하는 Getter 메서드 정의
	// => 인스턴스를 저장하는 변수 instance 가 private 접근제한자이므로
	// 접근이 불가능한 대신 인스턴스를 리턴하는 목적으로 정의
	// => 인스턴스 생성없이 접근해야하므로 static 키워드 사용
	public static SingletonClass getInstance() {
		return instance;
	}
	
	
}
