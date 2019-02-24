package implementationOfTheCollections.myTree;

import java.util.ArrayList;

public class MyTree {

    public MyTree() {
    }

    public void addNode(Node node) {

    }

    public void addNode(Node node, Node parent) {

        node.setParent(parent);
        parent.addChild(node);
    }


}
