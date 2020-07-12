package bingfa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution2 {
    static int i = 0;

    public void method() {
        synchronized (this) {
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Solution2 solution = new Solution2();
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 100000; i++) {
            service.execute(new Runnable() {
                public void run() {
                    solution.method();
                }
            });
        }

        Thread.sleep(1000);
        System.out.println(i);
        service.shutdown();
    }
}