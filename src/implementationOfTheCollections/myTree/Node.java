package implementationOfTheCollections.myTree;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Node {

    private String value;
    private Node parent;
    private ArrayList<Node> children = new ArrayList<>();

    public Node(String value) {
        this.value = value;
    }

    public Node(String value, Node parent) {
        this.value = value;
        this.parent = parent;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
        parent.addChild(this);
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public void addChild(Node child){
        this.children.add(child);
    }

    @Override
    public String toString() {
        return "Value of node: " + value + '\'' +
                ", parent=" + parent.getValue() +
                ", children=" + getChilds();
    }

    private String getChilds(){

        return children.stream().map(n -> n.getValue()+", ").collect(Collectors.toList()).toString();
    }
}
