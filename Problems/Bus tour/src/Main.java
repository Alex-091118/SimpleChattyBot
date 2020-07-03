import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightBus = scanner.nextInt();
        int countBridge = scanner.nextInt();

        for (int i = 0; i < countBridge; i++) {
            int checkBridge = scanner.nextInt();
            if (checkBridge <= heightBus) {
                System.out.println("Will crash on bridge " + (i + 1));
                System.exit(0);
            }
        }
        System.out.println("Will not crash");
    }
}