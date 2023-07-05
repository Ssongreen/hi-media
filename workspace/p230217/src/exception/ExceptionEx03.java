package exception;

import java.util.Scanner;

/**
 * 예외 클래스로 상속을 Exception을 해야 된다.
 *	예외 직접 발생 시켜야 한당
 *
 */
class Check extends Exception{
	
	/**
	 * 직렬화 순서대로 차례대로
	 */
	private static final long serialVersionUID = 1L;
	int num;
	public Check(int num) {
		super(" 예외 경보! 음수 값을 입력했어");
		this.num = num;
	}
}

public class ExceptionEx03 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("정수 입력해용");

		int userValue = input.nextInt();
		
		input.close();
		// 예외 발생: throw 때문에 >예외 발생한다 <
		try {
		if(userValue < 0) {
			throw new Check(userValue);
		}
		}catch(Check check) {
//			System.out.println(check);
			System.out.println(check.getMessage());
		}
		
		System.out.println("입력된 값  :" + userValue);

	}
}
