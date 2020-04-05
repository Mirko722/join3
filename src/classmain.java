public class classmain {
public static void main(String[] args) throws InterruptedException {

        classthread cos = new classthread();
        classthread cos1 = new classthread();
        classthread cos2 = new classthread();
        cos.start();
        cos.join();
        cos1.start();
        cos2.start();


        }
        }