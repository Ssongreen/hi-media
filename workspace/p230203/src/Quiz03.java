class ArrayStack{
	int[] arr; 																		// int값 arr로 배열[] 1줄로 설정 
	int top = -1;																	// int가 index에 -1를 설정하여 최대 값을 설정
	final int SIZE = arr.length -1;													// final 변경 할 수 없는 arr의 길이 값
	
	void setArr(int length) {														//들어 와 있는 스택 갯수
		this.arr = new int[length];
	}
	
	//생성자 추가 하기 
	public ArrayStack() {															//생성자 추가
		System.out.println();
	}
	
//	void push(int element) {
//		if(top < SIZE) {
//			arr[++top]  = element;
//		}else {
//			System.out.println("스택이 꽉 찼습니다. 용량 초과");
//		}
	
	void push(int element) {														//스택 안에 넣어지는  입력
		if(top < SIZE) {															// 넣는 최대량 넘치지 않는 코드
			arr[++top]  = element;													// push 입력 값 증가량
			return;																	// 돌아가는 반복
		}
		
		System.out.println("스택이 꽉 찼습니다. 용량 초과");						//최대량 출력			
	}
		int pop() {																	// 빼지는 변수값 설정
			if(top > -1) {															// 넣어진 변수 top에 최소량 설정
				return arr[top--];													
			}else {
				System.out.println("스택이 비었습니다");							//최소량 설정
				return top;
			}
		}
			int peek() {															//뺀 설정
				return arr[top];
			}
	
}

public class Quiz03 {

	public static void main(String[] args) {
		ArrayStack stack = 	new ArrayStack();										// stack의 안에 stack 주소 설정, 
		stack.setArr(5);															// 배열 갯수 설정
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\n top에 있는 아이템 출력" + stack.peek());				//현재 위치 출력
		
		System.out.println("pop 실행" + stack.pop());								// 출력값
		System.out.println("pop 실행" + stack.pop());
		System.out.println("pop 실행" + stack.pop());
		System.out.println("pop 실행" + stack.pop());
		System.out.println("pop 실행" + stack.pop());
		System.out.println("pop 실행" + stack.pop());
		System.out.println("pop 실행" + stack.pop());
	}
}


