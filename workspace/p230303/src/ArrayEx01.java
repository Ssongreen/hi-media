import java.util.Arrays;

public class ArrayEx01 {

	
	public static void main(String[] args) {
		
		//1. 길이가 3인 String 1차원 배열
		String[] str = new String[3];
		str[0] = "one";
		str[1] = "two";
		str[2] = "three";
//		str[3] = "four"; 에러러럴
		
		
		//2. 배열 요소 출력
		//향상된 for문움
		for(String w : str)
			System.out.println(w);
		
		
		//배열을 문자열롱 출력할 때 많이 해요용 ! check 
		System.out.println(" 배열을 문자 열로 ");
		System.out.println(Arrays.toString(str));
		System.out.println(" ");
		//3. 배열 복사
		/**  배열의 길이를 늘리고 싶을 때 사용 
		 * 원본의 배열을 늘려야 할 때, 새로운 배열을 창조하고 덮어 쓰기 한당
		 */
		
		
		//3-1. 얕은 복사 : shallow copy ================ 
		
		String[] shallowCopy = str;
		
		System.out.println("<< shallow copy a Arrays >>");
		for(String w : shallowCopy)
			System.out.println(w);
		
		//요소 변경 : 인덱스 1의 값을 ten 변경
		System.out.println(" ");
		shallowCopy[1] = "ten";
		
		System.out.println("\n 인덱스 1의 값을 ten으로 변경후 >>");
		
		System.out.println("<< shallow copy a Arrays >>");
		for(String w : shallowCopy)
			System.out.println(w);
		
		System.out.println(" ");
		System.out.println("<< shallow copy 원본 >>");
		for(String w : str)
			System.out.println(w);
		
		
		//3-2. 깊은 복사 : deep copy ===================
		String[] deepCopy = Arrays.copyOf(str, 10);
		for(int i = 0; i<deepCopy.length; i++)
			System.out.printf("deepCopy[%d] : %s\n ", i, deepCopy[i]);
		
		// 인덱스 0이 "안녕" 으로 변경
		deepCopy[0] = "안녕?";
		System.out.println(" ");
		System.out.println("인덱스 0의 값을 안녕으로 변경 후");
		System.out.println("deepCopy 배열");
		for(String s : deepCopy)
			System.out.println(s);
		
		System.out.println(" ");
		System.out.println("<< deep copy 원본 >>");
		for(String w : str)
			System.out.println(w);
		
	}

}

