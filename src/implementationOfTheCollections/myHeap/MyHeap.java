package implementationOfTheCollections.myHeap;

import implementationOfTheCollections.myLinkedList.Element;
import implementationOfTheCollections.myLinkedList.SinglyLinkedList;

public class MyHeap extends SinglyLinkedList implements SdaHeap {
    private Element head = null;

    public MyHeap() {
    }

    @Override
    public void push(String value) {
        Element element = new Element(value);
        addElement(element, 1);
    }

    @Override
    public String pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }
}
