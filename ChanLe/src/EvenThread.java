public class EvenThread implements Runnable {

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            try{
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i%2 == 0){
                System.out.println("Số chẵn: " + i);
            }
        }
    }
}
