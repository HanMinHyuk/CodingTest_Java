package _0x06_Queue;
// 큐 2

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _02_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int num = 0;
        int backNum = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    queue.add(num);
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
                        for (int j = 0; j < queue.size(); j++) {
                            if (j == queue.size() - 1) {
                                backNum = queue.peek();
                            }
                            queue.add(queue.poll());
                        }
                        bw.write(backNum + "\n");
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
