package abstractclass;

abstract class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	// 추상메서
	public abstract void play();

	public void animalPlay() {
		System.out.println(name + "는");
	}
}

class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	public void animalPlay() {
		System.out.println("로이는 터그 놀이중");

	}

	class Dog extends Animal {

		public Dog(String name) {
			super(name);
		}

		public void animalPlay() {
			System.out.println("베어는 낚싯대 놀이즁");
		}
	}

public class Ex03 {

	public static void main(String[] args) {

		Dog roy = new Dog("로이");
		Cat bear = new Cat("킁킁");
		roy.animalPlay();
		bear.animalPlay();
	}

}
