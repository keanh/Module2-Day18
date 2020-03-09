public class NumberGenerator implements Runnable {
    public NumberGenerator() {
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " ");
            System.out.println("Độ ưu tiên " + Thread.currentThread().getPriority() );
        }
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
