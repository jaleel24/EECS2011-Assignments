package eecs2011;
/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Summer 2019
 * Assignment 1
 * Student Name: Jaleel Sayal
 * Student cse account: jaleel24
 * Student ID number: 21580.......
 **********************************************************/
/********************** Explanation of the Lists using Linked List********************
 * in case of list ADT use of  linked list is better because of flexibility it cannot be corrupted easily
 * We do not have to worry about the size of the linked list like  arrays which are fixed size
 * in case of the linked list random access is not possible as In linked list you have to traverse each element (link) starting from the head and then you can access that element 
 * @avoid using array  only because of the fixed size 
 */


public class LArrayList<E> implements List <E> {
	private SingleNode<E> head;
	private SingleNode<E> tail;
	private int size;
/****************Creation of the link list *************
 *Time complexity is big O(1) 
 */	
	public SingleNode<E> creatingLArrayList(E nodeValue){
		head = new SingleNode<E>();
		SingleNode<E> node = new SingleNode<E>();
		node.setValue(nodeValue);
		node.setNext(null);
		head= node;
		tail = node;
		size=1;
		return head;
	}
	
	public SingleNode<E> getHead(){
		return head;
	}
	
	public void setHead(SingleNode<E> head) {
		this.head=head;
	}
	
	public SingleNode<E> getTail(){
		return tail;
	}
	
	public void setTail(SingleNode<E> tail){
		this.tail = tail;
	}
	public int getsize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	/** Returns the number of elements in this list */
	@Override
	public int size() {
		return size;
	}
	/** Returns whether the list is empty. 
	 * Time complexity is big O(1) 
	 */
	@Override
	public boolean isEmpty() {
	
		return head != null;
	}
	/******** Inserts an element e to be at index I, shifting all elements after this.*********
	 * Time complexity is big O(n) 
	 */
	@Override
	public void add(int location, E nodeValue) throws IndexOutOfBoundsException {
		SingleNode<E> node = new SingleNode<E>();
		node.setValue(nodeValue);
		if(!isEmpty()) {
			System.out.println("The Linklist does not exist :");
		}
		else if(location==0) { // insert at first position
			node.setNext(head);
			head=node;
		}
		else if(location >=size) { // insert at last position
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		}
		else { // at he specific location
			SingleNode<E> tempNode = head;
			int index = 0;
			while (index < location - 1) {// loop till we reach specified node
				tempNode = (SingleNode<E>) tempNode.getNext();
				index++;
			}//tempNode currently references to node after which we should insert new node
			SingleNode<E> nextNode = (SingleNode<E>) tempNode.getNext(); //this is the immediate next node after new node
			tempNode.setNext(node);//update reference of tempNode to reference to new node
			node.setNext(nextNode);//update newly added nodes' next.
		}
		setSize(getsize()+1);
		
	}
	/******Traverses Linked List **********
	 * Time complexity is big O(n) 
	 */
		void traverseLinkedList() {
			if (isEmpty()) {
				SingleNode<E> tempNode = head;
				for (int i = 0; i < getsize(); i++) {
					System.out.print(tempNode.getValue());
					if (i != getsize() - 1) {
						System.out.print(" -> ");
					}
					tempNode = (SingleNode<E>) tempNode.getNext();
				}
			}else {
				System.out.println("Linked List does not exists !");
			}
			System.out.println("\n");
		}

	/*
	 * @Override public void add(E e) throws IndexOutOfBoundsException { // TODO
	 * Auto-generated method stub }
	 */
	/** Returns the element at index I, without removing it. */
	@Override
	public E get(int nodeValue) throws IndexOutOfBoundsException {
		//Searches a node with given value
			if (isEmpty()) {
				SingleNode<E> tempNode = head;
				for (int i = 0; i < getsize(); i++) {
					if ((int)tempNode.getValue() == nodeValue) {
						System.out.print("Found the node at location: "+i+"\n");
						//return i;
					}
					tempNode = (SingleNode<E>) tempNode.getNext();
				}
			}
			
		return null;
	}
	/** Removes and returns the element at index I, shifting the elements after this. *****
	 * Time complexity is big O(n) 
	 */
	@Override
	public E remove(int location) throws IndexOutOfBoundsException {
		//Deletes a node having a given value
		
			if (!isEmpty()) {
				System.out.println("The linked list does not exist!!");// Linked List does not exists
				
			} else if (location == 0) { // we want to delete first element
				head = (SingleNode<E>) head.getNext();
				setSize(getsize()-1);
				if(getsize() == 0) { // if there are no more nodes in this list
					tail = null;
				}	
			}else if (location == getsize()){ //If location is not in range or equal, then delete last node
				SingleNode<E> tempNode = head;
				for (int i = 0; i < size - 1; i++) {
					tempNode = tempNode.getNext(); //temp node points to 2nd last node
				}
				
				if (tempNode == head) { //if this is the only element in the list
					tail = head = null;
					setSize(getsize()-1);
					//return;
				}
				tempNode.setNext(null); 
				tail= tempNode;
				setSize(getsize()-1);
				
			}
			else if(location>size) {
				System.out.println("Index out of bound error");
			}
			else { //if any inside node is to be deleted
				SingleNode<E> tempNode = head;
				for (int i = 0; i < location - 1; i++) {
					tempNode = tempNode.getNext(); // we need to traverse till we find the location
				}	
				tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
				setSize(getsize()-1);
			}//end of else	
			
		return null;
	}
	/** Replaces the element at index I with e, returning the previous element at i.
	 * Time complexity is big O(n) as we are removing it and then adding it so overall it should be big O(n)
	 */
	@Override
	public E set(int I, E e) throws IndexOutOfBoundsException {
			remove(I);
			add(I,e);
		return null;
	}

}
