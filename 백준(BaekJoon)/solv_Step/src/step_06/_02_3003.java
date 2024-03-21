package step_06;
import java.util.*;

public class _02_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] result = new int[chess.length];

        for (int i = 0; i < chess.length; i++) {
            int a = sc.nextInt();

            if (a != chess[i]) {
                result[i] = chess[i] - a;
            } else {
                result[i] = 0;
            }
        }

        for (int item : result) {
            System.out.print(item + " ");
        }
    }
}
