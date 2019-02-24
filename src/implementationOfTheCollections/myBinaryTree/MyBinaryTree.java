package implementationOfTheCollections.myBinaryTree;

import implementationOfTheCollections.myTree.Node;

public class MyBinaryTree {

    private BinaryNode ROOT;

    public void add(BinaryNode newNode) {
        if (ROOT == null) {

            ROOT = newNode;
            return;
        }
        chooseSide(newNode, ROOT);
    }

    private void chooseSide(BinaryNode newNode, BinaryNode currentNode) {
        int result = newNode.getValue().compareTo(currentNode.getValue());
        if (result < 0) {
            addToLeft(newNode, currentNode);
        } else {
            addToRight(newNode, currentNode);
        }
    }

    private void addToLeft(BinaryNode newNode, BinaryNode parentNode) {
        if (parentNode.hasLeftChild()) {
            chooseSide(newNode, parentNode.getLeft());
        } else {
            parentNode.setLeft(newNode);
            newNode.setParent(parentNode);
        }
    }

    private void addToRight(BinaryNode newNode, BinaryNode parentNode) {
        if (parentNode.hasRightChild()) {
            chooseSide(newNode, parentNode.getRight());
        } else {
            parentNode.setRight(newNode);
            newNode.setParent(parentNode);
        }
    }

    public void printTree() {
        if (ROOT == null) {
            System.out.println("Tree is empty");
            return;
        }
        printChildren(ROOT);
    }

    public void printChildren(BinaryNode node) {
        if (node == null) {
            return;
        }
        if (!node.hasLeftChild() && !node.hasRightChild()) {
            System.out.println(String.format("Node %s is a leaf.", node.getValue()));
        } else {
            if (node.hasLeftChild()) {
                System.out.println(String.format("Node %s has left node %s",
                        node.getValue(), node.getLeft().getValue()));
                printChildren(node.getLeft());
            }
            if (node.hasRightChild()) {
                System.out.println(String.format("Node %s has right node %s",
                        node.getValue(), node.getRight().getValue()));
                printChildren(node.getRight());
            }
        }
    }

    public void printAllAntecessor(BinaryNode node) {
        if (node == null) {
            return;
        }
        if (!node.hasParent()) {
            System.out.println("Very first antecessor: " + node.getValue());
        } else {
            printAllAntecessor(node.getParent());
            System.out.println("Antecessor's name: " + node.getValue());
        }
    }

    Integer level;

    public void search(String key) {

        level = -1;

        BinaryNode founded = search(key, ROOT);

        String msg = String.format("%s at level %d",
                (founded == null) ? "Not found" : "Found", level);

        System.out.println(msg);
        printChildren(founded);
        printAllAntecessor(founded);
    }

    public BinaryNode search(String key, BinaryNode node) {
        if (node == null) {
            return null;
        }
        int result = key.compareTo(node.getValue());
        if (result < 0) {
            node = search(key, node.getLeft());
        } else if (result > 0) {
            node = search(key, node.getRight());
        }
        ++level;
        return node;
    }

    public void preOrder_Aka_VLR() {
        preOrder(ROOT);
    }

    private void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + ", ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void inOrder_Aka_LVR() {
        inOrder(ROOT);
    }

    private void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        System.out.print(node.getValue() + ", ");
        inOrder(node.getRight());
    }

    public void postOrder_Aka_LRV() {
        postOrder(ROOT);
    }

    private void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getValue() + ", ");
    }

    public void findAllFromLevel(int level) {
        findAllFromLevel(level, ROOT);
    }

    public void findAllFromLevel(int level, BinaryNode node) {
        int count = 0;
        if (count < level) {
            node = node.getLeft();
            ++count;
        }
        System.out.println(node.getValue());

    }
}