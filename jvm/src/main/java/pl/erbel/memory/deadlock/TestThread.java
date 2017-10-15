package pl.erbel.memory.deadlock;

// http://www.makeinjava.com/create-simulate-deadlock-java-multithreading-example/

/**
 * Mutual exclusion: The resources involved in the deadlock must be nonshareable.
 Only one task can use the resource at a time.
 Hold and wait condition: A task has the mutual exclusion for a resource and it’s
 requesting the mutual exclusion for another resource. While it’s waiting, it doesn’t
 release any resources.
 No pre-emption: The resources can only be released by the tasks that hold them.
 Circular wait: There is a circular waiting where Task 1 is waiting for a resource that
 is being held by Task 2, which is waiting for a resource being held by Task 3, and so
 on until we have Task n that is waiting for a resource being held by Task 1.
 There exist some mechanisms that you can use to avoid deadlocks:
 Ignore them: This is the most commonly used mechanism. You suppose that a
 deadlock will never occur on your system, and if it occurs, you can see the
 consequences of stopping your application and having to re-execute it.
 Detection: The system has a special task that analyzes the state of the system to
 detect if a deadlock has occurred. If it detects a deadlock, it can take action to remedy
 the problem. For example, finishing one task or forcing the liberation of a resource.
 Prevention: If you want to prevent deadlocks in your system, you have to prevent
 one or more of Coffman’s conditions.
 Avoidance: Deadlocks can be avoided if you have information about the resources
 that are used by a task before it begins its execution. When a task wants to start its
 execution, you can analyze the resources that are free in the system and the resources
 that the task needs to decide that it can start its execution or not.
 */
public class TestThread {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String args[]) {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        T1.start();
        T2.start();
    }

    //THREAD MONITORING
    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding lock 1...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Thread 1: Interrupted!");
                }
                System.out.println("Thread 1: Waiting for lock 2...");

                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 2...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Thread 2: Interrupted!");
                }
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}