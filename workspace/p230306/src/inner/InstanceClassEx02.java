package inner;
interface Yahoo{
	public void showNum();
}

class OuterTwo{
	public Inner getInner(int num) {
		return new Inner(num);
	}
	
	private class Inner implements Yahoo{
		int num;
		Inner(int num) {
		this.num = num;
		System.out.println(" Inner class  생성자 실행");
		}
		public void showNum() {
			System.out.println("Inner class  num : >>>" + this.num);
		}
	}
}
public class InstanceClassEx02 {
	public static void main(String[] args) {
//		OuterTwo outer = new OuterTwo();
//		OuterTwo.Inner innner = outer.new Inner(5);
//		innner.showNum();
		
		OuterTwo outer = new OuterTwo();
		
	}
}
