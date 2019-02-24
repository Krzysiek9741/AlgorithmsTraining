package implementationOfTheCollections.myLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        Element elem1 = new Element("1");
        Element elem2 = new Element("2");
        Element elem3 = new Element("3");
        Element elem4 = new Element("4");
        Element elem5 = new Element("5");
        Element elem6 = new Element("6");


        //myList.printList();
        myList.addElement(elem1);
        myList.addElement(elem2);
        myList.addElement(elem3);
        myList.addElement(elem4);
        myList.addElement(elem5);
        myList.addElement(elem6, 1);
        myList.printList();
    }
}
