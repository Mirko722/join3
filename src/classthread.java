
public class classthread extends Thread {
    public void run() {


        //counter da 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("numero thread: " + i);

        }
    }
}
