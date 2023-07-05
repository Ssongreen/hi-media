package collection;

import java.util.ArrayList;

class Person {

	private String name;
	private int age;

	public Person() {
	}

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

	public void personInfo() {
		System.out.println(getAge());
		System.out.println(getName());
	}
}

public class ArrayListQuiz {

	public static void main(String[] args) {

		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);
//			Person lee = new Person("이미자", 52);

		// 문제 ArrayList에 hong, park을 저장 (요소 추가) 하시오
		ArrayList<Person> array = new ArrayList<Person>();
		array.add(hong);
		array.add(new Person("홍길동", 48));
		array.add(park);
		array.add(new Person("이미자", 52));
		System.out.println();
		// 전체 출력
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).getAge() + "  " + array.get(i).getName());
			System.out.println(" ");
		}
		for (Person y : array) {
			System.out.println(y.getAge() + y.getName());
			System.out.println("");
		}
		for (Object ob : array.toArray()) {
			System.out.println(((Person) ob).getName());
			System.out.println("  ");
		}
		System.out.println(" 인덱스 1에 저장된 이름");
		System.out.println(array.get(1).getName());
		System.out.println();

		// 저장된 요소 개수
		System.out.println("저장된 요소 개수 >> ");
		System.out.print("요소 추가후 저장된 요소 >> " + array.size());
		System.out.println("");

//			// 35세 박보검 포함
		System.out.println(" 35세 박보검 포함");
		System.out.println(array.contains(park));

		// 52세 이미자 포함 여부
		System.out.println("이미자 찾자");
		System.out.println(array.contains(new Person("이미자", 52)));
		System.out.println(" ");

		// 홍길동 객체가 저장된 인덱스 아는 경우
//			array.get(0).setName("화이팅");
//			for (Person s : array)
//				System.out.println(s.getName());

		// 홍길동 객체로 찾을
//			for(Person o : array) {
//				if(o.equals(hong))
//					o.setName("화이팅");

		// 저장된 이름을 직접 비교
		for (Person p : array) {
//				if(w.getName().equals("홍길동"));
			if ("홍길동".equals(p.getName())) {
				p.setName("화이팅");
				break;
			}
		}
		for (Person p : array) {
			System.out.println(p.getName());
		}
	}
}
