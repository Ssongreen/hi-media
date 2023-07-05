package abstractclass;

/**
 *  여러 라인 주석 ctrl shift /
 *  한 라인 주석 ctrl /
 *  
 *  
 *  abstract class 추상 클래스 ===================================
 *	-	추상 클래스 내 추상 메서드는 있을 수 없을 수 있엉
 *	-	추상 클래스 객체 생성 불가능
 *	-	다형성(type) 또는 상속 사용
 *
 *	abstract method 추상 메서드 ===================================
 *	-	하다가 만 상태인 body가 없는 키워드 불완전하기에 중간로 없이 
 *		; 따옴표로 맞침을 맺는다. 
 *
 *	-	접근 권한 반환형 메서드 (매개변수){} = 키워드
 *
 *	-	미완성(불완전) 메서드
 *		반드시 추상 클래스 내 존재
 *
 *	-	추상 클래스를 상속 받은 자식 클래스는 
 *		반드시 추상 메서드를 오버라이딩 해야 됭 => 강제성
 *	-	overriding한 메서드의 접근 권한은 "비밀 유지 권한 정도"
 *		부모의 추상 메서드의 접근 권한보다 크거나 같아야 함 
 */

abstract class Parent{
	//field
	private int num;
	
	//method: 추상 메서드는 불안전한 메서드
	abstract public void methodOne();
}
	
class Child extends Parent{
	@Override
	public void methodOne() {
			System.out.println("오버라이딩 된 추상 메서드");
	}
	// instance method
	public void metName() {
		System.out.println("downcasting 추상잉");
	}
	public static void methodThree() {
		System.out.println("static method");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//1. 추상 클래스는 객체 생성할 때, 에러 발생 (클래스는 "자료형 타입") -> 상속은 클래스에 재사용이다.
//		Parent p = new Parent();
		
		//2. 참조 변수 선언 ====== type 으로는 사용가능 (참조 변수)
		Parent p;
		//3. 자식 클래스는 객체 생성이 가능
		Child c = new Child();
		c.methodOne();
		
		//4. 다형성
		Parent pr = new Child();
		pr.methodOne();
//		((Child) Parent).metName();
	}

}
