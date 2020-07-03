import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 1;
        while (number != 0) {
            number = scanner.nextInt();
            count++;
        }
        System.out.println(count - 1);

    }
}
