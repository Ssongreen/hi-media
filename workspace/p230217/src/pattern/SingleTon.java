package pattern;

/**
 * ++++++++++++++++디자인 패턴+++++++++++++++++++++++++++ -객체지향 언어의 장점들을 모아 가장 효율적으로
 * 개발할 수 있게 만들어 놓은 틀 - singleton : 객체를 유일하게 하나만 생성 "전역 개념"
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
class Pattern{
	
	//field 
	private static Pattern member_field = new Pattern();
	
	//외부에서 객체 생성 불가능
	private Pattern() {}
	
	//method
	public static Pattern getMember() {
		System.out.println("be reading to pattern class and that in the member_field " + member_field);
		return member_field;
	}
	@Override
	public String toString() {
		return "Is Pattoern class"; 
	}
	// 첫번째에용 *************************************************
//	private static int i = 100;
//	public static int getI() {
//		return i;
//	}
	//두번째 ******************************************************
	private int i = 100;
	public int getI() {
		return this.i;
		
	}
	
}


public class SingleTon {
	public static void main(String[] args) {
//		Pattern p = new Pattern();
//		Pattern p2 = new Pattern();
//		
//		Pattern p = Pattern.meber_field();
		
		Pattern p = Pattern.getMember(); 
		System.out.println(p);
//		System.out.println(Pattern.getI());
		System.out.println(p.getI());
		
	}
	
}
