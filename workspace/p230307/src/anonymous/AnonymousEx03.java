package anonymous;

@FunctionalInterface
interface Box{
	// abstract method
	public void boxing();
}

class Banana{
	public Object buy;
	public Banana() {
		System.out.println(" 바나나는 멸종 위기");
	}
	public void buy(Box box) {
		box.boxing();
	}
}
public class AnonymousEx03 {
	public static void main(String[] args) {
		
		//1. 객체 생성
		Banana banana = new Banana();
		
		//2. 익명 클래스
		banana.buy(new Box() {

			@Override
			public void boxing() {
				System.out.println(" 바나나를 포장합니당");
			}
			
		});
		/// 2번을 람다로 표현
		banana.buy(() -> System.out.println(" 바나나를 포장합니당"));
			
	}
}
