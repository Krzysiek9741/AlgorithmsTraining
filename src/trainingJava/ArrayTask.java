package trainingJava;

import java.util.Random;

public class ArrayTask {

    public static void main(String[] args) {

        Array2D arr = new Array2D(5);

        arr.addRandom();
        arr.print();
        System.out.println();
        System.out.println(arr.sum());
        System.out.println(arr.max());
        System.out.println(arr.min());
        System.out.println(arr.avg());
        System.out.println(arr.sumHalfArray());
        System.out.println(arr.maxHalfArray());
        System.out.println(arr.avgHalfArray());
        arr.printHalf();
        arr.printQuarter();
        arr.printEighth();

    }
}
