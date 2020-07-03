import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            words.add(scan.next());
        }
        Collections.reverse(words);
        for (String x : words) {
            System.out.println(x);
        }
    }
}
