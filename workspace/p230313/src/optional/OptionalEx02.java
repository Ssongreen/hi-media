package optional;

import java.util.Arrays;
import java.util.List;

public class OptionalEx02 {
	public static String findByName(String name) {
		
		List<String> result = Arrays.asList("홍길동", "박보검","이미자");
		for(String s : result) {
			if(s.equals(name))
				System.out.println(s);
			return s;
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("이름 찾아줭  이미자 씨 " + findByName("이미자"));
		System.out.println("이름 찾아줭  하늘 " + findByName("하늘"));
		System.out.println("이름 찾아줭  이미자 씨 " + findByName("이미자"));
		System.out.println("이름 찾아줭  하늘 " + findByName("하늘").length());
		String findName = findByName("하늘");
		
		if(findName != null)
			System.out.println("이름 찾아줭  하늘 " + findByName("하늘").length());
		
	}

}
