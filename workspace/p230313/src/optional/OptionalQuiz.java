package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
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

public class OptionalQuiz {

	public static Optional<Person> findByName(String name) {
		List<Person> result = Arrays.asList(new Person ("홍길동", 29)
				,new Person("박보검",35)
				,new Person("이미자",52));
		
	    return result.stream()
	            .filter(person -> person.getName().equals(name))
	            .findFirst();
	}
//		for(Person s : result) {
		
//			if (s.getName().equals(name))
//				return Optional.of(s);
//				return Optional.ofNullable(s);
//				
//		}
//		
//		return Optional.empty();
//		
//	}
	//Optional class 사용
	//매개변수 name result에 저장 되어 있으면, 객체의 주소를 리턴 해주세용
	//result에 저장되어 있지 않으면, null이 리턴 되도록
	
	
	public static void main(String[] args) {
		System.out.println("박보검 찾앙  :" + findByName("박보검"));
		System.out.println();
		System.out.println("하늘 찾앙 :" + findByName("하늘"));
		System.out.println();
		
		
		Optional<Person> prak = findByName("박보검");
		if(prak.isPresent())
		System.out.println("박보검을 찾아랑 >> " + prak.get().getName());
		
		Optional<Person> sky = findByName("하늘");
		if(sky.isPresent())
		System.out.println("하늘을 찾아랑 >> " +sky.toString());
		
	}

}
