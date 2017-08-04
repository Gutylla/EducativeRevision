/**
 * 
 */
package linkedList;


/**
 * @author TriptiAshishUpadhyay
 *
 */
public class ReverseSinglyLinkedList {

	public void reverse(Node head){
		Node listToDo = head.next;
		Node reversed = head;
		reversed.next = null;
		while(listToDo != null){
			Node temp = listToDo;
			listToDo = listToDo.next;
			temp.next = reversed;
			reversed = temp;
		}
		
		System.out.println("done");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = null;
		
		ReverseSinglyLinkedList obj = new ReverseSinglyLinkedList();
		obj.reverse(head);
	}

}

class Node{
	Node next;
	int data;
	
	/**
	 * 
	 */
	public Node(int d) {
		// TODO Auto-generated constructor stub
		next = null;
		data = d;
	}
}
