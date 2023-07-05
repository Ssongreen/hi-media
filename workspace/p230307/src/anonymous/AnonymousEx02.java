package anonymous;

@FunctionalInterface
interface Space {
	void youKnow();
}

class SubSpace implements Space {
	@Override
	public void youKnow() {
		System.out.println("우주 대해 아는 것은 ?");
	}

}

public class AnonymousEx02 {

	public static void main(String[] args) {

		// .1 다형성
		Space spaceOne = new SubSpace();
		spaceOne.youKnow();

		// 2. Anonymous inner class 인터페이스 구현
		Space spaceTwo = new Space() {
			@Override
			public void youKnow() {
				System.out.println("우리가 있는 태양계는 우리 은하");
			}
		};
		spaceTwo.youKnow();

		// 3. 2번을 람다로 표현
		Space lambdaOne = () -> System.out.println("우리가 있는 태양계는 우리 은하.");
		lambdaOne.youKnow();
	}

}
