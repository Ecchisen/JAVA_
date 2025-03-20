/*
 * If you declare any method as synchronized, it is known as synchronized method.
 * Synchronized method is used to lock an object for any shared resource.
 * When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.
*/
class Athread {
    synchronized void deposit(int amount) {
        System.out.println("Deposit completed with Rs." + amount);
    }
    synchronized void withdraw(int amount) {
        System.out.println("Withdraw completed with Rs." + amount);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Athread obj = new Athread();
        Thread t1 = new Thread() {
            public void run() {
                obj.deposit(1000);
            }
        };
        /*
         * If you have two objects and you want to call synchronized methods on them, you
         * can use synchronized block.
         * Above example can be modified like this:
         * new Thread() {
         * public void run() {
         * obj.deposit(1000);
         * }
         * }.start();
         * new Thread() {
         * public void run() {
         * obj.withdraw(500);
         * }
         * }.start();
         */
        Thread t2 = new Thread() {
            public void run() {
                obj.withdraw(500);
            }
        };
        t1.start();
        t2.start();
    }
}