import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int units = number % 10;
        int dozens = (number / 10) % 10;
        int hundreds = number / 100;
        int reverseNumber = units * 100 + dozens * 10 + hundreds;
        System.out.println(reverseNumber);
    }
}
