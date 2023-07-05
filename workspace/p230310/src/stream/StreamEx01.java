/**
 * @Stream
 * Stream 스트림 <><><><><><><><><><><>
 *  스트림 생성
 *  only collection or Array 
 *  
 *  3단계 
 *  (객체)생성 -> 가공(stream 객체만) -> 결과(stream 아닌 것만 return) 
 * 
 * Stream 객체 생성 -> 중간 연산 -> 최종 연산
 * 
 * <특징>
 * - 원본 데이터를 변경하지 않음
 * - 복사본 (일회용)
 * - 내부 반복으로 잡업 처리
 * 
 */

package stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {

		// 방법 1
		// 작업 1차원 배열을 오름차순 정렬 후 출력
		String[] arr = { "하나", "둘", "삼", "넷" };

		// 정렬 : 오름 차순
		Arrays.sort(arr);
		// 출력 : 원본 변경
		for (String a : arr)
			System.out.println(a);

		// 방법 2
		// 1차원 배열 생성
		System.out.println(" ");
		String[] arrTwo = { "하나", "둘", "삼", "넷" };
		// Stream 객체 생성
		Stream<String> stream = Arrays.stream(arrTwo);

		// 정렬 후 출력
		System.out.println("방법 2");
		stream.sorted().forEach(System.out::println);

		// Stream 객체는 1회용
		// 사용한 Stream 객체를 다시 사용 하면 Exception 방생
		// stream has already been operated upon or closed
//		Stream<String> s = stream.sorted();

		// 원본 arrTwo 배열 출력
		System.out.println("배열 arrTwo 출력");
		for (String s : arrTwo)
			System.out.println(s);

		// 새 Stream 객체 생성
		System.out.println(" ");
		stream = Arrays.stream(arrTwo);
		System.out.println("내림 차순");
		stream.sorted()
			  .collect(Collectors.toList())
			  .forEach(System.out::println);

	}

}
