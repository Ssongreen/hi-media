package generic;


//제네럴 배열 생성은 불가능
class Cool<T>{
	T count;
	
//	T[] array = new T[10];
	public Cool() {}
	
	public Cool(T count) {
		this.count = count;
	}
	
}


public class GenericEx09 {

	public static void main(String[] args) {
		Cool<String> cool = new Cool<String>();
//		Cool<Object> coolTwo = new Cool<String>();
		
		Object obj = new String("안녕"); 	// 다형성
	}

}
