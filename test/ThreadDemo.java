class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("Thread A started...");
        for (int i = 0; i < 10; i++) {
            System.out.println("From ThreadA i:" + i);
        }
        System.out.println("Thread A stopped..");
    }
}// ThreadA ends

class ThreadB extends Thread {
    @Override
    public void run() {
        System.out.println("Thread B started...");
        for (int i = 0; i < 10; i++) {
            System.out.println("From ThreadB i:" + i);
        }
        System.out.println("Thread B stopped..");
    }
}
/*
 * public void run() {
 * System.out.println("Thread B started..");
 * for(int i=0; i<10; i++) {
 * try {
 * sleep(1000);
 * System.out.println("From ThreadB i:" + i);
 * }
 * catch()
 * }
 * }
 */

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main thread starts...");
        new ThreadA().start();
        new ThreadB().start();
        System.out.println("Main thread ends...");
    }
}
/*
 * Thread priority value range: 0 - 10
 * 0 --> lowest priority
 * 10 --> Highest priority
 * 5 --> default priority
 */
