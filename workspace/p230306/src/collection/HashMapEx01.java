package collection;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		// 요소 갯수
		System.out.println("요소 추가 전 갯수  >> " + hashMap.size());
		// 요소 추가
		hashMap.put("하나", 1);
		hashMap.put("둘", 2);
		hashMap.put("삼", 3);
		hashMap.put("하나", 11111);
		// 요소 갯수
		System.out.println("요소 추가 후 갯수 >> " + hashMap.size());
		
		// 저장된 요소 전체 출력
		System.out.println("hasMap >> " + hashMap);
		
		// 저장된 키들의 집합 : 키만 추출
		System.out.println(" ");
		System.out.println("저장된 모든 키 출력");
		System.out.println(hashMap.keySet());
		
		//저장된 값들의 집합
		System.out.println("저장된 모든 값");
		System.out.println(hashMap.values());
		
		// 키를 통합 값 추출 : 특정 키의 값
		System.out.println("키가 '둘'인 요소의 값  " + hashMap.get("둘"));
		
		// 키를 통한 값 출력 : 모든 요소의 값
		System.out.println(" ");
		System.out.println("키와 값 출력 ");
		for (String s : hashMap.keySet())
//			System.out.printf("key : %s, value : %d\n", key, hashMap.get(key));
		
		// 수정 키를 통한 값 변경
		hashMap.replace("하나", 1000);
		System.out.println(" 키가 '하나'인 요소의 값을 1000");
		System.out.println(hashMap);
		
		// 삭제 키를 통한 특정 요소 삭제
		hashMap.remove("하나");
		System.out.println(" ");
		System.out.println("키가 '하나'인 요소 삭제 후");
		System.out.println(hashMap);
	}

}
