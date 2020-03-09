public class Main {
    public static void main(String[] args){
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread thread1 = new Thread(evenThread);

        oddThread.start();
        try {
            oddThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thread1.start();
    }
}
