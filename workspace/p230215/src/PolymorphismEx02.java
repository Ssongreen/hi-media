class Animal {
	private int age;
	private String name;
	
	
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void showInfo() {
		System.out.println("동물이래");
		
	}
}
class Cat extends Animal{
	// 생성자 alt + shift + s + c
	public Cat(int age, String name) {
		super(age, name);
	}
	@Override
	public void showInfo() {
			System.out.println("나는 고양잉 입니당 " + "나이는 " + super.getAge() + "살 이름은 " + super.getName() + "이얌");
		
	}
//		public void showInfo (int age, string name) {
	}
	
class Dog extends Animal{
	public Dog(int age, String name) {
		super(age, name);
	}
	@Override
	public void showInfo() {
		System.out.println("나는 강아징 입니당 " + "나이는 " + super.getAge() + "살 이름은 " + super.getName() + "이얌");
		
	}
	
	
}
	
	

public class PolymorphismEx02 {

	public static void main(String[] args) {
//		Cat mimi = new Cat(5, "미밍");
//		Dog hoya = new Dog(3, "호양");
//		mimi.showInfo();
//		hoya.showInfo();
		
	// 객체 배열 다형성
		Animal animal[] = {new Cat(5, "미밍"), new Dog(3, "호양")};
		animal[0].showInfo();
		animal[1].showInfo();
	}

}
