package step_01;
import java.util.*;

public class _10_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tmp1 = sc.nextLine();
        int x = Integer.parseInt(tmp1);

        String tmp2 = sc.nextLine();
        int y = Integer.parseInt(tmp2);

        System.out.println((y%10) * x);
        System.out.println((y%100)/10 * x);
        System.out.println((y%1000)/100 * x);
        System.out.println(y * x);
    }
}
