package pattern;

/**
 * 객체 생성 불가능
 * 
 * @abstract class 		추상 클래스
 * @private constructor 
 * @interface 			인터페이스
 *
 */


class Cat{
	private Cat() {
		System.out.println("나눈 고양임");
	}
}

public class PrivateConstructor {

	public static void main(String[] args) {
		
//		Cat cat = new Cat();
	}

}
