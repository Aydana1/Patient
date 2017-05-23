
package patientdeque.impl;

/**
 * Generic doubly-linked nodes
 * @param <Patient>
 */
public class DoublyLinkedNode<Patient> {
    
    private Patient value;
    
    private DoublyLinkedNode<Patient> previous;
    private DoublyLinkedNode<Patient> next;

    /**
     * Construct a doubly-linked node with the given value, 
     * and null previous and next links
     * 
     * @param val to set on the node
     */
    
    public DoublyLinkedNode(Patient val) {
        value = val;
        previous = null;
        next = null;
    }

    /**
     * @return the value
     */
    public Patient getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Patient value) {
        this.value = value;
    }

    /**
     * @return the previous
     */
    public DoublyLinkedNode<Patient> getPrevious() {
        return previous;
    }

    /**
     * @param previous the previous to set
     */
    public void setPrevious(DoublyLinkedNode<Patient> previous) {
        this.previous = previous;
    }

    /**
     * @return the next
     */
    public DoublyLinkedNode<Patient> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(DoublyLinkedNode<Patient> next) {
        this.next = next;
    }
      
    /**
     * @return the string representation of the value 
     */
    @Override
    public String toString() {
        return value.toString();
    }
}
