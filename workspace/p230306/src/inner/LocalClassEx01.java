package inner;
/**
 * local inner class 
 * method 내 정의된 클래스
 * 접근 제어자 사용 불가능 - public, private 안됌
 *  메서드 내에서만 사용하기에 접근 제어자 불필요
 */
class OuterFive{
	
	// instance method ==================================================
	public void show( ) {
		int age; // 지역 변수
		
//		InnerFive in;
		
		// method 내 정의된 inner class
		
		class InnerFive{
			//instance field 
			int num;
			
			// static field
			static int age;
			
			//constructor
			public InnerFive() {
				this.num =5;
				System.out.println("InnerFive class 실행자 실행 됨");
			}
			//instance method
			public void showNum() {
				System.out.println("InnerFive class" +num);
			}
		}
		// --------------------------
		
		//method 내 객체 생성
		InnerFive in = new InnerFive();
		in.showNum();
		
	}
	
	//====================================================================
}



public class LocalClassEx01 {

	public static void main(String[] args) {
		
		OuterFive out = new OuterFive();
		out.show();
		
	}

}
