package stream;

import java.util.stream.IntStream;

public class StreamEx04 {

	public static void main(String[] args) {
		// 중간 mapTo
		// 형변환 , 타입 변경
		// mapToInt(), mapToLong(),mpaToDouble(),
		// mapToObject()
		System.out.println("[mapTo]형변환");
		double avg = IntStream.range(1, 9999)
							  .peek(System.out::println)
							  .mapToDouble(n -> n)
							  .average()
							  .getAsDouble();

		System.out.println("평균 쓰 >>" + avg);
	}

}
