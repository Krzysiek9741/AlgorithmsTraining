package implementationOfTheCollections.myBinaryTree;

public class MyBinaryTreeTest {

    public static void main(String[] args) {
        MyBinaryTree bt = new MyBinaryTree();

        bt.printTree();
        System.out.println("------------------------------");
        bt.add(new BinaryNode("H"));
        bt.printTree();

        System.out.println("------------------------------");
        bt.add(new BinaryNode("L"));
        bt.printTree();

        System.out.println("------------------------------");
        bt.add(new BinaryNode("D"));
        bt.printTree();

        System.out.println("------------------------------");
        bt.add(new BinaryNode("E"));
        bt.printTree();

        System.out.println("------------------------------");
        System.out.println("----------ANTECESSORS---------");
        bt.add(new BinaryNode("Z"));
        bt.add(new BinaryNode("A"));
        bt.add(new BinaryNode("J"));

        BinaryNode theYoungest = new BinaryNode("B");
        bt.add(theYoungest);

        bt.printAllAntecessor(theYoungest);

        System.out.println("---------SEARCH FOR 'L'--------");
        bt.search("L");

        System.out.println("--------- PreOrder VLR ----------");
        bt.preOrder_Aka_VLR();
        System.out.println("\n---------------------------------");

        System.out.println("---------- InOrder LVR ----------");
        bt.inOrder_Aka_LVR();
        System.out.println("\n---------------------------------");

        System.out.println("--------- PostOrder LRV ---------");
        bt.postOrder_Aka_LRV();
        System.out.println("\n---------------------------------");

        bt.findAllFromLevel(0);
        System.out.println("\n---------------------------------");
    }
}
