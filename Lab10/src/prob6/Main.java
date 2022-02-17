package prob6;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(15);
        CountDownLatch latch = new CountDownLatch(50);
        Queue queue = new Queue();
        for(int i=0;i<50;i++){
            int finalI = i;
            executor.submit(() -> {
                queue.add(finalI);
                latch.countDown();
            });
        }
        latch.await();
        System.out.println(queue.size);
    }
}