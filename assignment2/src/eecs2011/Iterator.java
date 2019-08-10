package eecs2011;

public interface Iterator<E> {
	
	// Checks if the next element exists 
    public boolean hasNext(); 
      
    // moves the cursor/iterator to next element 
    public E next() ;
      
    // Used to remove an element. Implement only if needed 
    public void remove(); 
        // Default throws UnsupportedOperationException. 
   

}
