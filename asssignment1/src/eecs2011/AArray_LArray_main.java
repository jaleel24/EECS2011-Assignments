package eecs2011;

public class AArray_LArray_main {

	public static void main(String[] args) {
		
		AArrayList<String> list1 = new AArrayList<String>();
		
		  list1.add(0, "jaleel"); 
		  list1.add(1, "neel"); 
		  list1.add(2, "keel");
		  list1.add(3, "jalal"); 
		  list1.add(4, "maleel"); list1.add(5, "raleel");
		  list1.add(6,"ali");
		  list1.add(7,"usama"); list1.add(8,"andy");
		  list1.add(9,"AMda"); 
		  list1.add(10,"AMaaa");
		  list1.add(11,"AManda");
		  list1.remove(11);
		  for(int j=0;j<list1.size();j++) {
		  System.out.println(" Before value j="+j+ "=>"+list1.get(j)); 
		  }
		  	System.out.println("--------------\n--------------");
		  
		  LArrayList<String> list3 = new LArrayList<String>();
		  list3.creatingLArrayList("jaleel");
		  list3.add(1, "saram");
		  list3.traverseLinkedList();
		  
		  list3.add(2, "hira");
		  list3.add(3, "sanan");
		  LArrayList<Integer> list4 = new LArrayList<Integer>();
		  list4.creatingLArrayList(5);
		  list4.add(0, 2);
		  list4.add(2, 10);
		  list4.traverseLinkedList();
		  System.out.println("Size:"+list4.getsize());
		  list4.get(5);
		  System.out.println("Before");
		  list4.traverseLinkedList();
		  list4.add(0,6);
		  System.out.println("After");
		  list4.traverseLinkedList();
		  list4.set(0, 88);
		  System.out.println(" 2After");
		  list4.traverseLinkedList();
		  
		  System.out.println("*************** Queues Tests *****************");
		  AQueue<Integer> q1 = new AQueue<Integer>(15);
		  System.out.println(q1.isEmpty());
		  	q1.enqueue(5);
		  	q1.enqueue(2);
		  	q1.enqueue(3);
		  	q1.enqueue(9);
		  	q1.enqueue(78);
		  	q1.enqueue(66);
		  	q1.enqueue(20);
		  	q1.enqueue(615);
		  	q1.enqueue(165);
		  	q1.enqueue(5);
		  	//q1.enqueue(655);
		  	//q1.enqueue(65);
		  	
		  	 System.out.println(q1.isEmpty());
		  	 q1.printQueue();
		  	System.out.println(" Queue is Full:"+q1.isQueueFull());
		  	System.out.println("******Peek Function Test*****");
		  	System.out.println(q1.first());
		  	System.out.println("\nsize of the queue:"+q1.size());
		  	
		  	System.out.println("**********Dequeuing*********");
		  	System.out.println(q1.dequeue());
		  	System.out.println("\nsize of the queue:"+q1.size());
		  	q1.printQueue();
		  	System.out.println("\nsize of the queue afterre dequing whole array:"+q1.size());
		  	q1.printQueue();
		  	
		  	System.out.println("*******String queue*********");
		  	AQueue<String> q2 = new AQueue<String>(15);
		  	
		  	System.out.println(" In the start size of the queue we just created it \n size:"+q2.size());
			  	q2.enqueue("jaleel");
			  	q2.enqueue("Sayal");
			  	q2.enqueue("adeel");  	
		  	System.out.println(" After adding data the size of the queue:"+q2.size());
		  		q2.printQueue();
		  	System.out.println("First deque:"+ q2.dequeue());
		  	System.out.println("Now After First deque size of the queue:"+q2.size());
			  	q2.printQueue();
			  	q2.enqueue("hadi");
			  	q2.printQueue();
			System.out.println("Now After second deque size of the queue:"+q2.size());
		  	System.out.println("peek First:"+q2.first());
			System.out.println("size of the queue:"+q2.size());
		  	System.out.println("Now After 3rd deque"+q2.dequeue());
		  	System.out.println("L:"+q2.first());
		  	System.out.println(q2.dequeue());
		  	System.out.println("L:"+q2.first());
		  	System.out.println(q2.dequeue());
		  	System.out.println(" Finally size of the queue:"+q2.size());
		  	
		  	System.out.println("***************************Queue by Linkedlist***********************");

		  	LQueue<String> q = new LQueue<String>();
		  	q.enqueue("jaleel");
		  	q.enqueue("sayal");
		  	q.enqueue("anna");
		  	q.enqueue("khan");
		  	System.out.println("peek:"+ q.first());
		  	System.out.println("Size:"+ q.size());
		  	System.out.println("Deque value:"+ q.dequeue());
		  	System.out.println("Size:"+ q.size());
		  	
		  	System.out.println("Deque value:"+ q.dequeue());
		  	System.out.println("Size:"+ q.size());
		  	
		  	System.out.println("Deque value:"+ q.dequeue());
		  	System.out.println("Size:"+ q.size());
		  	
		  	System.out.println("Deque value:"+ q.dequeue());
		  	System.out.println("Size:"+ q.size());
		  	System.out.println("Deque value:"+ q.dequeue());
		  	System.out.println("Size:"+ q.size());
		  	q.enqueue("Aliya khan");
		  	q.enqueue("Aliya jaleel");
		  	System.out.println("Deque value:"+ q.dequeue());
		  	System.out.println("Size:"+ q.size());
		  	
		  	
}		  	

	
}
