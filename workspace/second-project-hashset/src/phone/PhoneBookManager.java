package phone;

import java.util.HashSet;

public class PhoneBookManager {

	private static final int MAX_CNT = 100;
//	private PhoneBookInfo[] infoStorage = new PhoneBookInfo[MAX_CNT];
//	private int index;
	HashSet<PhoneBookInfo> phoneList = new HashSet<>();
	static PhoneBookManager inst = null;
	public static PhoneBookManager creatManagerInst() {
		if (inst == null)
			inst = new PhoneBookManager();
		return inst;
	}
	boolean haveDuplicate(String name, PhoneBookInfo pi) {
		boolean flag = false;
		if(searchIndex(name)) {
			flag = true;
			System.out.println("이미 저장된 데이터 입니다. 다시 입력해주세요");
			
		}else {
			flag = false;
			System.out.println("데이터 입력 완료");
			phoneList.add(pi);
		}
		return flag;
	}
	
	
	private int search(String name) {
		for (int i = 0; i < index; i++) {
			PhoneBookInfo curInfo = infoStorage[i];
			if (name.equals(curInfo.name)) {
				return i;
			}
		}
		return -1;
	}

	public void inputData() {
		System.out.println("데이터 입력중");
		System.out.print("이름  :");
		String name = MenuViewer.INPUT.next();
		System.out.print("전화번호  :");
		String phoneNumber = MenuViewer.INPUT.next();
		
			System.out.println("데이터 입력 완료");
		PhoneBookInfo pi;
			System.out.println("데이터 초과");
			
	}

	public void searchDate() {
		System.out.print("데이터를 검색합니다");
		System.out.print("이름  ???");
		String ma = MenuViewer.INPUT.next();
		int idx = search(ma);

		if (idx < 0) {
			System.out.println("해당 데이터가 없어용");
		} else {
			infoStorage[idx].showPhoneInfo();
			System.out.println("데이터 검색이 완료에용");
			System.out.println(" ");
		}
	}

	// 객체를 지우는 것이 아니라 객체 주소에 값을 덮어 쓰기로 한다.
	public void deleteData() {
		System.out.println("삭제할 이름를 입력해주세요");
		System.out.print("이름    : ");
		System.out.println(" ");
		String na = MenuViewer.INPUT.next();

		int idx = search(na);

		if (idx < 0) {
			System.out.println("해당 데이터는 없어용");
			return;
		}
		for (int i = idx; i < index; i++) {
			infoStorage[i] = infoStorage[i + 1];
		}
		index--;
		System.out.println("데이터가 삭제 되었어요");
	}

	public void listData() {
		System.out.println("데이터 전체 list ..");
		for (PhoneBookInfo pb : infoStorage) {
			if (pb == null) {
				break;
			}
			System.out.println("이름 :" + pb.name);
			System.out.println(" ");
			System.out.println("번호 :" + pb.PhoneNumber);
		}
		System.out.println("end ...");
	}
}
