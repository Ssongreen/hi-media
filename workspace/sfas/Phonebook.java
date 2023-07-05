import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contact {
private String name;
private String phoneNumber;

public Contact(String name, String phoneNumber) {
  this.name = name;
  this.phoneNumber = phoneNumber;
}

public String getName() {
  return name;
}

public String getPhoneNumber() {
  return phoneNumber;
}
}

class PhoneBook {
private List<Contact> contacts;

public PhoneBook() {
  contacts = new ArrayList<>();
}

public void addContact(String name, String phoneNumber) {
  Contact contact = new Contact(name, phoneNumber);
  contacts.add(contact);
  System.out.println("연락처가 추가되었습니다.");
}

public void removeContact(String name) {
  Contact contactToRemove = null;
  for (Contact contact : contacts) {
      if (contact.getName().equals(name)) {
          contactToRemove = contact;
          break;
      }
  }

  if (contactToRemove != null) {
      contacts.remove(contactToRemove);
      System.out.println("연락처가 삭제되었습니다.");
  } else {
      System.out.println("해당하는 이름의 연락처가 없습니다.");
  }
}

public void displayAllContacts() {
  System.out.println("전체 연락처 목록:");
  for (Contact contact : contacts) {
      System.out.println("이름: " + contact.getName() + ", 전화번호: " + contact.getPhoneNumber());
  }
}
}

public class Main {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  PhoneBook phoneBook = new PhoneBook();

  while (true) {
      System.out.println("전화번호부 관리 프로그램");
      System.out.println("1. 연락처 추가");
      System.out.println("2. 연락처 삭제");
      System.out.println("3. 전체 연락처 조회");
      System.out.println("4. 종료");
      System.out.print("메뉴 선택: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // 버퍼 비우기

      switch (choice) {
          case 1:
              System.out.print("이름: ");
              String name = scanner.nextLine();
              System.out.print("전화번호: ");
              String phoneNumber = scanner.nextLine();
              phoneBook.addContact(name, phoneNumber);
              break;
          case 2:
              System.out.print("삭제할 연락처의 이름: ");
              String removeName = scanner.nextLine();
              phoneBook.removeContact(removeName);
              break;
          case 3:
              phoneBook.displayAllContacts();
              break;
          case 4:
              System.out.println("프로그램을 종료합니다.");
              System.exit(0);
              break;
          default:
              System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
      }

      System.out.println();
  }
}
}
