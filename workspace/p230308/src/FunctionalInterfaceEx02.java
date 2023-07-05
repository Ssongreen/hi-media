import java.util.Arrays;
import java.util.function.Consumer;

public class FunctionalInterfaceEx02 {

	public static void main(String[] args) {

		// consumer : 매개변수 있고<T, 1개> 반환값 없음

		// anonymous class
		Consumer<String> anonymous = new Consumer<String>() {

			@Override
			public void accept(String str) {
				System.out.println(str);
			}
		};

		anonymous.accept("anonymous class have a good one");
		// 람다
		Consumer<String> lambda = (String str) -> System.out.println(str);
		lambda.accept("람다 오늘 즐거운 하루");

		// String.split
		// cf) 문자열.split() : 특정 문자를 기준으로 나누기

		// 공백 기준으로 문자열 나누기
		System.out.println("문자열 나누기 작업 중".split(" "));
		System.out.println("문자열 나누기 작업 중".split(" ")[0]);
		
		// String 1차원 배열 참조변수에 저장
		//1. 공백 기준 : 문자열 모두 나누기
		String[] s = "문자열 나누기 작업 중".split(" ");
		System.out.println(s);
		System.out.println("s >>> " + Arrays.toString(s));
		System.out.println("s[0] >> " + s[0]);

		//2. 공백 기준 : 문자열 2개 나누기
		System.out.println();
		String[] s2 = "문자열 나누기 작업 중".split(" ", 2);
		System.out.println("s2 >>" + Arrays.toString(s2));

		//3. 공백 기준 : 문자열 3개 나누기
		System.out.println();
		String[] s3 = "문자열 나누기 작업 중".split(" ", 3);
		System.out.println("s3 >>" + Arrays.toString(s3));

		//4. 공백 기준 : 문자열 10개로 나누기 - > 최대량 4개로 나눠짐
		System.out.println();
		String[] s4 = "문자열 나누기 작업 중".split(" ", 10);
		System.out.println("s4 >>" + Arrays.toString(s4));
		
		//
		System.out.println();
		String[] s5 = "문자열 나누기 작업 중".split("나누");
		System.out.println("s5 >>" + Arrays.toString(s5));
		//
		System.out.println();
		String[] s6 = "문자열 나누기 작업 중".split("만약");
		System.out.println("s5 >>" + Arrays.toString(s6));
		
		//문제 문자열을 입력 받은 후, 공백 기준 두 번째 문자열 출력
		System.out.println();
		
		// 람다
		Consumer<String> anonymousOne = (str) -> System.out.println(str.split(" ")[1]);
		anonymousOne.accept("오늘도 즐거운 하루"); 
		// 익명 클래스
		Consumer<String> anonymousTwo = new Consumer<String>() {
			@Override
			public void accept(String str) {
				String[] s = str.split(" ");
				System.out.println(s[1]);
			}
		};
		anonymous.accept("오늘도 즐거운 하루");
	}

}
