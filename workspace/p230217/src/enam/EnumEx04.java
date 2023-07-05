package enam;


enum Number{
	// eum constant
	ONE(1), TWO(2), THIREE(3), FOUR(4);
	//field
	int num;
	//생성자 
	Number(int num) {
		this.num = num;
	}
	//getter 
	public int getNum() {
		return this.num;
	}
	
}

public class EnumEx04 {


	
	
	public static void main(String[] args) {
		System.out.println(" number.ONE >>" + Number.ONE);
		
		Number currentNumber = Number.ONE;
		
		switch(currentNumber) {
		case ONE:
			System.out.println("1이다");
			break;
		case TWO:
			System.out.println("2이다");
			break;
		case THIREE:
			System.out.println("33");
			break;
		case FOUR:
			System.out.println("44이다");
			
		}
		// 서수 출력 (설정된 정수 값 출력)
		System.out.println("<< 서수 출력>>");
		
		for(Number n: Number.values())
			System.out.println(n.ordinal());
		//getter 실행 하여 멤버 변수에 설정된 ㄱ밧 출력
		System.out.println(" 설정 된 멤버 변수 값 .>");
		
		for(Number n: Number.values())
			System.out.println(n.getNum());
	}

}
