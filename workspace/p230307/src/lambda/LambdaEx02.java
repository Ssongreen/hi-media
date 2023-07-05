package lambda;

@FunctionalInterface
interface Box {
	public String boxing();

}

class Banana {
	public Banana() {
		System.out.println("Banana constructor 나는 바나나");
	}

	public void buy(Box box) {
		System.out.println(box.boxing());
	}
	
//	// 익명 클래스
//		public Box change() {
//			return new Box() {
//		@Override
//				public String boxing() {
//					return "새 바나나 박스로 교환 해용";
//				}		
//			};
	public Box change() {
			return ()->  " 람당 새 바나나 박스 교환해용";
		}
	
}

public class LambdaEx02 {

	public static void main(String[] args) {

		// 익명 클래스 =======================================
		// 객체 생성
		Banana bananaOne = new Banana();
		
		// 2-1. 익명 클래스를 참조변수에 저장
		Box box = new Box() {
			@Override
			public String boxing() {
				return "익명 클래스 바나나를 박스에 담아요.";
			}
		};
		
		bananaOne.buy(box);
		System.out.println(bananaOne.change().boxing());
		// 2-2. 익명 클래스를 인수에 사용
		bananaOne.buy(new Box(){
			public String boxing() {
				return "[익명 클래스] 바나나를 포장해용.";
			}
		});
		
		//lambda 람다 =========================================
		//1. 객체 생성
		Banana lambda = new Banana();
		
		//2-1 람다식을 참조 변수로 저장
		Box lambdaBox  = () -> "람다 클래스 바나나를 람다 박스에 담아요.";
		
		
		bananaOne.buy(lambdaBox);
		
		//2-2 람다식을 인수에 사용
		lambda.buy(() -> "람다 클래스 바나나를 포장해용.");
		
		lambda.buy(box);
		
		
	}

}
