package implementationOfTheCollections.myBinaryHeap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyBinaryHeapTest {
    public static void main(String[] args) {

        Integer[] nodes = new Integer[]{8, 7, 6, 6, 4, 6, 5, 2, 1, 4, 3, 6, 2, 4};

        MyBinaryHeap elements = new MyBinaryHeap();

        for (Integer elem: nodes){
            elements.add(elem);
        }
        elements.printBinaryHeap();
        elements.findMySons(0);
        elements.add(10);
        elements.findMySons(1);
        elements.printBinaryHeap();
            }


}
