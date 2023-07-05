import book.BookManager;

public class AnimalBook {
	private static BookManager manager = new BookManager(); // non- static member

	public static void main(String[] args) { // static member

		menu: while (true) {
			System.out.println("정보를 입력해줄까용? (Y / N)   ");
			String answer = BookManager.input.next();

			switch (answer) {
			case "y":
			case "Y":
			case "yes":
			case "Yes":
			case "YES":
				manager.inputData();
				break;
			case "n":
			case "N":
			case "no":
			case "No":
			case "NO":
				manager.showBook();
				System.out.println("프로그램 종료");
				break menu;
			default:
				System.out.println("Y / N 만 입력해주세용");
			}
		}

	}

}
//		if(answer.equals("y") || answer.equals("Y") || 
//				answer.endsWith("YES") || answer.equals("Yes") || answer.equals("yes"))
//			manager.inputData();
//		else if(answer.equals("n") || answer.equals("N") || 
//				answer.endsWith("NO") || answer.equals("No") || answer.equals("no"))
//			break;
//		else
//			System.out.println();
//			System.out.println("Y/N 둘 중 하나 입력 해주세용");
//			System.out.println();
