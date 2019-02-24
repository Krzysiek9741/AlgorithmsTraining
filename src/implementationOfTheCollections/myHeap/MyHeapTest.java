package implementationOfTheCollections.myHeap;

public class MyHeapTest {
    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap();

        myHeap.push("ABC");
        myHeap.push("DEF");
        myHeap.push("GHI");
        myHeap.push("JKL");
        myHeap.push("MNO");

        myHeap.printList();
        /*System.out.println(myHeap.pop());
        System.out.println(myHeap.pop());
        System.out.println(myHeap.pop());
        System.out.println(myHeap.pop());
        System.out.println(myHeap.pop());*/
    }
}
