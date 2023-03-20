package access_modifier_p1;

public class SamePackageSomeClass {
	
	
	public void useMember() {
		// 같은 패키지 내의 다른 클래스(ParentClass)의 멤버 접근
		// => 인스턴스 생성 후 참조변수를 통해 접근해야 함 =has-a 관계
		// => 같은 패키지이므로 import문 불필요!
		ParentClass p = new ParentClass();
		p.publicVar = 10; // public(o)
		p.protectedVar = 20; // protected(o)
		p.defaultVar = 30; // default(o)
//		p.privateVar = 40; // 오류발생! private(x) - 다른 클래스에서 접근 불가
	}
}
