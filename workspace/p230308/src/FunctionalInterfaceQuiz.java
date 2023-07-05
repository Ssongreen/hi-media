@FunctionalInterface
interface Box {
	int boxing(int num);

	// 익명 클래스
	// default
	default Box compose(Box before) {
		return new Box() {
			public int boxing(int num) {
				return Box.this.boxing(before.boxing(num));
			}
		};
	}

	// compose 람다 표현
//	default Box composeLamda(Box before) {
//		return (int num) -> boxing(before.boxing(num));
//	}

	// 문제 ==========
	default Box andThen(Box after) {
	        return new Box() {
	        	public int boxing(int num) {
	        		return Box.this.boxing(after.boxing(num));
	        	}
	        	};
	}

	default Box andThenLamda(Box after) {
		return (int num) -> boxing(after.boxing(num));
	}
}
public class FunctionalInterfaceQuiz {
	public static void main(String[] args) {

		Box power = num -> num * num;
		System.out.println("제곱 >>" + power.boxing(6));

		Box increment = num -> num + 1;
		System.out.println("제곱 >>" + increment.boxing(6));

		// 순차적 실행
		System.out.println(" << 1증가후 제곱 값 >> ");
//		System.out.println(power.composeLamda(increment).boxing(6));
		System.out.println(power.compose(increment).boxing(66));

		System.out.println("<< 제곱 후 1 증가");
		System.out.println(power.andThen(increment).boxing(6));
		// 순차적 실행
		System.out.println(" 1증가 후 제곱값");
//		System.out.println());
	}
}
