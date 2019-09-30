
/**
 * @author zhengbinMac
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            System.out.println(ready);
            while(!ready) {
                System.out.println(ready);
//                Thread.yield();
            }
            System.out.println(number);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}