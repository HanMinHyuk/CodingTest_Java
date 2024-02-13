package step_05;
import java.util.*;

public class _06_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] location = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,-1, -1, -1, -1, -1, -1};

        String S = sc.next();

        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == S.charAt(i)) {
                    if (location[j] != -1) {
                        continue;
                    }
                    location[j] = i;
                }
            }
        }

        for (int k : location) {
            System.out.print(k + " ");
        }
    }
}
