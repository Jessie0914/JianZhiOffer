package practice.bingfa;

/**
 * @ClassName OddEven
 * @Description TODO
 * @Author shishi
 * @Date 2020/3/27 14:39
 **/
class OddEven implements Runnable {
    static int count = 0;
    @Override
    public void run() {
        synchronized (OddEven.class){
            while (count<=30){
                switch (count%2){
                    case 0:
                        System.out.println(count);
                        count++;
                        break;
                    case 1:
                        System.out.println(count);
                        count++;
                        break;
                    default:
                        break;
                }
            }
        }

    }
}

class Test2{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new OddEven());
        Thread thread2 = new Thread(new OddEven());

        thread1.start();
        thread2.start();
    }

}
