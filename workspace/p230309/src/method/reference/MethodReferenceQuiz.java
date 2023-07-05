package method.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person {
	private String name;
	private int age;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 :" + age;
	}

	public void returnName(Person person) {
		System.out.println(person.getName());
	}
}

public class MethodReferenceQuiz {
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list)
			consumer.accept(t);
	}

	public static void main(String[] args) {

		List<Person> person = new ArrayList<>();
		person.add(new Person("홍길동", 29));
		person.add(new Person("박보검", 35));
		person.add(new Person("이미자", 52));

		System.out.println("향상된 for문");
		for (Person p : person)
			System.out.println(p);

//		 문제1. 정의한 forEach문 사용
		// 문제 1-1 이름과 나이를 출력 : to String()
		// 람다
		System.out.println(" ");
		System.out.println("정의한 forEach문 ");
		System.out.println("1-1. 전체 출력 ");
		System.out.println("lambda forEach");
		forEach(person, (Person p) -> System.out.println(p));
		// 메서드 참조
		System.out.println(" ");
		System.out.println("메서드 참조");
		forEach(person, System.out::println);

		// 문제 1-2 이름만 출력 getName()
		System.out.println(" ");
		System.out.println("1-2. 이름만 ");
		System.out.println("익명 클래스");
		forEach(person, new Consumer<Person>() {
			public void accept(Person p) {
				System.out.println(p.getName());
			};
		});
		// 람다
		System.out.println(" ");
		System.out.println("람당");
		forEach(person, (Person p) -> System.out.println(p.getName()));
		// 메서드 참조 안되서 메서드 returnName 만들어야 해용
		System.out.println(" ");
		System.out.println("reference");
		forEach(person, new Person()::returnName);
		
		System.out.println("");
		System.out.println("람다 이름만");
		forEach(person, p -> p.returnName(p));
		
		System.out.println("");
		System.out.println("익명 클래스 이름만");
		forEach(person, new Consumer<Person>() {
			public void accept(Person p) {
				p.returnName(p);
			}
		});

		// 문제 2 ArrayList의 forEach문 사용
		// 문제 2-1 이름과 나이를 출력 toString()
		System.out.println(" ");
		System.out.println("ArrayList의 foreach문 ");
		System.out.println("2-1. 전체 출력 ");
		System.out.println("lambda forEach");
		// 람다
		person.forEach(p -> System.out.println(p));
		
		//메서드 참조
		System.out.println(" ");
		System.out.println("Arrays method reference");
		person.forEach(System.out::println);
		
		//문제 2-2 이름만 출력 : getName()
		//람다
		System.out.println(" ");
		System.out.println("이름만");
		person.forEach(p -> System.out.println(p.getName()));
		// 메서드 참조는 메서드 정의후 사용 가능해용
		System.out.println(" ");
		System.out.println("메서드 참조에 메서드 생성후에");
		person.forEach(new Person()::returnName);
	}
}
