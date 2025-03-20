/*
 * This is a test program with two threads that share a common object.
 * Inter-thread communication is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed.
 * It is implemented using wait(), notify() and notifyAll() methods.
 */
class Athread {
    int amount = 10000;
    synchronized void withdraw(int amt) {
        System.out.println("going to withdraw...");
        if (amount < amt) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        amount -= amt;
        System.out.println("withdraw completed wit Rs." + amt);
        System.out.println("Current balance is: " + amount);
    }

    synchronized void deposit(int amt) {
        System.out.println("going to deposit...");
        amount += amt;
        System.out.println("deposit completed with Rs." + amt);
        System.out.println("Current balance is: " + amount);
        notify();
    }
}

public class InterThread {
    public static void main(String[] args) {
        Athread obj = new Athread();
        new Thread() {
            public void run() {
                obj.withdraw(15000);
            }
        }.start();

        new Thread() {
            public void run() {
                obj.deposit(10000);
            }
        }.start();
    }
}