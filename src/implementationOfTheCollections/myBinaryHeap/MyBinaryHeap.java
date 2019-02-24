package implementationOfTheCollections.myBinaryHeap;

import java.util.ArrayList;

public class MyBinaryHeap {

    private ArrayList<Integer> nodes = new ArrayList<>();

    public void findMySons(int index) {
        if (index > nodes.size()) {
            System.out.println("There is no such node.");
            return;
        }
        if (2 * index + 1 < nodes.size()) {
            System.out.println(nodes.get(index) + "'s left son has value: " + nodes.get(2 * index + 1));
        }else{
            System.out.println(nodes.get(index) + "don't have a left son.");
        }
        if (2 * index + 2 < nodes.size()) {
            System.out.println(nodes.get(index) + "'s right son has value: " + nodes.get(2 * index + 2));
        }else{
            System.out.println(nodes.get(index) + "don't have a right son.");
        }
    }

    public void add(int value){
        nodes.add(value);
        checkIsBigger(value, nodes.size()-1);
    }

    private void checkIsBigger(int value, int index){

        if (nodes.get((index - 1)/2) < value){
            int temp = nodes.get((index-1)/2);
            nodes.set((index-1)/2, value);
            nodes.set(index, temp);
            index = (index-1)/2;
            checkIsBigger(value, index);
        }
    }

    public void printBinaryHeap(){
        for (int i = 0; i < nodes.size()-1; i++){
            System.out.print(nodes.get(i) + ", ");
        }
        System.out.println();
    }


}
