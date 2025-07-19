package trails;


public class ThreadSync {
    public static void main(String[] args) throws  Exception {
        Counter counter = new Counter();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    counter.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    counter.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("final count: "+counter.count);
        Thread.currentThread().sleep(2000);
        System.out.println("final count: "+counter.count);
    }
}

class Counter{
    int count;
    void increment() throws InterruptedException {
        count++;
        Thread.currentThread().sleep(10);
    }
}