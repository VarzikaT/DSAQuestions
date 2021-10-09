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
	 public int length() {
		 if(head==null)
			 return 0;
		 int count=0;
		 ListNode current = head;
		while(current!=null) {
			count++;
			current=current.next;
			
		 }
		return count;
	 }
	 public void insertAtstart(int value) {
			ListNode newNode = new ListNode(value);
			newNode.next = head;
			head = newNode;
		}
	 public void insertAtend(int value) {
			ListNode newNode = new ListNode(value);
			if(head==null) {
				head=newNode;
				return;
				}
			ListNode current = head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
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
		 System.out.println(sll.length());
		 SinglyLinkedlist sll1 = new SinglyLinkedlist();
			sll1.insertAtstart(12);
			sll1.insertAtstart(80);
			sll1.insertAtstart(10);
			sll1.display();
			
			 SinglyLinkedlist sll2 = new SinglyLinkedlist();
				sll2.insertAtstart(12);
				sll2.insertAtstart(80);
				sll2.insertAtstart(10);
				sll2.display();
		 
		 
	 }

		
}
