package step_05;
import java.util.*;
public class _08_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String K = sc.nextLine();

        ArrayList<String> arr = new ArrayList(Arrays.asList(K.split(" ")));

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals("")) {
                arr.remove(i);
            }
        }

        System.out.println(arr.size());
    }
}
