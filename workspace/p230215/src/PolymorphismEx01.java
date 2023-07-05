/**
 * @polynorphism
 * 다형성
 * 1. 부모의 참조변수로 자식 객체를 찾아가는 것 (가르키다)
 * 2. 부모의 참조변수는 부모의 멤버만 접근 가능
 * 	 단, 오버라이팅 된 메소드(자식 멤버 메서드)는 접근 가능
 * 3. 참조현의 형변환 : 
 * 
 *  		 부모 class type 
 *  downcasting 		|			|	 	upcasting
 *  강제형변환		 	|			|
 *  부모-> 자식			|			|
 *  		 자식 class type
 * 
 */

class Parent{
	private int money = 100_000;
	public void spend(int money) {
		this.money = money;
		System.out.println("남은 돈" + this.money + "입니다");
	}
	public void working() {
		System.out.println("부모님은 일하는중");
	}
	
}

class Son extends Parent{
	public void play( ) {
		System.out.println("slay~~");
	}
	/**
	 * @see method overriding
	 * 상속 관계에서 부모의 멤버 메서드를 자식이 재정의 선언부는 그대로 사용하고, 
	 * body(기능)만 수정 접근권한은 부모의 멤버 메서드의 접근권한보다 크거나 같아야 함
	 */
	@Override
	public void spend(int money) {
		System.out.println("@@@@@@@@@@ overriding method @@@@@@");
		System.out.println("놀래 " + money +"입니다");
	

	}
}

class Daughter extends Parent{
	public void study() {
		System.out.println("study~~");
	}
	@Override
	public void spend(int money) {
		System.out.println("######overriding######");
		System.out.println("학원비 " + money);
	}
}
class Fruit{
}

public class PolymorphismEx01 {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		/**
		 * 다형성
		 * 부모의 참조변수로 자식의 객체를 가리킴
		 */
		Parent p2 = new Son();
//		p2.play(); 불가함
		p2.spend(1000);
		
		Parent p3 = new Daughter();
		p3.spend(200);
		
//		Daughter d = new Parent();
		//객체 배열
		
		//첫번째 형태 객체 배열 생성 후 초기화
//		Parent[] p4 = new Parent[2];
//		p4[0] = new Son();
//		p4[1] = new Daughter();
		
		//두번째 형태
		//객체 배열 생성과 동시에 초기화
//		Parent p4[] = new Parent[2] {new Son(), new Daughter()};
		Parent p4[] = {new Son(), new Daughter()};
		p4[0].spend(11);
		p4[1].spend(22);
		
		/**
		 *  형변환
		 *  1. 다형성
		 *  2. 참조형의 형변환
		 *  3. 형변환 가능 여부
		 */
		//1. 다형성
		Parent pr = new Son();
		pr.spend(1111);
		//pr.play(); 앙되
		//2. 참조형의 형변환
			Son so = (Son) pr;    // 부모 타입 -> 자식 타입 : 강제형변환(downcasting)
			so.spend(2222);
			so.play();
		// cf) 참조형의 자동 형변환
		
			Son sn = new Son();
			Parent pt = sn;       //자식 타입 -> 부모 타입 : 자동형변환(upcasting)
			
		// cf) 참조형에서의 형변환은 부모와 자식 관계에서만 가능
//			overriding 이 없기에 안되용
//			Fruit f = (Fruit) sn; 
			
		// cf) 기본자료형의 형변화
			byte by = 10;
			char ch = (char) by; // 강제 형변환
			
			
		// 3. 형변환 가능 여부	
		// 문법 참조 변수 or 객체 instance of 클래스 
			System.out.println(pr instanceof Son);
			System.out.println(pr instanceof Parent);
			System.out.println(p instanceof Parent);
			System.out.println(p instanceof Son);
		
			Daughter d = new Daughter();
			Son s = new Son();
			
			System.out.println(s instanceof Son);
//			System.out.println(s instanceof Daughter);
			
			
			
//		Son s = new Son();
//		s.spend(1_000_000);
		
		
	}

}
