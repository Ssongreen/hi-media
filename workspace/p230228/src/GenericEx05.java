// 1. 제네릭 타입은 해당 {}내에서만 유효
// : 제네렉 타입 선언 형태 
// : 1-1 인터페이스 
// : 1-2 클래스
// : 1-3 메서드


// [제네릭 인터페이스] 
interface InterfaceName<T> { }

// [제네릭 클래스]
class ClassName<T> { }

// 2. 제네릭 타입(타입 파라미터)은 두 개 이상 가능
class ClassOne<K, V> { }

//클래스 상속
class ClassSuper{}
class ClassSub extends ClassSuper{}

public class GenericEx05 {
	// 1-3. [제네릭 메서드]
	// super를 사용 되면 타입을 결정 할 때 최상위로 올라가면 object 이기에 <T> 와 같다 <T super ClassSub>
	//<T extends ClassSuper> : 가능
	// <T super ClassSub >	 : 불가능
	public static <T> void show(T t) {
		System.out.println(t);
	}
	
	// 타입 중접 제네릭 타입(타입파라미터)을 타입 제한(한정)
	// extends 와 super
	//<T extends ClassSuper> : 가능
	//<T super ClassSub >	 : 불가능
	//
	public <T extends ClassSuper> void one(T t) {}
//	public <T super ClassSub > void two(T t) {}
	
	//기능 동작 중점 타입보다는 기능 그자체에 초점을 둔 메서드
	// 제네릭 인터페이스 또는 제네릭 클래스를 파라미터로 사용
	// ? : 와일드카드(unbounded wildcard)
	// 타입 중요한 것이 아니라 이미 구현된 클래스에 메서드를 소개암

	public void three(ClassName<?> name) {}
	// 타입 중접 제네릭 타입(타입파라미터)을 타입 제한(한정)
	public void four(ClassName<? extends ClassSuper> name) {
	public void five(ClassName<? super ClassSub> name) {
		name.toString(); 
	}
	
	public <T extends ClassName ?> void six(T t){}
	
	public static void main(String[] args) {
		show(new Integer(5));	// 참조형(reference type)
		show(5);				// 자동형변환 : Wrapper class
		//show(int);	// Error! - 기본형(primitive type)
	}
}


