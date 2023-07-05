public class Quiz03 {

	public class Queue {
	    char[] Q;
	    int push;
	    int pop;
	  
	    public Queue(int size) {
	        Q = new char[size];
	        push = 0;
	        pop = -1;
	    }
	  
	    public void enQueue(char value) {
	        if (pop == Q.length - 1) {
	            System.out.println("큐가 가득 찼습니다.");
	            System.exit(0);
	        
	        }
	        Q[++pop] = value;
	    }
	  
	    public char deQueue() {
	        if (push > pop) {
	            System.out.println("큐에 값이 없습니다.");
	            System.exit(0);
	        }
	        return Q[push++];
	    }
	}
	public static void main(String[] args) {
	}
}