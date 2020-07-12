package bingfa;

/**
 * @ClassName ABC
 * @Description TODO
 * @Author shishi
 * @Date 2020/3/15 12:56
 **/
public class ABC implements Runnable{
    private static int count = 0;
    @Override
    public void run(){
        synchronized (ABC.class){
            while (count<30){
                switch (count%3){
                    case 0:
                        System.out.println("A");
                        count++;
                        break;
                    case 1:
                        System.out.println("B");
                        count++;
                        break;
                    case 2:
                        System.out.println("C");
                        count++;
                        break;
                    default:
                        break;
                }
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ABC());
        Thread thread2 = new Thread(new ABC());
        Thread thread3 = new Thread(new ABC());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
