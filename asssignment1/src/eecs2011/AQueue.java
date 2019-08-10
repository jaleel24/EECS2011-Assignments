package eecs2011;
/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Summer 2019
 * Assignment 1
 * Student Name: Jaleel Sayal
 * Student cse account: jaleel24
 * Student ID number: 21580.......
 **********************************************************/
/********************** Explanation of the queue using Arrays********************
 * overall the big o is O(1) and the space complexity is  O(n) because creation of the queue requires blank array 
 * in case of queue linked list is better because of flexibility it cannot be corrupted easily as it follows the FIFO principal
 * We do not have to worry about the size of the linked list like in queue implementation using arrays which are fixed size 
 * @avoid using array  only because of the fixed size 
 */


public class AQueue<E> implements Queue<E> {
	
	private Object arr[];
	private int topOfQueue;
	private int begginingOfQueue;
	/***********Constructor of the class**************
	 * creation of the queue with an empty array of size n will give you space complexity big O(n)
	 * Time complexity will be big O(1)
	 */
	public AQueue(int size) {
	this.arr = new Object[size];
	this.begginingOfQueue =-1;
	this.topOfQueue = -1;
	System.out.println("Successfully created the queue :)");
	}
	/*********** Returns the number of elements in the queue.*************
	 * Time complexity big O(n) as it there is a loop which will go through every single element till end to check the size. 
	 */
	@Override
	public int size() {
		int count =0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=null) {
				count++;
			}
		}
		return count;
	}
	/************ Tests whether the queue is empty ****************
	 * Time complexity will be big O(1) as we are checking the start and end of the queue values
	 */
	@Override
	public boolean isEmpty(){
		if ((begginingOfQueue ==-1) ||(topOfQueue ==-1)){
			return true;
		}
		else {
			return false;
		}
		
	}
	/************ Inserts an element at the rear of the queue*************
	 * As the element will always be inserted at the end of the queue and in the algorithm topOfQueue is pointing to the last box of the array which 
	 * has element so the time complexity will be big O(1) 
	 */
	@Override
	public void enqueue(E e) {
		if(isQueueFull()){
			System.out.println("Queue overflow error");
		}
		else if(isEmpty()) { //if the queue is empty then we need to initialize the begginningOfQueue 
			begginingOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue]=e;
		}
		else{//if the queue already has something then there is not need to initialize the begginningOfQueue 
			topOfQueue++;
			arr[topOfQueue]=e;
		}
		//printQueue();
	}
	/* Printing the Queue :)*/
	public void printQueue() {
		if(!isEmpty()) {
			System.out.println("Queue now ...");
			for(int i=begginingOfQueue; i<=topOfQueue; i++) {
				System.out.println(arr[i] + "   ");
			}
			System.out.println();
		}else {
			System.out.println("Queue is empty !");
		}
	}
	public boolean isQueueFull() {
		if(topOfQueue == arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	/************ Returns, but does not remove, the first element of the queue (null if empty). The other name for this is peek***********
	 *Time complexity will be big O(1) as we will peek first element which is a constant time operation 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public E first() {
		if(!isEmpty()) {
			return (E) arr[begginingOfQueue];
		}
		return null;
	}
	/************* Removes and returns the first element of the queue (null if empty) **************
	 *Time complexity will be big O(1) as first element will always remove which is a constant time operation 
	 */
	@Override
	public E dequeue() {
		if(isEmpty()) {
			return null;
		}
		@SuppressWarnings("unchecked")
		E answer = (E) arr[begginingOfQueue];
		arr[begginingOfQueue]=null;
		begginingOfQueue =(begginingOfQueue+1)%arr.length;
		topOfQueue--;
		return answer;
		
	}

}
