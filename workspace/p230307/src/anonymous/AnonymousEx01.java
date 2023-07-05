package anonymous;

import anonymous.Super;

/**
 * =========================================
 * 형태 익명 클래스 Anonymous class
 * 
 *  1. 클래스 확장 
 *  2. 인터페이스 구현
 *  3. 인수
 *============================================
 */

class Super{
	public void info() {
		System.out.println("Super class  info  실행됨");
	}
}
class Sub extends Super{
	//constructor
	public Sub() {
		System.out.println(" sub class 생성자 샐행");
	}
	public void show() {
		System.out.println("sub class show() 실행됨");
	}
}
public class AnonymousEx01 {

	public static void main(String[] args) {
		
		// 1. 다형성
//		Super s = new Super();
		
		//2-1. 익명 클래스 클래스 확장
		Super anonymous = new Super() {
			// 생성자 불가능 >>> 클래스 명이 없음
			
			
			//메서드 정의
			@Override
			public void info() {
				System.out.println("anonymous class override 된 메서드 info");
			}
			public void greeting() {
				System.out.println();
			}
			
			//instance method
			//내부에서만 사용 가능 >>>> 외부 호출 불가능
			public void say() {
				System.out.println("아는 익명  클래스야 ");
			}
			
		};
		//2-2. 메서드 호출
		anonymous.info();
//		anonymous.say();
		
		
	}

}
