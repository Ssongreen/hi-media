package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 컬렉션 collection :data (field) + 알고리즘 (method) : 데이터를 묶어서 관리 및 사용을 쉽게하기 위한 구조 :
 * 사용하는 목적 배열과 같지만, 제공하는 기능(메서드) 배열보다 다양
 *
 * 컬렉션 프레임워크 collection framework :컬렉션 클래스와 인터페이스의 집합 :프로그래밍이 편리성, 통합된 API 구조로
 * 인한 효율성 증대
 *
 *
 * 									순서 | 중복 허용  | 구현 클래스
 * ---------------------------------------------------------------------------------------------
 *  collection<E>  <----list<E>        o |	 		o | Arraylist, linkedList, stack, Queue
 *                 <---set  <E> 	   x |		    x | hashSet, treeSet 
 *                 
 * 	map<K,V> 						   x |   key: x	  | HashMap, treeMap 
 * 										 |	value O	  |
 * ------------------------------------------------------------------------------------------------
 * 
 * ArrayList 자료 구조 특징(아래차 정렬)
 * 장점 : 공간 낭비가 없어용
 * 단점 : 데이터 추가 삭제시 데이터 이동 시간이 걸린다. 
 */

public class collectionFrameworkEx01 {

	public static void main(String[] args) {

		// ArrayList 객체 생성 : list 생성
		ArrayList<String> arraylist = new ArrayList<String>();

		// 저장된 요소 존재 여부
		System.out.println("비어있어 ?" + arraylist.isEmpty());

		// 요소 개수;
		System.out.println(" 저장된 요소 개수 " + arraylist.size());

		// 요소 추가
		arraylist.add("하나");
		arraylist.add("둘");
		arraylist.add("삼");
		arraylist.add("넷");

		// 요소 개수
		System.out.println("요소 추가후 저장된 요소 개수  " + arraylist.size());

		// 특정 위치에 저장된 요소 접근
		System.out.println("인덱스 0 은 누구지이  >> " + arraylist.get(0));
		System.out.println("인덱스 0 은 누구지이  >> " + arraylist.get(2));

		// 객체 포함 여부 확인
		System.out.println("둘 있나요?? " + arraylist.contains("둘"));
		System.out.println("여섯 있나요?? " + arraylist.contains("여섯"));

		// 저장된 요소 전체 출력 1번 일반 for
		System.out.println(" 요소 전부 출력 1");
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}

		// 저장된 요소 전체 출력 2번 향상된 for
		System.out.println(" 요소 전부 출력 2");
		for (String y : arraylist) {
			System.out.println(y);
		}

		// 저장된 요소 전체 출력 3번 toArray
		System.out.println(" 요소 전부 출력 3");
		for (Object ob : arraylist.toArray()) {
			System.out.println(ob);
		}

		// 저장된 요소 전체 출력 4번 iterator 일회용이다 다시 사용하려면 객체를 다시 만들어야됌
		System.out.println(" 요소 전부 출력 3");
		Iterator<String> iter = arraylist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("두번 반복");
		iter = arraylist.iterator();
		
		//hasNext 와 next는 같이 해야되용
		while (iter.hasNext()) {
			System.out.println("두번째 >> " + iter.next());
		}
		// 특정 객체가 요소와 같은지 비교 equals를 사용하여 true / false을 나눌 수 있다.
		for (int index = 0; index < arraylist.size(); index++) {
			System.out.println("삼과 같아요 ? >>>  " + arraylist.get(index).equals("삼"));

			// 특정 요소 변경
			System.out.println("삼 - > 여섯 변경 ");
			arraylist.set(2, "여섯");
			for (String str : arraylist)
				System.out.println(str);
		}
		// 특정 요소 삭제
		System.out.println("삭제 할끄야");
		Boolean result = arraylist.remove("둘");
		System.out.println("요소 둘 삭제 결과 " + result);

		// 반복문
//		for (String x : arraylist) {
//			System.out.println(x);
		for (int ix = 0; ix < arraylist.size(); ix++) {
			System.out.println(arraylist.get(ix));
		}
		// 요소 개수
		System.out.println(" 저장된 요소 개수 " + arraylist.size());
		
		//요소 추가 (중복된 요소) : 하나
		arraylist.add("하나");
		for(String str : arraylist)
			System.out.println(str);
		
		System.out.println("<< 요소 추강 >> 인덱스 자리에 다섯을 넣어람");
		// 요소 추가 (인뎃스 1의 자리에 다섯 추가) : 다섯
		arraylist.add(1,"다섯");
		for(String str : arraylist)
			System.out.println(str);
		
		//모든 요소 삭제 
		arraylist.clear();
		System.out.println("끝 갯수 >>" + arraylist.size());
	}
}
