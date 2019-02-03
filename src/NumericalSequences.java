public class NumericalSequences {
    public static void main(String[] args) {
        oddNumbers(30);
        System.out.println();
        hundredsAndTens(20);
        System.out.println();
        evenPyramid(20);
        System.out.println();
        powerOfNumbers(10);
        System.out.println();
        //fibonacciSequence(20);

    }

    private static void oddNumbers(int n) {
        for (int i = 1; i <= 2*n; i+=2){
            System.out.print(i + ", ");
        }
    }

    private static void hundredsAndTens(int n) {
        for(int i = 1; i <= n/2; i++){
            System.out.print(100*i + ", " + 10*i + ", ");
        }
    }

    private static void evenPyramid(int n) {
        for (int i = 0; i <= n; i += 2){
            System.out.print(i + ", ");
        }
        for (int i = n-2; i >= 0; i -= 2){
            System.out.print(i + ", ");
        }
    }

    private static void powerOfNumbers(int n) {
        for (int i = 1; i <= n; i++){
            System.out.print(Math.pow(i, 2) + ", ");
        }
    }

    /*private static void fibonacciSequence(int n) {
        int a = 0;
        for ( int i = 1; i <= n; i++){
            a = a +
        }
    }*/

}
