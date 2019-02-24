package implementationOfTheCollections.myHeap;

/**
 *
 * @author Kamil Szestowicki
 */
public interface SdaHeap {

    void push(String value);

    String pop();
    
    boolean isEmpty();
    
    int count();

}
