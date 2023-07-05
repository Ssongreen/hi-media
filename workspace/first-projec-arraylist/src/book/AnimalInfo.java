package book;

public class AnimalInfo {
	private String name;
	private int age;

	// 생성자~
	public AnimalInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void showAnimalInfo() {
		System.out.println("name >>> " + this.name);
		System.out.println("age >>> " + this.age);
		System.out.println();
	}

}
