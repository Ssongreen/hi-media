import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userValue;
        int total = 0;

        System.out.println("숫자 입력. [종료는 0 입력]");

        do {
            System.out.print(">> ");
            userValue = scanner.nextInt();
            total += userValue;
        } while (userValue != 0);

        System.out.println("입력한 정수의 총 합: " + total);

        scanner.close();
    }
}





