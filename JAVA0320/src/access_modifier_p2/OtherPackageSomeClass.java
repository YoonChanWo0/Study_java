package access_modifier_p2;

import access_modifier_p1.ParentClass; // import + 클래스명= import문을 통해 생성자를 만듦 

public class OtherPackageSomeClass {

	public static void main(String[] args) {
		// 다른 패키지의 상속 관계가 아닌 다른 클래스에 접근
		// => 인스턴스 생성 후 참조변수를 통해 접근해야 함 = has-a 관계
		// => 다른 패키지이므로 import문이 필요!
		ParentClass p = new ParentClass(); 
		p.publicVar = 10; // public(o)
//		p.pretectVar = 20; // protected(x)
//						   // - 패키지 다르고, 상속 관계가 아니므로 접근 불가!
//		p.defaultVar = 30; // default(x) - 다른 패키지에서 접근 불가!
//		p.privateVar = 40; // private(x) - 다른 클래스에서 접근 불가!
	}

}
