
package patientdeque.adt;

import patientdeque.impl.Patient;

/**
 *
 * A generic double-ended queue
 */
public interface PatientDequeInterface {
    
    /**
     * Adds an element to the front of the deque.
     * 
     * @param value element to be added
     */
    public void pushToFront(Patient value);
    
    /**
     * Adds an element to the end of the deque.
     * 
     * @param value element to be added
     */
    public void pushToBack(Patient value);
    
    /**
     * Removes and returns the front most element of the deque
     * 
     * @return the front most element of the deque
     * @throws Exception if the deque is empty
     */
    public Patient popFromFront() throws Exception;
    
    /**
     * Removes and returns the last element of the deque
     * 
     * @return the last element of the deque
     * @throws Exception if the deque is empty
     */
    public Patient popFromBack() throws Exception;
    
    /**
     * @return the size of the deque
     */
    public int getSize();
    
    /**
     * Removes all elements from the deque
     */
    public void clear();
    
    /**
     * @return a String representation of the deque
     */
    @Override
    public String toString();
}
