import java.util.function.Predicate;

public class FunctionalInterfaceEx04 {

	public static void main(String[] args) {
		
		/**
		 * Predicate<t> : 매개변수 있음(1개, T), 반환값 있음(Boolean)
		 * 
		 * Boolean test(T t)
		 */
		
		
		
		
		// 0 이상 : 양수 true 
		// 0 미만 : 음수  false
		Predicate<Integer> positive = s -> s>= 0;
		System.out.println("1 ?? 뭐징  : " + positive.test(1));
		System.out.println("1 ?? 뭐징  : " + positive.test(-1));
		
		//문제 
		
	}

}
