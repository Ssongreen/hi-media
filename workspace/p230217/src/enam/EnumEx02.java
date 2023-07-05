package enam;

import java.util.Scanner;

interface Week{
	//field : public static final
	int Mon = 1, Tue = 2, Wed = 3, Thu = 4, Fri = 5, Sat = 6, Sun =7; 
}


public class EnumEx02 {

	public static void main(String[] args) {

		System.out.println("오늘의 요일을 선택!");
		System.out.println(1월, 2화, 3수, 4목, 5금, 6토, 7일);
		Scanner input = new Scanner(System.in);
		int week = input.nextInt();
		
		switch(week) {
		case 1:
			System.out.println("주간회의");
			break;
		case 2:
			System.out.println("made project ");
			break;
		case 3:
			System.out.println("the project  보고");
			break;
		case 4:
			System.out.println("play 축구");
			break;
		case 5:
			System.out.println("프로젝트 마감");
			break;
		case 6:
			System.out.println("가족과 만남");
			break;
		case 7:
			System.out.println("휴일");
			break;
			
			
		}
		
	}

}
