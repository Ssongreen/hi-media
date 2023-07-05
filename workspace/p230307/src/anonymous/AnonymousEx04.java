package anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnonymousEx04 {

	public static void main(String[] args) {

		ArrayList<String> hangul = new ArrayList<String>();
		hangul.add("wind");
		hangul.add("sky");
		hangul.add("butterfly");
		hangul.add("rock");
		System.out.println("정렬 전 : " + hangul);

		// =======================================================
		// 오름 차순 정렬 collections.sort()
		Collections.sort(hangul);
		System.out.println("정렬 후 : " + hangul);
		// 내림차순 정렬
		Collections.sort(hangul, Collections.reverseOrder());
		System.out.println("내림 차순 정렬 후 : " + hangul);
		// ======================================================

		// ====================================================
		// 오름차순 2 List.sort() : Java 8 이후

		hangul.sort(Comparator.naturalOrder());
		System.out.println("정렬 후에 >>> " + hangul);

		// 내림차순 정렬 2
		hangul.sort(Comparator.reverseOrder());
		System.out.println("내림차순 정렬 : " + hangul);
		// ========================================================

		// ========================================================
		// 오름 차순 3 Comparator 인터페이스 구현
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);	//오름차순
//				return s2.compareTo(s1);	//내림차순
				
			}
		};
		//오름 차순 정렬
		hangul.sort(comparator);
		System.out.println("정렬 후에 >>> : " + hangul);
		

		//String class : compareTo() method >> ========================
		// 문법 : 첫번재 인수 . compareTo (두번째 인수)
		/**
		 *  양수 :  순서 교체 == > 첫번째  인수 큼
		 *  음수 :  순서 유지 == > 첫번째  인수 작다
		 *  0	 : 	순서 유지 == > 서로 같다
		 */
			//compareTo 에 대입 되어 정렬이 되는 과정
			//1 오름차순 : return s1.compareTo(s2);
			//1.1  데이터 순서 CAB 
			System.out.println("c와 a 비교 >>> " + "c ".compareTo("a"));
			//1-2. 데이터 순서 ACB
			System.out.println("c와 b 비교 >>" + "c".compareTo("b"));
			//1-3 데이터 순서 ABC 
			
			//2. 내림 차순 : return s2.compareTo(s1)
			//2-1 데이터 CAB
			System.out.println("c 와 a 비교 >> " + "a".compareTo("c"));
			//2-2 데이터 CAB
			System.out.println("A 와 B 비교 >> " +"B".compareTo("A"));
			
			
			
			
			
			
	}	

}
