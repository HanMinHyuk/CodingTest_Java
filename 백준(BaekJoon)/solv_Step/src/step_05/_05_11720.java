package step_05;
import java.util.*;
public class _05_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String number = sc.next();

        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        System.out.println(sum);
    }
}
