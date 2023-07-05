package book;

import java.util.ArrayList;
import java.util.Scanner;

//배열 대신에 ArrayList에 AnimalInfo를 저장하세용
public class BookManager {
//	private static final int MAX_CNT = 100;
//	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
//	private int index = 0;
	private ArrayList<AnimalInfo> inforStorage = new ArrayList<AnimalInfo>();
			
	public static Scanner input = new Scanner(System.in);

	public void inputData() {
		System.out.println("1. 이름은 ?");
		String name = input.next();

		System.out.println("2. 나이는 ?");
		int age = input.nextInt();

//		inforStorage[index++] = new AnimalInfo(name, age);
		inforStorage.add(new AnimalInfo(name, age));
		System.out.println("데이터 입력 완료\n");
	}

	public void showBook() {

		System.out.println("저장 list ----");
		System.out.println(" ");
		for (AnimalInfo s : inforStorage) {
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