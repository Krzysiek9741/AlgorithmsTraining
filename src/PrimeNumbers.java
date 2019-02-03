public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(7));
    }

    private static boolean isPrimeNumber(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
