package step_05;
import java.util.*;
public class _09_2908 {
    public static void main(String[] args) {
        // 내 풀이
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = "";
        String d = "";

        String[] a_arr = a.split("");
        String[] b_arr = b.split("");

        String tmp = a_arr[0];
        a_arr[0] = a_arr[2];
        a_arr[2] = tmp;

        tmp = b_arr[0];
        b_arr[0] = b_arr[2];
        b_arr[2] = tmp;

        for (int i = 0; i < a_arr.length; i++) {
            c += a_arr[i];
            d += b_arr[i];
        }

        if (Integer.parseInt(c) > Integer.parseInt(d)) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }

        /*
        // 다른 사람의 풀이
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        s2 = sc.next();
        sc.close();

        // reverse() : StringBuffer 클래스의 reverse() 메서드로써 문자열을 거꾸로 뒤집는다.
        // toString() : 이 메서드를 사용해서 String으로 변환해 준다.
        String reverseA = new StringBuffer(s1).reverse().toString();
        String reverseB = new StringBuffer(s2).reverse().toString();

        int inA = Integer.parseInt(reverseA);
        int inB = Integer.parseInt(reverseB);

        System.out.println(inA > inB ? inA : inB);
        */
    }
}
