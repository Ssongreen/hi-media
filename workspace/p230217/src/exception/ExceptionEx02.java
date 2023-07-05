package exception;

/**
 * 
 * 예외 처리 1. 직접 try ~ catch 2. 전가 throws
 * 
 */

// 첫번째 방법
public class ExceptionEx02 {

	public static void main(String[] args) {

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}

}
