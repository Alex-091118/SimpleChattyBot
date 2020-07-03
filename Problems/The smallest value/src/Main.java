import java.util.Scanner;

class Main {
    public static long factorialN(int n) {
        long result = 1;
        int count = n;
        if (n <= 1) {
            return 1;
        } else {
            while (count > 0) {
                result *= count--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        int i = 0;
        while (factorialN(i) <= input) {
            i++;
        }
        System.out.println(i);

    }



}