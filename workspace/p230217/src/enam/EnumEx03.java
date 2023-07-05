package enam;
/**
 * enum은 field가 먼저 와용 
 *
 */
enum SeasonTwo {
	
	// field 
	// : public static final - 상수(constant)
	// : 값변경 앙되용
	// : field는 enum의 첫 라인에 와야 함
	SPRING, SUMMER, FALL, WINTER;

	// 생성자 : 접근 제어자는 private 고정
	
	private SeasonTwo() {}
	

}

public class EnumEx03 {

	public static void main(String[] args) {

		// enum 객체 생성 불가능
//		SeasonTwo s = new SeasonTwo();
		
		//
		System.out.println(SeasonTwo.SPRING);
		System.out.println(SeasonTwo.FALL);
		System.out.println(SeasonTwo.SUMMER);
		System.out.println(SeasonTwo.WINTER);
		
		// 열거형 상수를 배열 형태로 리턴
		System.out.println(SeasonTwo.values());
		
		// 열거형 상수의 값 확인
		// ordinal() : 서수 - 순서
		for(SeasonTwo s: SeasonTwo.values())
			System.out.println(s.ordinal());
		
		//열거형 변수
		SeasonTwo spring = SeasonTwo.SPRING;
		
		System.out.println("spigng" + spring);
		
		SeasonTwo spring_two = SeasonTwo.SPRING;
		
		if(spring == spring_two)
			System.out.println("r같앙");
		else
			System.out.println("다르다");
		
		//열거형의 상수명 리턴 (field에 저장 된 값
		System.out.println("상수명 >>>>" + Season.SPRING);
		
	}

}
