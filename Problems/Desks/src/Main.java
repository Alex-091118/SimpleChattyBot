import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();
        System.out.println(firstGroup / 2 + firstGroup % 2 + secondGroup / 2 + secondGroup % 2 +
                thirdGroup / 2 + thirdGroup % 2);

    }
}