import java.security.Identity;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaceEx03 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		/**
		 *  Function<T,R> : 매개변수 있음(1개, T), 반환값 R
		 *  Function<매개변수 타입, 반환형>  
		 *  R apply(T t)
		 */
		
		//1. 정수 1개를 받아서 문자열 리턴
		//1-1 익명 클래스 anonymous inner class
		Function<Integer, String> anonymous = new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				return "익명 클래스 :: 매개변수 값은" + t + "입니당";
			}
		};
		System.out.println(anonymous.apply(100));
		
		//1-2. 람다 
//		Function<Integer, String> lambda = (Integer t) -> "익명 클래스 :: 매개변수 값은" + t + "입니당";
//		System.out.println(anonymous.apply(100));
		
		// [문제] 문자열 1개를 입력 받은 후 , 문자열 길이를 출력
		Function<String, Integer> lambdai = (t) -> t.length();
		System.out.println(" 문자열 Quiz 문자열 갯수  >> " + lambdai.apply("안녕행~~~") );
	
		System.out.println(" quiz ~~ String class length () " + "안녕" .length());
		
		//2. 정수 1개를 받아서 정수 리턴 ===
		// 문제 정수 1개를 받은 후 제곱한 값을 리턴
		Function<Integer, Integer> power = num -> num * num;
		System.out.println("제곱 >>" + power.apply(5));
		
		Function<Integer, Integer> increment = num -> num + 1;
		System.out.println("증가 >> " + increment.apply(6));
		
		//순차 실행
		System.out.println("><< 5를 1증가 후 제곱 ");
		System.out.println(power.compose(increment).apply(6));
		//역행 
		System.out.println(">< 5를 제곱후 1 더하기");
		System.out.println(power.andThen(increment).apply(6));
		
		System.out.println(Function.identity().apply("즐겁다 ~"));
	}
}
