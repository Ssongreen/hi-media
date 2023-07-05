package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx08 {

	public static void main(String[] args) {

		List<Student> student = Arrays.asList(new Student("홍길동", 29), new Student("박보검", 35), new Student("이미자", 52));

		System.out.println("1. findAny() 무작위중 먼저 하나 ");
		student.stream().findAny().ifPresent(s -> System.out.println(s.getName()));

		System.out.println("2. findFrist() 정렬된 순서중 앞에 하나 ");
		student.stream().findFirst().ifPresent(s -> System.out.println(s.getName()));

		System.out.println("3. 모든 요소 삭제후 findAny() ");
		student.clear();
//		student.stream().findFirst().ifPresent(s -> System.out.println(s.getName()));
//		student.stream().findAny().ifPresent(s -> System.out.println(s.getName()));
		
	}

}
