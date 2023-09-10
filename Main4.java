public class Main4 {
    public static void main(String[] args) {
        // given a number n return whether it's prime number
        // input: number, integer
        // output: boolean
        // hackerrank
        // constraints
        // 1<=n<=10^9
        // prime: a number which is fully divisible by 1 and itself
        // example: 2,3,5,7,11,13,
        // 1, 4, 6, 8, 12, 21
        // negative numbers & zero
        boolean result = isPrime(17);
        System.out.println(result);
    }

    static boolean isPrime(int n) {
        if (n == 1) return false;
        int upper = (int) Math.sqrt(n);
        for (int i = 2; i <= upper; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


}
