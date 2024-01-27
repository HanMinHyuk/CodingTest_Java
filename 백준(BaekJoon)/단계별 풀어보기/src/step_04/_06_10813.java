package step_04;
import java.util.*;

public class _06_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basketCount = sc.nextInt();
        int count = sc.nextInt();

        int[] baskets = new int[basketCount];
        for (int i=1; i<=basketCount; i++) {
            baskets[i-1] = i;
        }

        int tmp = 0;
        for (int j=1; j<=count; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            tmp = baskets[a-1];
            baskets[a-1] = baskets[b-1];
            baskets[b-1] = tmp;
        }

        for (int value : baskets) {
            System.out.print(value + " ");
        }
    }
}
