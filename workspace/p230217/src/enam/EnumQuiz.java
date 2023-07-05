package enam;

enum Shoes{
	WALKING("워킹화"), RUNNING("러닝화"), TRACKING("트레킹화"), HIKING("하이킹화");
	
	String name;
	
	Shoes(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	
	
}

public class EnumQuiz {

	
	public static void main(String[] args) {
		
		System.out.println(">>> 상수 출력 >>>");
		System.out.println(Shoes.WALKING);
		System.out.println(Shoes.RUNNING);
		System.out.println(Shoes.TRACKING);
		System.out.println(Shoes.HIKING);
		System.out.println(">>>>>>>>>>>>>상수 값>>>>>>>");
		
		for(Shoes s: Shoes.values()) //values 참조 변수 반복으로 "중요" 
			System.out.println(s.getName()); 
		System.out.println(Shoes.WALKING.getName());
	}

}
