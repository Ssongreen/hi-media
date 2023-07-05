package anonymous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class AnonymousQuiz {
	public static void main(String[] args) {

		HashSet<Person> hashSet = new HashSet<Person>();
		hashSet.add(new Person("홍방장", 29));
		hashSet.add(new Person("박보검", 35));
		hashSet.add(new Person("이미자", 55));

		// 출력: 저장된 순서
		Iterator<Person> iter = hashSet.iterator();

		while (iter.hasNext())
			iter.next().showInfo();

		// 문제 이름 기준 오름차순 정렬
		// 1-1 Comparator 인터페이스 구현 : 익명 클래스 (anonymous inner class)
		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName()); // 오름차순
			}
		};
		// 문제 1-1 람다식으로
		Comparator<Person> comparatorOne = (Person p1, Person p2) -> p1.getName().compareTo(p2.getName());
		// 오름차순

		// 1-2 ArrayList 형변환
		ArrayList<Person> li = new ArrayList<Person>(hashSet);

		// 1-3 오름차순 정렬
//		li.sort(comparator);
		li.sort(comparatorOne);
		// 1-4 출력
		System.out.println("오름 차순 정렬 후 ");
		for (Person p : hashSet)
			p.showInfo();
	}
}
