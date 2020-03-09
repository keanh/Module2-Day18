public class OptimizedPrimeFactorization extends Thread {
    @Override
    public void run() {
        for (int i=0; i < 100; i++){
            if (isPrime(i)){
                System.out.println("Cách 2: " + i);
            }
        }
    }

    public boolean isPrime(int n){
        if (n<2){
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i=2; i < squareRoot; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
