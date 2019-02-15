public class MinimumOfBanknotes {
    public static void main(String[] args) {
        minimumNumberOfBanknotes(235.79);
    }

    private static void minimumNumberOfBanknotes(double value) {
        double[] denominations = {value + 1, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        for (int i = 1; i < denominations.length; i++) {
            value = value % denominations[i - 1];
            int a = ((int) (value * 100)) % ((int) (denominations[i - 1] * 100));
            int b = ((int) (denominations[i] * 100));
            if (a / b != 0) {
                System.out.println("Number of " + denominations[i] + " PLN notes/coins: " + (a / b));
            }
        }
    }
}
