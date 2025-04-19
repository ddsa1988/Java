package waitThreadFinish;

public class NewThread implements Runnable {
    private String name;
    public final Thread thread;

    public NewThread(String name) {
        setName(name);
        thread = new Thread(this, this.name);
        System.out.println("New thread: " + thread);
    }

    private void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Argument must not be null or empty.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted: " + e);
        }

        System.out.println(name + " finished.");
    }
}
