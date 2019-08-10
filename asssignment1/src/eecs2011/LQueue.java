package eecs2011;
/********************** Explanation of the queue using linked list********************
 * overall the big o is O(1) and the space complexity is also O(1)
 * in case of queue linked list is better because of flexibility it cannot be corrupted easily as it follows the FIFO principal
 * We do not have to worry about the size of the linked list like in queue implementation using arrays which are fixed size 
 * a linked list uses more space per element than a properly sized array of references.
 * In practice, this makes the linked-list method more expensive than the array-based method.
 * @avoid using queue also because we cannot randomly access data
 */

public class LQueue<E> implements Queue<E> {
	/**here we are using a linked list which we have made before for implementing the interface of the List.*/
	LArrayList<E> list;
	/* LQueue is a constructor which is initializing the queue*/
	public LQueue(){
		list = new LArrayList<E>();
	}
	/************ Returns the number of elements in the queue.************
	 * Its a constant time operation in case of link list so its time complexity will be big O(1) 
	 */
	@Override
	public int size() {
		return list.getsize();
	}
	/** Tests whether the queue is empty. */
	@Override
	public boolean isEmpty() {
		if(list.getHead()== null) {
			return true;
		}
		return false;
	}
	/************  Inserts an element at the rear of the queue************
	 * Its a constant time operation in case of link list so its time complexity will be big O(1) 
	 */
	@Override
	public void enqueue(E e) {
		if(list.getHead() == null) {
			list.creatingLArrayList(e);
		}
		else {
			list.add(list.getsize(),e);
		}
		
	}
	/************  Returns, but does not remove, the first element of the queue (null if empty). The other name for this is peek************
	 * Its a constant time operation in case of link list so its time complexity will be big O(1) as we are just peeking the first element 
	 */
	@Override
	public E first() {
		if(!isEmpty()) {
			return list.getHead().getValue();
		}
		else {
			System.out.println("The queue is empty");
			return null;
		}
	}
	/************ Removes and returns the first element of the queue (null if empty). ***********
	 * Its a constant time operation in case of link list so its time complexity will be big O(1) 
	 */
	@Override
	public E dequeue() {
		E value = null;
		if(isEmpty()) {
			System.out.println(" Queue overflow error!");
		}
		else {
			value=  list.getHead().getValue();
			list.remove(0);
		}
		return value;
		
	}

}
