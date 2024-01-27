package step_02;
import java.util.*;
// 사분면 고르기 (정답!!)

public class _04_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (0<x && 0<y) {
            System.out.println("1");
        } else if (0>x && 0<y) {
            System.out.println("2");
        } else if (0>x && 0>y) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }

        /* <다른 사람이 한 것>
        Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    if(x>0) {
		    if(y>0) {
			    System.out.println(1);
		    } else {
			    System.out.println(4);
		    }
	    } else {
		    if(y>0) {
			    System.out.println(2);
		    } else {
			    System.out.println(3);
		    }
	    }
	    }
         */
    }
}
