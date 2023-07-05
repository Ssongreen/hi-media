package inner;

/**
 * inner class 
 * - 클래스 내부에 선언 또 다른 클래스 
 * - Outer class(외부 클래스)와 Inner class(내부 클래스)는
 * 	 서로 긴밀한 관계를 맺고 있을 때 선언
 * 
 * * 장점 a) Inner class (내부 클래스) 는 Outer class 멤버에 접근 가능 
 * 		  b) 서로 관련 있는 클래스를 논리적으로 묶어 표현함으로, 코드의 캡슐화 증가
 * 		  c) 외부에서 Inner class 접근 할 수 없으므로 코드의 복잡성을 줄일 수 있음
 * 
 * 클래스 안에 오는 클래스 형태 4가지
 * 
 * 1. instance class 일반 중첩 클래스 일반적인 클래스
 *		- outer class 영역에 선언된 Inner class 중 static 키워드를 가지지 않은 클래스
 *		- outer class의 field나 method에 사용될 목적으로 정의
 *		- class 관리 효율 높힘
 * 2. 정적 클래스(static 중첩 클래스, static inner class)
 * 		- outer class 영역에 선언된 Inner class 중 static 키워드를 가진 클래스
 * 		- 주로 outer class의 static method에서 사용될 목적으로 정의
 * 3. 지역 클래스 (local 중첩 클래스, local inner class)
 * 		- outer class 의 method나 constructor에 선언된 클래스 -> body에 정의된 클래스
 * 4. 익명 클래스 (anonymous inner class)
 * 		- 다른 inner class와 달리 이름 없는 클래스
 * 		- 클래스 정의와 동시에 객체 생성하므로, 일회용 클래스
 * 		- 생성자를 정의 못해
 * 		- 매우 제한적으로 사용
 * 		- 오버라이딩하여 함수 재정의 목적
 *		문법 
 *		클래스명 참조변수 = new 클래스명 (){
 *			메서드 정의 
interface Yahoo{
	public void showNum;
 *		};
 */

class Outer { // outer class (외부 클래스)
	class Inner { // Inner class (내부 클래스)
		int num;
		public Inner getInner(int num) {
			return new Inner(num);
		}
		public Inner(int num) {
			this.num = num;
		}
		void showNum() {
			System.out.println("Inner class : num >> " + this.num);
		}
		
}
}
public class InstanceClassEx01 {

	public static void main(String[] args) {
//		Outer outer = new Outer();
//		Outer.Inner in = outer.new Inner(5);
		
		Yahoo yahoo = outer.getInner(8);
	}		
}
	


