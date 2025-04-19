package waitThreadFinish;

public class Example001 {
    public static void userMain() {
        NewThread t1 = new NewThread("One");
        NewThread t2 = new NewThread("Two");
        NewThread t3 = new NewThread("Three");

        t1.thread.start();
        t2.thread.start();
        t3.thread.start();

        System.out.printf("Thread %s is alive: %b.\n", t1.getName(), t1.thread.isAlive());
        System.out.printf("Thread %s is alive: %b.\n", t2.getName(), t2.thread.isAlive());
        System.out.printf("Thread %s is alive: %b.\n", t3.getName(), t3.thread.isAlive());

        try {
            System.out.println("Waiting for threads to finish.");

            t1.thread.join();
            t2.thread.join();
            t3.thread.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }

        System.out.println("Main thread finished.");

        System.out.printf("Thread %s is alive: %b.\n", t1.getName(), t1.thread.isAlive());
        System.out.printf("Thread %s is alive: %b.\n", t2.getName(), t2.thread.isAlive());
        System.out.printf("Thread %s is alive: %b.\n", t3.getName(), t3.thread.isAlive());
    }
}
