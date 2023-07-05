
import phone.*;

public class PhoneBook {
	
	public static void main(String[] args) {
		MenuViewer viewer = new MenuViewer();
		PhoneBookManager manager = new PhoneBookManager();
		in: while (true) {
			MenuViewer.showMenu();
			int answer = MenuViewer.INPUT.nextInt();
			
			switch (answer) {
			case 1:
				manager.inputData();
				break;
			
			case 2:
				manager.searchDate();
				break;
			
			case 3:
				manager.deleteData();
				break;
			
			case 4:
				manager.listData();
				break;
			
			case 5:
				System.out.println("프로그램 종료");
				break in;
			
			default:
				System.out.println("잘못된 입력이에용");
		}
		System.out.println();
	}
	MenuViewer.INPUT.close();
}
}
