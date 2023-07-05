class Super{
	//field : 멤버 변수 - instance field, class(static) field
	private int numOne;
		int numTwo;
	//method : 멤버 메서드 instance method, class(static) method
		void showOne() { //선언부
		System.out.println("showOne");
	}
	public void showTwo() {
		System.out.println("showTwo");
	}
}
class Sub extends Super{
		// method overriding
	void showOne() { 
		System.out.println("overriding showOne");
	}
	/**
	 * overriding된 메서드의 접근 권한
	 * 
	 * 상속 관계에서 overriding 된 
	 * 메서드의 접근 권한은 
	 * 부모의 접근 권한 보다 크거나 같아야 함
	 */
	  public void showTwo() {
		  System.out.println("overriding showTwo");
	}
	  //부모의 멤버변수 접근
	  public void setNumOne() {
//		  super.numOne = 1;
	  }
	 public void setNumTwo() {
		  super.numTwo = 2;
	  }
}
public class AccessEx02 {
	
	public static void main(String[] args) {
		
		Sub s = new Sub();
		s.showOne();
		
	}

}
