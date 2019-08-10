package eecs2011;
/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Summer 2019
 * Assignment 2
 * Student Name: Jaleel Sayal && Stephen
 * Student cse account: jaleel24
 * Student ID number: 21580.......
 **********************************************************/

public class LinkedPoitionalListMain {

		public static void main(String[] args) {
			
			NodePositionalList<String> list1 = new NodePositionalList<String>();
			list1.addFirst("jaleel");
			list1.addLast("saram");
			list1.traverseLinkedList();
			System.out.println(list1.size());
			list1.addLast("ali");
			list1.traverseLinkedList();
			System.out.println(list1.size());
			list1.addFirst("j");
			list1.traverseLinkedList();
			System.out.println(list1.size());
			System.out.println(list1.isEmpty());
			Position p1 = list1.addFirst("jaleel");
			
			list1.addAfter(p1, "anna");
			System.out.println(list1.toString());
			list1.traverseLinkedList();
			for(String n:list1) {
				
			}
			
		}

}



