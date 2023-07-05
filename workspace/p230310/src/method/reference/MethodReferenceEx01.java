package method.reference;

import java.util.function.Function;

@FunctionalInterface
interface Greeting {
	int say(String str);
}

public class MethodReferenceEx01 {
	public static void main(String[] args) {
		// 1. 익명 클래스
		Greeting anonymous = new Greeting() {

			@Override
			public int say(String str) {
				return str.length();

			}
		};

		System.out.println("[익명 클래스] 문자열 길잉 ><><><><>< " + anonymous.say("Have a good one"));

		// 2. 람다
		Greeting lambda = (String str) -> str.length();

		System.out.println("[익명 클래스] 문자열 길잉 ><><>< " + lambda.say("Donig a good one"));

		// 3. 메서드
		Greeting reference = String::length;
		System.out.println("reference leghth ><><><><" + reference.say("enjoy Java"));

		// 문제 generic functional interface 사용

		// 1. 익명
		Function<String, Integer> quizAnonymous = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		System.out.println("문제 익명 클래스 " + quizAnonymous.apply("enjoy afternoon"));
		// 2. 람다
		Function<String, Integer> quizLambda = (String s) -> s.length();
		System.out.println("문제 람다 클래스 " + quizLambda.apply("happy days"));
		// 3. 메서드 참조
		Function<String, Integer> quizReference = String::length;
		System.out.println("문제 메서드 참조" + quizReference.apply("happy the Java") );
	}

}
