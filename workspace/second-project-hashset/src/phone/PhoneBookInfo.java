package phone;

public class PhoneBookInfo {
	public PhoneBookInfo() {}
	String name;
	String PhoneNumber;
	
	public PhoneBookInfo(String name, String phoneNumber) {
		this.name = name;
		this.PhoneNumber = phoneNumber;
	}	
	public void showPhoneInfo() {
		System.out.println("이름 >> " + this.name);
		System.out.println("전화번호 >> " + this.PhoneNumber);
		System.out.println(" ");
	}
		
}
