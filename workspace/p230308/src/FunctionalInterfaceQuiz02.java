import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Predicate<T> {
	boolean test(T t);
}

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

	public int getAge() {
		return age;
	}

}

public class FunctionalInterfaceQuiz02 {

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			if (predicate.test(t))
				result.add(t);
		}
		return result;
	}

	public static void main(String[] args) {

		List<Person> person = new ArrayList<Person>();

		person.add(new Person("홍길동", 29));
		person.add(new Person("박보검", 35));
		person.add(new Person("이미자", 52));

		for (Person p : person)
			System.out.println(p.getName());

		// 나이가 30세 이상인 데이터 만 추출
		// 람다
//		List<Person> adult = filter(person, (Person p) -> p.getAge() >= 30);

		// 익명 클래스
		List<Person> adult = filter(person, new Predicate<Person>() {

			@Override
			public boolean test(Person p) {
				return p.getAge() >= 30;
			}
		});

		System.out.println();
		for (Person p : adult)
			System.out.println(p.getName());

	}

}
