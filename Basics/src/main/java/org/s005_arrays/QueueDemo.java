package org.s005_arrays;

import org.s005_arrays.models.UserQueue;

public class QueueDemo {
    public static void userMain() {
        UserQueue q = new UserQueue();

        q.add("Diego");
        q.add("Amanda");

        System.out.println(q.size());
        System.out.println(q.peek());
    }
}
