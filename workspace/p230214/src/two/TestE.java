package two;

import one.TestA;
public class TestE extends TestA {
	
	//멤버 메서드
	void show() {
//		System.out.println(num1); // private 접근 허용 ㄴ
//		System.out.println(num2); // default 같은 패키지만 허용
		System.out.println(num3); // protected : 다른 패키지 상속 됨
		System.out.println(num4);
	}
}
