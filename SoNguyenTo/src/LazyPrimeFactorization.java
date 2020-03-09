public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i=0; i< 100;i++){
            if (isPrime(i)){
                System.out.println("Cách 1: " + i);
            }
        }
    }

    public boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for (int i=2;i<n;i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

}
