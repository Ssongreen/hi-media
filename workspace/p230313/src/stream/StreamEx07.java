package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	private String name;
	private int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class StreamEx07 {

	public static void main(String[] args) {

		/**
		 *  최종 연산 collect
		 *  
		 *  Stream 요소들을 List, Set, Map 등의 type으로 수집
		 */
		List<Student> student =Arrays.asList(new Student("홍길동", 29)
					,new Student("박보검", 35)
					,new Student("이미자", 52));
		List<String> nameList= student.stream()
			.map(s -> s.getName())
			.collect(Collectors.toList());
	
		System.out.println("LIST type 이름 출력 ");
		nameList.forEach(System.out::println);
		
		//2.joining() 작업결과를 문자열로 이어줌 
		// Collectors.joining(구분자, 결과 맨 앞에 분는 문자)
		String strOne = student.stream()
						.map(s -> s.getName())
						.collect(Collectors.joining());
		System.out.println("문자열 이어줌 1 ><><>< 이름 사이에 공백 없이 출력");
		System.out.println(strOne);
		
		
		String strTwo = student.stream()
						.map(Student::getName)
						.collect(Collectors.joining("_"));
		System.out.println(" 문자열 이어줌 2 이름 사이에 _ 추가");
		System.out.println(strTwo);
		
		String strThree = student.stream()
				.map(Student::getName)
				.collect(Collectors.joining("@","<",">"));
		System.out.println(" 문자열 이어줌 3 이름 사이에 _ 추가");
		System.out.println(strThree);
		
		
	}

}
