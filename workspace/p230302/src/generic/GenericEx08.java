package generic;

//제네릭 interface 의 상속 
interface Space<T> {
	void youKnow(T item);
}

//제네릭 클래스
class Star<T> implements Space<T> {

	@Override
	public void youKnow(T item) {
		System.out.println(item + " 은(는) 항성");
	} 
	
}

class Sun{
	@Override
	public String toString() {
		return "나는 태양";
	}
}
public class GenericEx08 {
	public static void main(String[] args) {

		
		Star<Sun> star = new Star<Sun>();
		star.youKnow(new Sun());
	}

}
