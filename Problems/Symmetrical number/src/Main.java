import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] digits = new int[4];
        digits[0] = number / 1000;
        digits[1] = number / 100 % 10;
        digits[2] = number / 10 % 10;
        digits[3] = number % 10;
        if (digits[0] == digits[3] && digits[1] == digits[2]) {
            System.out.println("1");
        } else {
            System.out.println(new Random().nextInt());
        }
    }
}
