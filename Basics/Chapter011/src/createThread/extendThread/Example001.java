package createThread.extendThread;

public class Example001 {
    public static void userMain() {
        NewThread thread = new NewThread();

        // Starts the thread
        thread.start();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main thread: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        System.out.println("Main thread finished.");
    }
}
