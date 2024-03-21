package step_06;
import java.util.*;

public class _04_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.next();

        StringBuffer sb = new StringBuffer(first);
        String second = sb.reverse().toString();

        if (first.equals(second)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
