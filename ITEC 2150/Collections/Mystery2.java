package Collections;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Mystery2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        mystery2(q);

    }
    public static void mystery2(Queue<Integer> q){
        Stack<Integer> s = new Stack<Integer>();
        int size = q.size();
        for(int i = 0; i < size; i++){
            int n = q.remove();
            if(n % 2 == 0){
                s.push(n); //     s: 2 4 6
            }
            else{
                q.add(n);//     q: 1 3 5
            }
        }
        System.out.println(q + " " + s); //[1,3,5] [2,4,6]
    }
}
