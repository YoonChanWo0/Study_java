package inheritance;

public class Test4 {

	public static void main(String[] args) {
		// 상속의 기본 개념 복습
		Student s1 = new Student();
		s1.name = "홍길동"; // 슈퍼클래스(Person) 멤버변수를 사용 가능
		
		Student s2 = new Student("이순신", 44, false, true);
		s2.eat(); // Person 클래스로부터 상속받은 메서드
		s2.sleep(); // Person 클래스로부터 상속받은 메서드
		s2.study();
		

	}

}

class Person {
	String name;
	int age;
	boolean isHungry;
	
	public Person() {
		System.out.println("Person() 생성자 호출됨!");
	}
	
	public void eat() {
		System.out.println("밥먹기!");
	}
	
	public void sleep() {
		System.out.println("잠자기!");
	}
}

class Student extends Person {
	boolean isStudyMode;
	
	// 기본 생성자 정의
	public Student() {
		// Student() 생성자가 호출되면 가장 먼저
		// 슈퍼클래스인 Person 클래스의 기본 생성자가 자동으로 호출됨.
		System.out.println("Student() 생성자 호출됨!");
	}

	public Student(String name, int age, boolean isHungry, boolean isStudyMode) {
		// Student(String, int, boolean, boolean) 생성자가 호출되면 가장 먼저
		// 슈퍼클래스인 Person 클래스의 기본 생성자가 자동으로 호출됨.
		System.out.println("Student(String, int, boolean, boolean) 생성자가 호출됨!");
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
		this.isStudyMode = isStudyMode;
	}
	
	public void study() {
		System.out.println("공부하기!");
	}
	
	
}










