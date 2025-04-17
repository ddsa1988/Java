package mainThread;

public class Example001 {
    public static void userMain() {
        Thread thread = Thread.currentThread();

        System.out.println("Current thread: " + thread);

        thread.setName("My thread");

        System.out.println("Current thread: " + thread);
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread priority: " + thread.getPriority());
        System.out.println("Thread state: " + thread.getState().toString());

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print(i + " ");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }

        System.out.println("\nThread finished.");
    }
}
