package exception;

public class Ex03 {

	public static void main(String[] args) {

		// 배열 생성과 동시에 초기황
		
		int[] arr = {2, 4 , 6};
		
		// 요소값 변경
		try {
			arr[3] = 10;
		}catch (ArrayStoreException e) {
			System.out.println("분모가 0으로 계산 불능");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 범위가 벗어났져");
////			e.printStackTrace();
//			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("Exceptio class가 처리행");
		}
		
		System.out.println("main method 종룡!!");
		}

}
