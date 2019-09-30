package learning;

public class DaemonTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 线程开始....");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread 线程结束....");
            }
        });
//        thread.setDaemon(true);
        thread.start();
        System.out.println("main线程 结束....");
    }

}
