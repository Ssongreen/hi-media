/**
 *  람다 표현식 ::::: 람다식, 람다,lambda expression
 *  : java 8q부터 함수형 프로그래밍 지원을 위해 Lambda, Stream 도입
 *  : 메서드를 하나의 식으로 표현
 *  : lambda 익명 함수 (anonymous function)
 *  :사실상 객체로 관리
 *  
 *  <특징> 
 *  메서드명 과 반환형 생략, return 키워드 대신 식(expression) 사용
 *  라담식 내 지역변수 final
 *  
 *  <장점>
 *  코드 간결
 *  가독성이 높다
 *  메서드 정의 없이 한번에 처리 가능하므로 생산성이 높음
 *  
 *  단점
 *  익명 함수이므로 재사용 불가
 *  디버깅 어려움
 *  재귀로 부적합
 *  
 *  syntax :::::
 *  [형태 1]
 *  반환형 메서드 생략
 *  가로 안에 매개변수()
 *  바디도 없고 return 도 없음
 *  () -> expression
 *  
 *  [형태 2]
 *  (parameter"매개변수 여러개 가능") -> expression 
 *  
 *  [형태 3]
 *  반환형 메서드명(매개변수, 매개변수){
 *  code;
 *  code;
 *  return 값;
 *  
 *  (parameter1, parameter2) ->{
 *  code;
 *  code;
 *  return 값;
 *  }
 *  
 *  () : parameter = 메서드의 매개면수
 *  -> : arrow 		= 실행
 *  {} : body 		= 메서드의 바디 , 생략가능
 *  <활용>
 *  1. 람다식을 가리키는 참조변수 반화
 *  2. return
 *  3. 인수
 */

package lambda;

/**
 * 함수형 인터페이스 
 * : 추상 메서드가 1개 정의되어 있고, 람다식을 다루기 위한 인터페이스
 * : 추상 메서드는 반드시 1개만 정의 -> 람다식과 인터페이스가 1:1 대응 (연결) 
 */

@FunctionalInterface //함수형 인터페이스
interface Mood {
	String howAreYou(String feel);
//	int star(int num);
}

class Person implements Mood {
	@Override
	public String howAreYou(String feel) {
		return "slay? == > " + feel;
	}
}

public class LambadEx01 {

	public static void main(String[] args) {
		Mood instance = new Person();
		String s = instance.howAreYou("똑같아");
		System.out.println(s);

		// 익명 클래스
		// [형태 1 ] 참조 변수 저장
		Mood moodOne = new Mood() {
			@Override
			public String howAreYou(String feel) {
				return "익명 클래스 I am " + feel;

			}
		};
		String one = moodOne.howAreYou("doing well");
		System.out.println(one);

		// [형태 2] 위 코드를 더 간결하게
		// 객체 생성 후, 메서드 호출
		System.out.println(new Mood() {
			@Override
			public String howAreYou(String feel) {
				return "익명 클래스 더 간결행 기분은 ? " + feel;
			}
		}.howAreYou("신기행"));
		// 람다식
		// [형태 1-1] 
		// 생략 : method 명 , 반환형 생략
		// 명시 : 매개변수 타입, 매개변수명
		Mood moodTwo = (String feel) -> "[lambda1] 기분은? " + feel;
		String two = moodTwo.howAreYou("not bed ");
		System.out.println(two);
		
		//[형태 1-2]
		//생략 : method명, 반환형, 매개변수, 타입
		//명시 : 매개변수명
		Mood moodThree = (feel) -> "[lambda2] 기분은? " + feel;
		String three = moodThree.howAreYou("good");
		System.out.println(three);
		
		//문제
//	System.out.println((feel) -> "익명 클래스 더 간결행 기분은 ? " + feel);
		
	}

}
