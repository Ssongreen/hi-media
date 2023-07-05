import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("정수를 5번 입력하세요:");

        for (int i = 0; i < 5; i++) {
            System.out.print("정수 입력: ");
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("입력한 정수의 합: " + sum);
    }
}
