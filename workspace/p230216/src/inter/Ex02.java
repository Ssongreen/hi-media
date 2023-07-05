package inter;

import javax.swing.tree.VariableHeightLayoutCache;

/**
 * -------------------------------------------------------
 * interface 인터페이스
 * -추상 클래스보다 엄격해진 자료형
 * -추상 클래스의 upgrade된 자료형
 * - 객체 생성 불가능 -- > 다형성(type) 과 상속으로 사용
 * 
 * "field"
 * public static final로 고정 >>>>>> constant(변수의 상수화) ==>cataphil 대문자
 * 
 * 
 * "method"
 * public abstract : 추상 메서드
 * --------------------------------------------------------
 * 
 */

interface Variable {
	
	//filed : public static final "초기화 필수에요용"
	int num1 = 100;
	static int num2 = 200;
	final int num3 = 300;
	public static final int num4 = 400;
	
	//method 
}
public class Ex02 {
	public static void main(String[] args) {
		
		//1.객체 생성
		// interface는 객체 생성 불가능
//		variable v = new Variable();
		
		//2. 멤버 변수
//		Variable.num1 = 1; // final 변수로 값 변경 불가해용
		System.out.println(Variable.num1);
		System.out.println(Variable.num2);
		System.out.println(Variable.num3);
		System.out.println(Variable.num4);
	}
}
