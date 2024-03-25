package _0x06_Queue;
// 큐 2

import java.io.*;
import java.util.*;

public class _02_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int num = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        bw.write(queue.poll() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (!queue.isEmpty()) {
                        bw.write(0 + "\n");
                    } else {
                        bw.write(1 + "\n");
                    }
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        bw.write(queue.peek() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        bw.write(queue.peekLast() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
            }

        }
        bw.flush();
        bw.close();

    }
}
