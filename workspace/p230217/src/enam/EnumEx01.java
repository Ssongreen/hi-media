package enam;

/**
 * enum 열거형 ******************************
 * jdk 1.5부터 지원 
 * -변수를 상수화  
 * -열거형 상수
 * -멤버 변수(field) 를 모두 대문자 사용
 * -관련있는 상수(constant)를 하나의 이름으로 관리
 * - 첫번째 멤버 변수가 0으로 시작  ~ 1씩 자동으로 증가  
 *
 */

class Season{
	//하나의 객체를 생성해서, 상수로 사용 할 수 있어용
	
	final static Season SPRING = new Season("봄"); 
	final static Season SUMMER = new Season("ㅇㅕ름"); 
	final static Season FALL = new Season("ㄱ ㅏ 을"); 
	final static Season WINTER = new Season("ㄱ ㅕ 울"); 
	
	//field
	private String name;
	
	
	
	//생성자
	private Season(String name) {
		this.name = name;
	}
	//method
	
	@Override
	public String toString() {
		return this.name;
	}
	
}



public class EnumEx01 {



	public static void main(String[] args) {
		
		System.out.println(Season.SUMMER);
		System.out.println(Season.SPRING);
		System.out.println(Season.WINTER);
		System.out.println(Season.FALL);
//		Season season = new Season("계절 이양");
//		System.out.println(season);
	}

}
