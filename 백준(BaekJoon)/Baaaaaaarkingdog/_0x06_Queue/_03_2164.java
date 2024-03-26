package _0x06_Queue;
// 카드2
import java.util.*;
import java.io.*;

public class _03_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }

        while (queue.size() > 1 && !queue.isEmpty()) {
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
