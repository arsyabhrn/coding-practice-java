package codinginterview.JavaDequeue;

import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.offer(num);
            if (deque.size() == 3){
                deque.stream().sorted();
                deque.poll();
            }
        }
    }
}
