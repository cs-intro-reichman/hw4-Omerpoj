public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int primeCounter = 0;
        for(int i = 3;i < n;i++){
            if (isPrime(i)) {
                System.out.println(i);
                primeCounter++;
            }
        }
        double precent =((double)primeCounter/(double)n);
        System.out.println("There are "+primeCounter+" primes between 2 and "+n+" ("+(int)(precent*100)+"% are primes)");
    }
    public static boolean isPrime(int num){
        int original = num;
        num--;
        while (num > 2) {
            if (original % num == 0) {
                return false;
            }
            num--;
        }
        return true;
    }
}
