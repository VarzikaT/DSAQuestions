package project;


public class SinglyLinkedlist {
	private ListNode head;
	 private static class ListNode{
	       private int data;
	       private ListNode next;
	       public ListNode(int data){
	           this.data = data;
	           this.next = null;
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
		
		public ListNode deleteFirst() {
			if(head==null) {
				return null;
			}
			ListNode temp=head;
			head = head.next;
			temp.next=null;
			return temp;
		}
		
		public ListNode deleteLast() {
			if(head==null || head.next==null) {
				return head;
			}
			ListNode current=head;
			ListNode previous=null;
			while(current.next!=null) {
				previous=current;
				current=current.next;
		}
			previous.next=null;
			return current;
		}
		
		
//	 public static void main(String[] args) {
//		 SinglyLinkedlist sll = new SinglyLinkedlist();
//		 sll.head = new ListNode(10);
//		 ListNode second = new ListNode(1);
//		 ListNode third = new ListNode(8);
//		 ListNode fourth = new ListNode(11);
//		 
//		 sll.head.next = second; //10->1
//		 second.next = third; //10->1->8
//		 third.next= fourth; //10->1->8->11->null
//		 
//		 sll.display();
//		 System.out.println(sll.length());
//		 
//	 }
//		public static void main(String[] args) {
//			SinglyLinkedlist sll = new SinglyLinkedlist();
//			sll.insertAtstart(11);
//			sll.insertAtstart(8);
//			sll.insertAtstart(1);
//			sll.display();
//		}
		public static void main(String[] args) {
			SinglyLinkedlist sll = new SinglyLinkedlist();
			sll.insertAtend(11);
			sll.insertAtend(8);
			sll.insertAtend(1);
			sll.display();
			
			SinglyLinkedlist sll1 = new SinglyLinkedlist();
			sll1.insertAtstart(11);
			System.out.println(sll1.deleteFirst().data);
			sll1.display();
			
			SinglyLinkedlist sll2 = new SinglyLinkedlist();
			sll2.insertAtstart(11);
			sll2.insertAtstart(19);
			System.out.println(sll2.deleteLast().data);
			sll1.display();
		}
}
