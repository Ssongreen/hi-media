package book;

import java.util.Scanner;
//배열 대신에 ArrayList에 AnimalInfo를 저장하세용
public class BookManager {
	private static final int MAX_CNT = 100;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;
	public static Scanner input = new Scanner(System.in);

	public void inputData() {
		System.out.println("1. 이름은 ?");
		String name = input.next();

		System.out.println("2. 나이는 ?");
		int age = input.nextInt();

		infoStorage[index++] = new AnimalInfo(name, age);
		System.out.println("데이터 입력 완료\n");
	}
	public void showBook() {

		for (AnimalInfo s : infoStorage) {
			if (s == null) {
				break;
		//null를 해주는 클래스를 생성 가능
			}
			System.out.println("저장 list ----");
			s.showAnimalInfo();
	
		}
		input.close();
	}
}

//		// for(데이터타입 변수명 : 배열명)
//	    for(int number : intArray) {
//		  // 배열의 길이만큼 number를 반복하기 때문에 배열의 모든 요소가 출력된다.
//		  System.out.println(number);
//		for(int i=0; i<index; i++)
//			infoStorage[i].showAnimalInfo();