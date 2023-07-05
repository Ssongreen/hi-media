package exception;

import java.util.Scanner;

/*
 * 예외 처리
 * 
 * -try ~ catch ~ finally : 직접 처리
 * 
 * - throws : 예외 전가
 * 
 * try {
			// 예외 발생 가능한 코드
		} catch{(예외클래스명 참조변수)
			//예외 발생시 처리할 코드
		}finally{
			//예외 발생 여부와 상관ㅇ벗이 
			//try 구문 마지막에 무조건 실행 되는 영역
 */

public class Ex01 {

	public static void inputData() {
		System.out.println("inputData method ===== 시작");
		Scanner input = new Scanner(System.in);

		System.out.println("정수 2개 입력 : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		int result1 = 0;
		int result2 = 0;

		try {
			result1 = n1 / n2;
			result2 = n1 % n2;
			System.out.println("몫 :" + result1);
			System.out.println("나머지 :" + result2);
		} catch (ArithmeticException e) {
			System.out.println("분모가 0으로 계산 불능입니당");
		}finally{
			System.out.println("예외 처리 구문 실행 종료");
		}

		System.out.println("inputData method ===== 종료");
	}

	public static void main(String[] args) {
		System.out.println("main method >>>>> start");
		inputData();
		System.out.println("main method >>>>> end");
	}

}
