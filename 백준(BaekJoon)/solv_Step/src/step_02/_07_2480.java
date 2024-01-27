package step_02;
import java.util.*;
// 주사위 세개 (정답!!)

public class _07_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D;

        if (A==B && B==C) {
            System.out.println(10000+(A*1000));
        } else if (A==B) {
            System.out.println(1000+(A*100));
        } else if (B==C) {
            System.out.println(1000+(B*100));
        } else if (A==C) {
            System.out.println(1000+(C*100));
        } else {
            if (A>B && A>C) {
                System.out.println(A*100);
            } else if (B>C) {
                System.out.println(B*100);
            } else {
                System.out.println(C*100);
            }

        }
    }
}
