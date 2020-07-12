package bingfa;

/**
 * @ClassName OddAndEven
 * @Description TODO
 * @Author shishi
 * @Date 2020/2/24 19:07
 **/
public class OddAndEven {
    private static int state = 1;

    static int even = 0;
    static int odd = 1;

    public static void main(String[] args) {
        OddAndEven oddAndEven = new OddAndEven();

        // 打印奇数
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (odd <= 100) {
                    synchronized (oddAndEven) {
                        if (state == 1) {
                            try {
                                oddAndEven.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(odd);
                        odd += 2;
                        state = 1;
                        oddAndEven.notifyAll();
                    }
                }
            }
        });

        // 打印偶数
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (even <= 100) {
                    synchronized (oddAndEven) {
                        if (state == 2) {
                            try {
                                oddAndEven.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(even);
                        even += 2;
                        state = 2;
                        oddAndEven.notifyAll();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
