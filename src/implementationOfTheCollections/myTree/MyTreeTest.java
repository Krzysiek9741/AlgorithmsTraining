package implementationOfTheCollections.myTree;

public class MyTreeTest {
    public static void main(String[] args) {

        Node node1 = new Node("ABC");
        Node node2 = new Node("DEF");
        Node node3 = new Node("GHI");

        MyTree myTree = new MyTree();

        myTree.addNode(node1);
        myTree.addNode(node2, node1);
        myTree.addNode(node3, node2);

        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);
    }
}
