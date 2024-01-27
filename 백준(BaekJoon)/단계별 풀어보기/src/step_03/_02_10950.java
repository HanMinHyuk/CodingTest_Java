package step_03;

import java.util.Scanner;
// A+B -3 (정답!!)

public class _02_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int A, B;

        for (int i=0; i<t; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A + B);
        }

    }
}
