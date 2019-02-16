package implementationOfTheCollections;

public class Element {

    private Element next;
    private String value;

    public Element(String value) {
        this.value = value;
        this.next = null;
    }
    public Element() {
        value = "Not define";
        next = null;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean hasNext(){
        return next != null;
    }
}
