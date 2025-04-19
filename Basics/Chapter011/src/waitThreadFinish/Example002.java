package waitThreadFinish;

public class Example002 {
    public static void userMain() {
        NewThread t1 = new NewThread("One");
        NewThread t2 = new NewThread("Two");
        NewThread t3 = new NewThread("Three");

        try {
            System.out.println("Waiting for threads to finish.");

            t1.thread.start();
            t1.thread.join();

            t2.thread.start();
            t2.thread.join();

            t3.thread.start();
            t3.thread.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        System.out.println("Main thread finished.");
    }
}
