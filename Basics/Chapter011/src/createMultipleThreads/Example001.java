package createMultipleThreads;

public class Example001 {
    public static void userMain() {
        NewThread thread1 = new NewThread("One");
        NewThread thread2 = new NewThread("Two");
        NewThread thread3 = new NewThread("Three");

        thread1.startThread();
        thread2.startThread();
        thread3.startThread();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        System.out.println("Main thread finished.");
    }
}
