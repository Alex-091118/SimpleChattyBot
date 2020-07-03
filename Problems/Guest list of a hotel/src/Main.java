
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] guests = new String[8];
        for (int i = 0; i < guests.length; i++) {
            guests[i] = scanner.next();
        }
        for (int i = guests.length - 1; i >= 0; i--) {
            System.out.println(guests[i]);
        }
    }
}
