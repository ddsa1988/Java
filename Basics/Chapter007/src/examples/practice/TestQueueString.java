package examples.practice;

public class TestQueueString {
    public static void userMain() {
        var queue = new QueueString(3);

        System.out.println(queue);

        queue.push("Diego");
        queue.push("Amanda");
        queue.push("Rodrigo");
        queue.push("Mike");
        System.out.println(queue);

        queue.pop();
        System.out.println(queue);

        queue.pop();
        System.out.println(queue);
        queue.pop();
        queue.pop();
        System.out.println(queue);
    }
}
