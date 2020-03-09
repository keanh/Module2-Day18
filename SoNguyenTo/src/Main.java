public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        Thread thread1 = new Thread(lazyPrimeFactorization);
        OptimizedPrimeFactorization thread2 = new OptimizedPrimeFactorization();

        thread1.start();
        thread2.start();
    }
}
