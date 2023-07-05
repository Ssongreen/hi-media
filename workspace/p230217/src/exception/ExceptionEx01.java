package exception;

/**
 * 
 * 예외 처리 1. 직접 try ~ catch 2. 전가 throws
 * 
 */

// 두번 째 방법 전가 
public class ExceptionEx01 {

	public static void main(String[] args) throws InterruptedException, Exception {

		for (int i = 10; i > 0; i--) {
			System.out.println(i);

			Thread.sleep(3000);
		}
	}

}
