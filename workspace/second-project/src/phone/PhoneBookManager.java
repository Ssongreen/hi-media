package phone;

public class PhoneBookManager {
	private static final int MAX_CNT = 100;
	private PhoneBookInfo[] infoStorage = new PhoneBookInfo[MAX_CNT];
	private int index;

	private int search(String name) {
		for (int i = 0; i < index; i++) {
			if (infoStorage[i].name.equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public void inputData() {
		System.out.println("데이터 입력중");
		System.out.println("이름  :");
		String name = MenuViewer.INPUT.next();
		System.out.println("전화번호  :");
		String phoneNumber = MenuViewer.INPUT.next();
		if (index < MAX_CNT) {
			infoStorage[index++] = new PhoneBookInfo(name, phoneNumber);
			System.out.println("데이터 입력 완료");
		} else {
			System.out.println("데이터 초과");
		}
	}

	public void searchDate() {
		System.out.println("데이터를 검색합니다");
		System.out.println("이름  ???");
		String ma = MenuViewer.INPUT.next();
		if (search(ma) > -1) {
			System.out.println("이름 :" + infoStorage[search(ma)].name);
			System.out.println("이름 :" + infoStorage[search(ma)].PhoneNumber);
			System.out.println("데이터를 검색 했어요");
		} else {
			System.out.println("찾는 데이터가 없어용");
		}

	}

	public void deleteData() {
		System.out.println("삭제할 이름를 입력해주세요");
		System.out.println("이름 :");
		String na = MenuViewer.INPUT.next();
		int searchIndex = search(na);
		if (searchIndex > -1) {
			for (int i = searchIndex; i < index; i++) {
				if (i + 1 == index) {
					infoStorage[i] = null;
					index -= 1;
				} else {
					infoStorage[i] = infoStorage[i + 1];
				}
		}
		System.out.println("데이터가 삭제 되었어요");
	}else {
		System.out.println("해당 되는 데이터 가 없어요");
	}
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
