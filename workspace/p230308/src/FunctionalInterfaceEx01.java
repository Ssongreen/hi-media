import java.util.function.Supplier;

/**
 * Supplier : 매개 변수 없음, 반환값 있음
 */

public class FunctionalInterfaceEx01 {
	public static void main(String[] args) {

		// Supplier : 매개 변수 없음, 반환값 있음

		// 익명 클래스 Anonymous inner class
		Supplier<String> anonymous = new Supplier<String>() {

			@Override
			public String get() {
				return "[익명 클래스] 신기한 제네릭 함수형 인터 페이스";
			}
		};
		System.out.println(anonymous.get());

		// 람다 ================
		Supplier<String> lambdaOne = () -> "[람다] 신기한 제네릭 함수형 인터 페이스";
		System.out.println(lambdaOne.get());
	}
}
