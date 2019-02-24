package implementationOfTheCollections.myBinaryTree;

public class BinaryNode {
    private String value;
    private BinaryNode parent;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode (String value){
        this.value = value;
    }


    public BinaryNode getParent() {
        return parent;
    }

    public void setParent(BinaryNode parent) {
        this.parent = parent;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public boolean hasLeftChild(){
        return left != null;
    }

    public boolean hasRightChild(){
        return right != null;
    }

    public boolean hasParent(){
        return parent != null;
    }
}
