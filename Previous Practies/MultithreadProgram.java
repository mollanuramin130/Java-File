public class MultithreadProgram {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new GoodMorningThread());
        Thread thread2 = new Thread(new HelloThread());

        thread1.start();
        thread2.start();
    }
}

class GoodMorningThread implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning!");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // Thread interrupted, exit gracefully
        }
    }
}

class HelloThread implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Hello!");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            // Thread interrupted, exit gracefully
        }
    }
}
