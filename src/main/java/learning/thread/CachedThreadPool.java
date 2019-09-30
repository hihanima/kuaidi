package learning.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            executorService.execute(new LiftOff());
        }
        System.out.println("1111111111");
        executorService.shutdown();
        System.out.println("2222222222333");
    }
}
