package implementationOfTheCollections.myLinkedList;

public class SinglyLinkedList {

    private Element head = null;

    public SinglyLinkedList() {
    }

    public void addElement(Element element) {

        if (head == null) {
            head = element;
            return;
        }
        Element lastOne = getLastOneOnList();

        lastOne.setNext(element);
    }

    public void addElement(Element element, int index) {
        if (head == null) {
            head = element;
            return;
        }
        if (index == 1 ){
            element.setNext(head);
            head = element;
            return;
        }else {
            Element previousOne = getElementWithThePreviousIndex(index);
            Element nextOne = getElementWithIndex(index);

            previousOne.setNext(element);
            element.setNext(nextOne);
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Element elem = head;

        while (elem != null) {
            System.out.println(elem.getValue());
            elem = elem.getNext();
        }

    }

    private Element getLastOneOnList() {
        Element elem = head;

        while (elem.hasNext()) {
            elem = elem.getNext();
        }

        return elem;
    }

    private Element getElementWithThePreviousIndex(int index) {
        Element elem = head;
        int count = 2;
        while (count <= index) {
            elem = elem.getNext();
            count++;
        }
        return elem;
    }
    private Element getElementWithIndex(int index) {
        Element elem = head;
        int count = 2;
        while (count <= index+1) {
            elem = elem.getNext();
            count++;
        }
        return elem;
    }


}
