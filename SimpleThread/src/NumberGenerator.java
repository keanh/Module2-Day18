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
        }
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread = new Thread(numberGenerator);
        thread.start();
    }
}
