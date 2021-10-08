import java.util.Scanner;

//Exercise5.10 (UserRunnable & UserThread)
public class UserThread extends Thread {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name: ");
        String name = scanner.next();

        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        UserThread thread1 = new UserThread();
        UserThread thread2 = new UserThread();
        thread1.start();
        thread2.start();
    }

}
