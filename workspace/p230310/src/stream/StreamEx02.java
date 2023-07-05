package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx02 {

	public static void main(String[] args) {
		// 1. 객체 생성
		List<String> list = Arrays.asList("하늘바람", "별자리", "솔바람", "하늘구름");

		// Stream 객체 생성
		Stream<String> stream = list.stream();

		// forEach문
		stream.forEach(System.out::println);

		// 중간연산 :filter
		// - 조건에 맞는 요소만 정제하여 new 스트림 객체 생성
		// - 매개변수 : predicate -> 매겨변수 1개, 리턴 있음(boolean)

		// 1. stream 객체 생성
		System.out.println("stream 조건에 맞는 값 출력 1");
		Stream<String> streamTwo = list.stream();
		// 2. 중간연산: filter
		Stream<String> result = streamTwo.filter(li -> li.contains("바람"));
		// 3. 최종 연산: forEach
		result.forEach(System.out::println);

		// [stream pipelines] 위 작업을 한 코드 라인으로 변경
		System.out.println();
		System.out.println("stream 조건에 맞는 값 출력 2");
		list.stream()
			.filter(e -> e.contains("바람"))
			.forEach(System.out::println);

		// 문제 문자열에 길이가 4이상이 요소만
		System.out.println();
		System.out.println("stream 조건에 맞는 값 출력 3");
		list.stream()
			.filter(e -> e.length() >= 4)
			.forEach(System.out::println);
	}

}
