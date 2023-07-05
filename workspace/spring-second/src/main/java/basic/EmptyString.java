package basic;

public class EmptyString {

	public static void main(String[] args) {
		String one = "";     //빈문자열
		String two = null;   //ASCIK code 값이 있는 null 쓰지 못한 메모리 주소
		String three = "안녕";
		String whiteSpace =" "; //공백 쓰
		
		/**
		 * null 은 아무 객체도 가르키지 않는다. 저장이 없는 상태지만 만들어진 빈값
		 */
		
		System.out.println("one >> " + one);
		System.out.println("two >> " + two);
		
		//빈 문자열 확인 1 equals() method===
		System.out.println("one.equals() : " + one.equals(""));
		//Excaption : NullPointerException
//		System.out.println("one.equals() : " + two.equals(""));
		
		//빈 문자열 확인 2 length() method 문자열 길이
		System.out.println("one : 빈 문자열 길이 >>" + one.length());
		//Excaption : NullPointerException
//		System.out.println("two : 빈 문자열 길이 >>" + two.length());
		
		
		// 빈 문자열 확인 3 isEmpty() method 
		// java 6 이후 - 문자열의 길이가 0인 경우 ture 리턴
		System.out.println("one.isEmpty >>> " + one.isEmpty());
		System.out.println("three.isEmpty >>> " + three.isEmpty());
		System.out.println("whiteSpace.isEmpty >>> " + whiteSpace.isEmpty());
		
		//cf)  isBlank() method 
		// java 11 이후 - 빈 문자열이거나 빈 공백만으로 이뤄진 경우 true 리턴
		// white space를 어떻게 처리할까? 에서 시작
		System.out.println("one.isBlank >>>" + one.isBlank());
		System.out.println("three.isBlank >>>" + three.isBlank());
		System.out.println("whiteSpace.isBlank >>>" + whiteSpace.isBlank());
	}

}
