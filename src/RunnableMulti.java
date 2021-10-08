//Standalone
public class RunnableMulti implements Runnable {

    @Override
    public void run(){
        System.out.println("Thread is running ...");
    }

    public static void main(String[] args) {
        RunnableMulti runnableMulti = new RunnableMulti();
        Thread thread1 = new Thread(runnableMulti);
        Thread thread2 = new Thread(runnableMulti);
        thread1.start();
        thread2.start();
    }

}
