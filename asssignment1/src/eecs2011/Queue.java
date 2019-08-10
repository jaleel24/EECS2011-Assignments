package eecs2011;

public interface Queue<E> { 
/** Returns the number of elements in the queue. */
public int size( );

/** Tests whether the queue is empty. */
public boolean isEmpty( );

/** Inserts an element at the rear of the queue. */
public void enqueue(E e);

 /** Returns, but does not remove, the first element of the queue (null if empty). The other name for this is peek */
public E first( );

/** Removes and returns the first element of the queue (null if empty). */
public E dequeue( );
 
}
