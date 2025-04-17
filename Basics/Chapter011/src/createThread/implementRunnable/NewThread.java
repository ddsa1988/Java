package createThread.implementRunnable;

public class NewThread implements Runnable {
    Thread thread;

    // Create a nre thread
    public NewThread() {
        thread = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + thread);
    }

    // Thread entry point
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted: " + e);
        }

        System.out.println("Child thread finished.");
    }
}
