package lambda;

@FunctionalInterface
interface MaxReturn {
	int max(int n1, int n2);

	default void method(int n1, int n2) {
		System.out.printf("매개 변수 값 n1 : %d, n2 : %d\n", n1, n2);
	}

}

public class LambdaQuiz {

	public static void main(String[] args) {
		// 문제 1 익명 클래스 : 참조 변수에 저장
		MaxReturn anonymousOne = new MaxReturn() {
			@Override
			public int max(int n1, int n2) {
				return n1 > n2 ? n1 : n2;
			}
		};
		int one = anonymousOne.max(4, 5);
		System.out.println(one);
		System.out.println("익명 클래스 큰 값 >> " + anonymousOne.max(458, 125));
		// 문제 2 익명 클래스 : 인수 - System.out.println()
		System.out.println(new MaxReturn() {
			//if(n1>n2) max =n1; else max = n2; return max;
			public int max(int n1, int n2) {
				return n1 > n2 ? n1 : n2;  // 삼항연산자로 변경
			}
		}.max(6, 7));

		// 문제 3 문제 1을 람다로 표현
		MaxReturn lambdaOne = (int n1, int n2) -> n1 > n2 ? n1 : n2;
		System.out.println(lambdaOne.max(423643, 347347));
		// 문제 4 문제 2를 람다로 표현
		MaxReturn lambdaThree = (int n1, int n2) -> (n1 > n2 ? n1 : n2);
		lambdaThree.max(6, 7);
	}

}
