package step_06;

import java.util.Scanner;

public class _03_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N-1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = ((N-1) * 2) + 1; j >= (i * 2) + 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= N-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = (i * 2) + 1; j <= ((N-1) * 2) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
