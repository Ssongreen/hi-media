package stream;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx03 {

	public static void main(String[] args) {

		//list 객체 생성
		List<String> list = Arrays.asList("하늘 바람","별 자리","솔 바람","하늘 구름");
		
		//중간 filter
		//stream에서 조건에 맞는 요소만 정제하여 새 Stream 생성
		//Predicate : 매개 변수 1개, 리턴 있음(리턴형 boolean)
		
		System.out.println("\n[filter] 바람이 포함된 요소만 추출");
		list.stream()
			.filter(s -> s.contains("바람"))
			.forEach(System.out::println);
		
		//[중간] map
		// Stream 요소들을 변환하여 새 Stream 생성
		// 저장된 값을 특정한 형태로 변환하는데 사용 ex) 소문자 - > 대문자
		// Function 매개변수 2개, 리턴 있음
		System.out.println("\n[map] 공백 제거스");
		
		list.stream()
			.map(s -> s.replace(" ", ""))
			.forEach(System.out::println);
	
		//[중간] sorted 1) 오름 차순
		System.out.println("\n[sorted] 오름차순 정렬");
		// 1. 생성 		: Stream 객체 생성
		// 2. 중간 연산 : sorted() 	- 정렬
		// 3. 최종 연산 : forEach() - 출력
		list.stream()
			.sorted()
			.forEach(System.out::println); 
		
		//[중간] sorted 2) 내림 차순
		System.out.println("\n[sorted] 내림차순 정렬");
		list.stream()
//			.sorted(Collections.reverseOrder())
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
		
		//[중간] peek 
		// stream 요소에 영향을 주지 않고 특정 작업 수행 연산과 다른 개별적인 check
		// Consumer : 매개변수 1, 리턴 없어용
		System.out.println("\n [peek]  연산 중간에 출력쓰");
//		int sum = IntStream.of(1,3,5,7,9)
//				 .peek(System.out::println)
//				 .sum();
//		System.out.println(sum);
		
		//문제 짝수를 추출후에 출력
		int sum = IntStream.of(10,15,20,25,30)
							.filter(i -> i%2 ==0)
							.peek(System.out::println) // 리턴이 없는 System.out
							.sum();
		System.out.println("짝수 요소의 합" +sum);
		
		//[중간] distinct
		// 중복 stream 요소 제거
		// Consumer 매개 변수 1개, 리턴 없음
		System.out.println("\n distinct 중복된 요소 제거");
		IntStream.of(1,3,5,3,5,7,9)
				 .distinct()
				 .forEach(System.out::println);
		
		
		
	}
	
}
