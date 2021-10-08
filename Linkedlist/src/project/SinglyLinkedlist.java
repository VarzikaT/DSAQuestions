package project;


public class SinglyLinkedlist {
	private ListNode head;
	 private static class ListNode{
	       private int data;
	       private ListNode next;
	       public ListNode(int data){
	           this.data = data;
	           this.next =null;
	       }
	    }
	 public void display() {
		 ListNode current = head;
		 while(current!=null) {
			 System.out.print(current.data + "->");
			 current=current.next;
		 }
		 System.out.print("null");
	 }
		
	 public static void main(String[] args) {
		 SinglyLinkedlist sll = new SinglyLinkedlist();
		 sll.head = new ListNode(10);
		 ListNode second = new ListNode(1);
		 ListNode third = new ListNode(8);
		 ListNode fourth = new ListNode(11);
		 
		 sll.head.next = second; //10->1
		 second.next = third; //10->1->8
		 third.next= fourth; //10->1->8->11->null	
		 sll.display();
		 
	 }

		
}
