package generic;

class Thing {
	String id;
	String name;

	public Thing() {
	}

	public Thing(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Tv extends Thing {
	@Override
	public String toString() {
		return "나는 새로운 TV이당";
	}
}

class Pen extends Thing {
	@Override
	public String toString() {
		return "나는 평생 사용하는 PENSER 이다";
	}
}

// generic class
// 문법 class 클래스명<타입파라미터"타입매개변수">{}
class Box<T> {
	T item;

	public void store(T item) {
		this.item = item;
	}

	public T out() {
		return this.item;
	}

}

//문제
class Wrap<T> {
	T item;

	public void wrap(T item) {
		this.item = item;
	}

	public T unwrap() {
		return this.item;
	}

//	public T out() {
//		return this.item;
//	}
}

public class GenericEx06 {

	// generic method
	// 문법 접근제한자 <타입파라미터> 반환형 메서드명(파라미터) {}
	
	
	// 가져다 사용할때 타입이 결정이 된다.
	// 제네릭 타입을 메소드의 파라미터로 사용
	// 상속 관계로 인식하지 못한다.
	// 타입파라미터가 같은 타입이 되어야 한다.
	// ? : wild card 상속, 모든 타입을 사용한다. object만 인식해용

	public static void openBox(Box<? extends Thing> box) {
		Thing thing = box.out();
		System.out.println(thing.toString());
	}

	// 문제 매개변수 : Pen을 포함한 부모의 타입으로 한정 (제한)
	public static void unwrapGift(Wrap<? super Pen> wrap) {
		Object object = wrap.unwrap();
		Thing thin = (Thing) wrap.unwrap();
		Pen pen = (Pen) wrap.unwrap();
	}

	public static void main(String[] args) {
		Box<Tv> one = new Box<Tv>();
		one.store(new Tv());
		openBox(one);

		// Pen : Box에 펜을 담은 후 Box 개봉
		Box<Pen> two = new Box<Pen>();
		two.store(new Pen());
		openBox(two);

//		Box<Animal> three = new Box<Animal>();
//		three.store(new Animal());
//		openBox(three);

		// 문제
		Wrap<Pen> four = new Wrap<Pen>();
		four.wrap(new Pen());
		unwrapGift(four);
		
		//change
//		Wrap<Tv> four = new Wrap<Tv>();
//		four.wrap(new Pen());
//		unwrapGift(four);
	}
}
