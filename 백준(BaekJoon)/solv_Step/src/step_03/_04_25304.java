package step_03;
import java.util.*;
// 영수증 (정답!!)

public class _04_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for(int i=0; i<N; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum += a*b;
        }

        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
