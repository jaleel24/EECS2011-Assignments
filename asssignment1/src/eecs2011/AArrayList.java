package eecs2011;
import java.util.Arrays;
/********************** Explanation of the Lists using Arrays********************
 * Random access is the advantage if we use arrays which is not possible in case of the  linked list 
 * We have to worry about the fixed size of the array because every time size is full we have to make a bigger backing array to add list members.
 * @avoid using array  only because of the fixed size 
 */
/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Summer 2019
 * Assignment 1
 * Student Name: Jaleel Sayal
 * Student cse account: jaleel24
 * Student ID number: 21580.......
 **********************************************************/

public class AArrayList<E> implements List<E> {
	private int size = 0;
	/******Default capacity of the array will be assigned 10 which will be later incremented********/
	private static final int DEFAULT_CAPACITY = 10;
	/*****array of objects******/
	private Object elements[];
	/******Constructor of the AArray every time the instance is made the array list  will be initialized and the  default size would be the 10*******/
	public AArrayList() {
		elements = new Object[DEFAULT_CAPACITY];
	}
	/**********Below mentioned function will add the value or insert the value at the given index*********
	 * will through an error if we want to insert something at the wrong index 
	 * In case of array we insertion at a given index is a constant time operation so the time complexity will be big O(1)
	 */
		@Override
	public void add(int I, E e) throws IndexOutOfBoundsException {
	try{
		if(size == elements.length) {
			ensureCapacity();
			 for (int k=size-1; k>=I; k--) { // start by shifting rightmost
				 System.out.println("size"+k);
				 elements[k+1] = elements[k];
				 elements[I]= e;
				 size++; }
				 
				}
				elements[I]= e;
				size++;
				System.out.println("successfully inserted value");
	}
	catch (ArrayIndexOutOfBoundsException m) {
		System.out.println("Invalid index to access array");
	}	
	}
	/******This Method helps increase the size of the backing array so that we can enter the value in the list it actually double the size 
	 */	
	public void ensureCapacity() {
		System.out.println("reached");
		int newSize = elements.length*2;
		elements =Arrays.copyOf(elements, newSize);
	}
	/*
	 * @Override public void add(E e) throws IndexOutOfBoundsException{ if (size ==
	 * elements.length) { ensureCapacity(); } elements[size++] = e;
	 * System.out.println("successfully inserted value"+size); }
	 */
	/******* This Method get the value from the list according to the given index and throw an exception of indexOutofBound if we enter the wrong index
	 * Time complexity will be big O(1)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public E get(int i) throws IndexOutOfBoundsException {
		try {
			return (E) elements[i];
		}
		catch (ArrayIndexOutOfBoundsException m) {
			System.out.println("Invalid index to access array");
		}
		return (E) elements[i];
	}
	/************* As it is clear from the signature of the method it removes the element from the given index by shifting the other elements from left to right********* 
	 * or  from bottom to top if we consider the array as stack
	 * Time complexity will be big O(n) as we are using loop for the size and one for shifting so its not constant time operation
	 */
	@SuppressWarnings("unchecked")
	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		for(int k=0; k<elements.length-1; k++) {
			if(k==i) {
				for(int j=i;j<elements.length-1;j++) {
					elements[j]=elements[j+1];
				}
			}
			
		}
		return (E) elements;
	}
	/********Replaces the element at index I with e, returning the previous element at i.**********
	 * Its a constant time operation so its big o will be big O(1) 
	 */
	@Override
	public E set(int I, Object e) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
			checkIndex(I,size);
			@SuppressWarnings("unchecked")
			E temp = (E) elements[I];
			//System.out.println(temp);
			elements[I] = e;
			return (E) temp;
	}
	/*
	 * Returns the number of elements in this list
	 * its constant time operation as we are just assigning the length of the array in variable size so it has big O(1)  
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		int size = elements.length;
		return size;
	}
	/******** Returns whether the list is empty********** 
	 * Time complexity is big O(1)
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size==0) {
		return true;
	}
		return false;
	}
	
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException { 
		if (i < 0 || i >= n) 
		{
			throw new IndexOutOfBoundsException("Illegal index: " + i);
		}
}
}
