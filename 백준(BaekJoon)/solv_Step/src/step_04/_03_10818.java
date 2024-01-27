package step_04;
import java.io.*;
import java.util.*;

public class _03_10818 {
    public static void main(String[] args) throws IOException {
        // 내가 한 것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 배열을 오름차순으로 정렬

        System.out.printf("%d %d", arr[0], arr[arr.length-1]);


        /*
        // 다른 사람이 한 것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        //int [] ary = new int[t];
        ArrayList<Integer> ary = new ArrayList<Integer>(); // ArrayList는 배열과 다르게 크기가 가변적이다.
        for(int i=0; i<t; i++) {
            ary.add(Integer.parseInt(st.nextToken())); // add()메소드로 element를 추가함.
        }
        int max = Collections.max(ary); // Collection 객체의 최대값을 리턴
        int min = Collections.min(ary); // Collection 객체의 최소값을 리턴
        System.out.println(min+" "+max);
        */

    }
}
