package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Mystery {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.add(1);
        s.add(2);
        s.add(3);
        mystery(s);
    }

    public static void mystery(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        while (!s.isEmpty()) {
            int n = s.pop();
            q.add(n);
            q.add(n);
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        System.out.println(s);
    }

}
