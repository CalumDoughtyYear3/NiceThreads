//Exercise5.10 (UserRunnable & UserThread)
import java.util.Scanner;

public class UserRunnable implements Runnable {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name: ");
        String name = scanner.next();

        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        UserRunnable userRunnable = new UserRunnable();
        Thread thread1 = new Thread(userRunnable);
        //Thread thread2 = new Thread(runnableMulti);
        thread1.start();
        //thread2.start();
    }
}
