package polymorphism;
/**
 * 아래 규칙을 지켜주세용 
 *
 */
class Fruit{
	 //field : 멤버 변수
	String name;
	int count;
	
	//constructor method alt + shift + s + o
	public Fruit() {}
	public Fruit(String name, int count) {
		this.name = name;
		this.count = count;
	}
	// method 
	public void show() {
		System.out.println("부모 클래스 Fruit 이에용");
	}
}
class Banana extends Fruit{
	
	//생성자 alt shift s c 

	public Banana(String name, int count) {
		super(name, count);
	}
	@Override
	public String toString() {
		return " 바나나는 멸종 위기이당";
	}
	//member method 
	public void nameAndCount() {
		System.out.println("현재 과일은 " + super.name + "이에요");
		System.out.println("갯수는" + super.count +"개 이에용");
	}
}
class Apple extends Fruit{

	public Apple() {
		super();
	}

	public Apple(String name, int count) {
		super(name, count);
	}
	@Override
	public String toString() {
		return "나는 사과에용";
	}
	public void showInfo() {
		System.out.println("사과 종류는 :" + super.name + "이에용");
		System.out.println("수량은 :" + super.count + " 개 이에용");
		
		
	}
}

public class Ex01 {
	//메서드 정의 할 때 main 안에 넣지 마세용
	//parameter 매개 변수
	public static void main(String[] args) {
//		Banana banana = new Banana("레드 바나나", 10);
//		System.out.println(banana);
		fruitInfo(new Banana("레드 바나나", 10));
		
//		Apple apple = new Apple("파랑 사과", 6);
//		System.out.println(apple);
		fruitInfo(new Apple("파랑 사과", 6));
		
	}
	//method 정의 (반환형 x void)
	//과일 정보 출력 할꺼에용
	//main method는 중요한 것만 나오고 나머지는 아래로로
	// "다형성" 부모의 참조변수로 자식 객체를 가리킴 
	public static void fruitInfo(Fruit fruit) {									//다형성은 타입에 받는 영향이 많아 진다. 
		System.out.println("-- fruitInfo 메서드 시작");
		System.out.println(fruit.toString());              						//override 되어서 출력 되어용
		fruit.show();
		//문제 upcasting 자동
		if(fruit instanceof Banana)   										// instanceof 를 사용하여 매개 변수를 downcasting으로 만들 수 있게 한다.
			((Banana) fruit).nameAndCount();								// 형변환된 자료형을 먼저 처리 하기 위해 가로를 넣는다. 매개 변수를 banana로 될때만 나타 낼 수 있게
			
		else if(fruit instanceof Apple)										//
			((Apple) fruit).showInfo();
		System.out.println("-- fruitInfo 메서드 종료");
	}

}
