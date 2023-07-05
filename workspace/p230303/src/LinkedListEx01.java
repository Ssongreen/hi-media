import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		// 저장된 요소 존재 여부 (Node)
		System.out.println("in ㅔ 없어용 ?  " + list.isEmpty());

		// 요소(노도) 추가
		list.add("하나");
		list.add("둘");
		list.add("삼");
		list.add("하나");

		// 저장된 요소(노드) 존재 여부
		System.out.println(" 없어요용 ? " + list.isEmpty());

		// 특정 위치에 저장된 요소 출력
		System.out.println(" 인덱스 1 > >> " + list.get(1));

		// 요소 노드 개수
		System.out.println("저장된 요소 개수 " + list.size());

		// 객체 존재 여부
		System.out.println("요소 둘 잇어여 ?" + list.contains("둘"));
		System.out.println("요소 넷 잇어여 ?" + list.contains("넷"));

		// 저장된 요소 전체 출력
		System.out.println(" ");
		System.out.println("< for 문  >");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		System.out.println("향상된 for문");
		for (String s : list)
			System.out.println(s);

		System.out.println(" to Array");
		for (Object ob : list)
			System.out.println(ob);

		System.out.println("iterator");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}	

		//같은지 비교
			for(String s : list) {
				System.out.println("삼과 같나요? " +s.equals(iter));
			}
		//특정 요소 변경
//			System.out.println("둘 - > 여섯  ");
			System.out.println(" ");
			list.set(list.indexOf("둘"), "여섯");
			for(String s : list)
				System.out.println(s);
		//특정 요소 삭제
			System.out.println(" ");
			System.out.println(" 요소 삼 삭제 ");
			list.remove("삼");
			System.out.println("요소 개수" + list.size());
			for(String s : list)
				System.out.println(s);
}
}