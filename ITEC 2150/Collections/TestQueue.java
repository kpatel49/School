package Collections;

public class TestQueue {
    public static void main(String[] args) {


        java.util.Queue<String> queue = new java.util.LinkedList<String>();


        queue.add("Oklahoma");
        queue.add("Indiana");
        queue.add("Georgia");

        System.out.println(queue);
        queue.offer("Texas");
        queue.offer("Oregon");
        queue.offer("New York");
        queue.offer("California");

        System.out.println(queue);
        
    }
}