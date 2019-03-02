package trainingJava;

import java.util.Random;

public class Array2D {


    private int n;
    private int[][] array2D;

    public Array2D(int n) {
        this.n = n;
        this.array2D = new int[n][n];
    }


    public void addRandom() {
        Random random = new Random();

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = random.nextInt(10);
            }
        }
    }

    public void print() {
        for (int i = 0; i < array2D.length; i++) {
            System.out.println();
            System.out.println();
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + "    ");
            }
        }
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                sum += array2D[i][j];
            }
        }
        return sum;
    }

    public int max() {
        int max = array2D[0][0];
        ;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                }
            }
        }
        return max;
    }

    public int min() {
        int min = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] < min) {
                    min = array2D[i][j];
                }
            }
        }
        return min;
    }

    public double avg() {
        double avg;
        avg = (double) sum() / (n * n);
        return avg;
    }

    public int sumHalfArray() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = array2D[i].length - 1; j >= i; j--) {
                sum += array2D[i][j];
                count++;
            }
        }
        return count;
    }

    public int maxHalfArray() {
        int max = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = array2D[i].length - 1; j >= i; j--) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                }
            }
        }
        return max;
    }
    public int minHalfArray() {
        int min = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = array2D[i].length - 1; j >= i; j--) {
                if (array2D[i][j] < min) {
                    min = array2D[i][j];
                }
            }
        }
        return min;
    }

    public double avgHalfArray() {
        double avg;
        avg = (double) sumHalfArray() / (n*n/2+n);
        return avg;
    }

    public void printHalf() {
        for (int i = 0; i < array2D.length; i++) {
            System.out.println();
            System.out.println();
            for (int j = i; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + "    ");
            }
        }
    }

    public void printQuarter() {
        for (int i = 0; i < array2D.length/2; i++) {
            System.out.println();
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(array2D[i][j] + "    ");
            }
        }

        for (int i = array2D.length/2; i < array2D.length; i++) {
            System.out.println();
            System.out.println();
            for (int j = 0; j < array2D.length-i; j++) {
                System.out.print(array2D[i][j] + "    ");
            }
        }
    }

    public void printEighth() {
        for (int i = array2D.length/2; i < array2D.length; i++) {
            System.out.println();
            System.out.println();
            for (int j = array2D[i].length - 1 - i; j <= array2D[i].length/2; j++) {
                System.out.print(array2D[i][j] + "    ");
            }
        }
    }


}
