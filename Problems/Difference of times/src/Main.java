import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println((numbers[3] - numbers[0]) * 3600 + (numbers[4] - numbers[1]) * 60 + numbers[5] - numbers[2]);
    }
}
