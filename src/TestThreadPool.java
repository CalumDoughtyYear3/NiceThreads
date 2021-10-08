import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//(WorkerThread & TestThreadPool)
public class TestThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 10; i++){
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        executor.shutdown(); //shutdown thread pool

        while(!executor.isTerminated()){

        }
        System.out.println("Finished all threads");
    }

}
