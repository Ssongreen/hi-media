import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		//1. 작업 이해
		//2. 순서 
		//3. 코드 작성
		Scanner input = new Scanner(System.in);
		//1. 랜덤 값
		int count = 0;
		int userValue = 0;
		int computer = (int)(Math.random()*10)+1;
		//2. 반복문
		while(true) {
			System.out.println("숫자 입력  : ");
			userValue = input.nextInt();
				if(computer > userValue) 
					System.out.println("컴퓨터 숫자가 크다");
				else if(computer < userValue)
						System.out.println("컴퓨터 숫자가 작다");
				else 
					count++;
				break;
				//횟수 출력
	}
		if(computer==userValue) {
			System.out.println("정답 : " + count + "회 만에 맞췄습니다.");
		}
	}
}