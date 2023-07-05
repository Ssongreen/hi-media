class Product{														
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

	class Tv extends Product{
		public Tv() {
			super(100);
	}
		public String toString() {
			return "Tv";
	}
}
	
	class Computer extends Product{
		public Computer() {
			super(200);
	}
		public String toString() {
			return "Computer";
	}
}
	class Buyer{
		int money = 1000;
		int bonusPoint=0;
		
		void buy(Product p) {
			if(money < p.price) {
				System.out.println("잔액이 부족해용 물건 구매 안되용");
				return;
	}
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p + "을/를 구입했어요");
	}
}
public class PolymorphismEx03 {

	public static void main(String[] args) {
		Buyer b =new Buyer(); //buyer 클래스에 b의 변수로 설정 
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다");
		System.out.println("현재 보너스 점수는" + b.bonusPoint+"점 입니다");
		
	}

}
