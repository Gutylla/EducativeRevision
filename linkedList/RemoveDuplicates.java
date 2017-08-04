/**
 * 
 */
package linkedList;

import java.util.HashSet;

/**
 * @author TriptiAshishUpadhyay
 *
 */
public class RemoveDuplicates {

	public void remove(Node head){
		Node prev = null;
		Node current = head;
		HashSet<Integer> hash = new HashSet<>();
		while(current != null){
			if(!hash.contains(current.data)){
				hash.add(current.data);
				prev = current;
			}
			current = current.next;
		}
		System.out.println("done");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(1);
		head.next.next = new Node(3);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(3);
		head.next.next.next.next.next = null;
		
		RemoveDuplicates obj = new RemoveDuplicates();
		obj.remove(head);
	}

}
