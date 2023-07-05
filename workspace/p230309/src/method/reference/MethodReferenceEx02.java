package method.reference;

import java.util.function.Consumer;

public class MethodReferenceEx02 {

	public static void main(String[] args) {

		
		// 출력 메서드 : System.out.println() #################
		// : 매개변수 1개 리턴 없음
		// : Consumer에 참조 가능
	
		
		//익명 클래스
		Consumer<String> anonymous = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		anonymous.accept("[익명 클래스] 오늘도 즐거운 하루 ");
		
		
		//람다
		System.out.println();
		Consumer<String> lambda = (String t)-> System.out.println(t);
		lambda.accept("[람다 클래스] 오늘도 즐거운 하룽");
		///메서드 참조
		System.out.println();
		Consumer<String> reference = System.out::println;
		reference.accept("[메서드 참조] 오늘도 즐거운 하룽");
	}
}

