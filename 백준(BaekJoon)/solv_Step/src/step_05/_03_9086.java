package step_05;
import java.util.*;

public class _03_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=0; i<T; i++) {
            String word = sc.next();

            System.out.print(word.charAt(0));
            System.out.print(word.charAt(word.length()-1));
            System.out.println();
        }
    }
}
