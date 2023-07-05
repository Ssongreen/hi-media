package stream;

import java.time.chrono.MinguoChronology;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx05 {

	public static void main(String[] args) {
		
		//최종 연산 min, maxm average 
		// : 리턴형 optional
		// : 빈 Stream 경우, Optional Empty 리턴
		int min = IntStream.of(1, 2, 4, 6).min().getAsInt();
		System.out.println(" min  " + min);
		
		OptionalInt minOptional = IntStream.of(1, 2, 4, 6).min();
		System.out.println(" minOptional " + minOptional);
		System.out.println("minOptional 의 값  : " + minOptional.getAsInt());
		
		
		OptionalInt max = IntStream.of().max();
		System.out.println("최댓 값 >> :" + max);
		
		OptionalDouble average = IntStream.of().average();
		System.out.println("평균 값 : " + average);
		
		
		//문제 평균값 출력
		IntStream.of(1,3,5,7,9)
				 .average()
				 .ifPresent(System.out::println);
					//.ifPersent(s -> System.out.println(s)); 
		
		//summ count : 빈 Stream일 경우 0 리턴
		int minVaule = IntStream.of().min().orElse(0);
		System.out.println("최솟값" + minVaule);
		
		int sum = IntStream.of().sum();
		System.out.println("sum @@@@ : " + sum);
		
		long count =IntStream.of(1,3,5).count();
		System.out.println("counttt :::::  " + count);
		
		
		
		}

}
