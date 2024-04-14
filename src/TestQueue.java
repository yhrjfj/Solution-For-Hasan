public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(2);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3); // resizes the array
        System.out.println(queue.dequeue()); // prints 1
        System.out.println(queue.peek()); // prints 2
        System.out.println(queue.isEmpty()); // prints false
        System.out.println(queue.isFull()); // prints false
    }
}