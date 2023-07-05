package polymorphism;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	public void summary() {
		return;
	}

}

class Tv extends Product {
	public Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	public Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	String[] list = new String[10];
	int i = -1;
	int sum = 0;

	void buy(Product product) {
		if (money < product.price) {
			System.out.println("잔액이 부족해용 물건 구매 안되용");
			return;
		}
		money -= product.price;
		bonusPoint += product.bonusPoint;
		list[++i] = product.toString();
		System.out.println(product + "상품을 구매했어요");
		sum += product.price;
		return;
	}

	public void summary() {
		String itemList = "";

		for (int index = 0; index < i; index++) {
			if (list[index] == null)
				break;

			itemList += list[index] + ", ";
			System.out.println("구매 리스트 : " + list[index]);
		}
		System.out.println("총액은" + sum + "입니다");
	}

}

public class Ex02 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
//		Product p = new Product(10);
//		System.out.println(p.toString());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.summary();
	}

}
