package createThread.extendThread;

public class NewThread extends Thread {
    public NewThread() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);
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
