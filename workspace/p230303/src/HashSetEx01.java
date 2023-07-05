/**
 * HashSet 
 * 요소들의 중복 ㄴㄴㄴ
 * - 요소를 추가하기 전에 이미 존재하는 내부적으로 확인 절차를 한다.
 * 1. 해당 요소에서 hashcode() 메서드를 호출하여, 반환된 해시값으로 검색할 범위 결정
 * 2. 해당 범위 내에서 요소들을 equals() 메서드로 비교
 * 
 * ☆ 즉, hashset 에서 add() 메서드를 사용하여 중복 없이 새 요소를 추가하기 위해서는 
 * 		 hashcode()와 equals() 메서드를 상황에 맞춰 오버라이딩 해야 함
 * */



import java.util.HashSet;
import java.util.Iterator;


public class HashSetEx01 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		// 저장된 요소
		System.out.println("없어용 ?   " + set.isEmpty());

		// 요소 추강
		set.add("하나");
		set.add("둘");
		set.add("삼");
		set.add("하나");

		//
		// 저장된 요소
		System.out.println(" ");
		System.out.println("없어용 ?  " + set.isEmpty());

		// 요소 개수
		System.out.println(" ");
		System.out.println("저장된 요소 개수   " + set.size());

		// 특정 위치에 저장된 요소 출력 : index 사용 앙되용
		System.out.println(" ");
//		System.out.println("인덱스 1에 저장된 요소 >> " + set.get(1));

		// 객체 포함 존재 여부
		System.out.println(" 둘 있져 ? " + set.contains("둘"));
		System.out.println(" 넷 있져 ? " + set.contains("넷"));

		// 저장된 요소 전체 출력
		System.out.println("향상된 for문 ");
		for (String s : set)
			System.out.println(s);

		// toArray 메서드
		System.out.println("<< toArray >>");
		for (Object ob : set.toArray())
			System.out.println(ob);

		System.out.println("<< iterator >>");
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// 요소 추가
		System.out.println("요소 추가 : 일곱 " + set.add("일곱"));
		System.out.println("요소 추가 후 길이 " + set.size());
		System.out.println(" ");

		System.out.println("요소 추가 : 하나 " + set.add("하나"));
		System.out.println("요소 추가 후 길이 " + set.size());

		System.out.println("하나의 hashcode() >> " + "하나".hashCode());
		System.out.println("둘의 hashcode() >> " + "둘".hashCode());
		System.out.println("삼의 hashcode() >> " + "삼".hashCode());
		System.out.println(" ");
		System.out.println("<< 저장된 요소의 해시코드 >>");
		for (String s : set)
			System.out.printf("요소 : %s, 해시코드 : %d\n", s, s.hashCode());
		System.out.println("set의 해시코드 >> " + set.hashCode());
	}

}
