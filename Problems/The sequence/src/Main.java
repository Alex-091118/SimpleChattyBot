import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sequence = new int[size];
        int i = 0;
        while (i != size) {
            sequence[i] = scanner.nextInt();
            i++;
        }
        Arrays.sort(sequence);
        int result = 0;
        for (int j = size - 1; j >= 0; j--) {
            result = sequence[j];
            if (result % 4 == 0) {
                break;
            }
        }
        System.out.println(result);

    }
}
