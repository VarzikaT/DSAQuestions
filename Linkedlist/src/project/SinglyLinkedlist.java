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
	 
	 public void ins(int position, int value) {
			ListNode node = new ListNode(value);
			if(position==1) {
			node.next=head;
			head=node;
		}
			else {
				ListNode previous = head;
				int count =1;
				while(count<position-1){
					previous=previous.next;
					count++;
				}
				ListNode current = previous.next;
				previous.next=node;
				node.next=current;
			}		
			}
	 public void delete(int p,int v) {
		 ListNode node = new ListNode(v);
		 if(p==1) {
			 head=head.next;
		 }
		 else {
			 ListNode previous = head;
			 int count =1;
			 while(count<p-1) {
				 previous=previous.next;
				 count++;
				 
			 }
			 ListNode current = previous.next;
			 previous.next=current.next;
		 }
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

	 //how to find the middle node in a singly linked list
	 public ListNode mid() {
		 ListNode slowptr = head;
		 ListNode fastptr = head;
		 while(fastptr != null && fastptr.next!=null) {
			 slowptr = slowptr.next;
			 fastptr=fastptr.next.next;
		 }
		 return slowptr;
	 }
	 //how to find nth node from end
	 public ListNode getnthnnodefromend(int n)
	 {
		 if(head==null)
		 {
			 return null;
		}
		 if(n<=0) {
			 throw new IllegalArgumentException("Invalid value:n="+n);
		 }
		 ListNode mainptr= head;
		 ListNode refptr = head;
		 int count = 0;
		 while(count<0) {
			 if(refptr == null) {
				 throw new IllegalArgumentException(n+"is greater than the number of nodes in list");
			 }
			 refptr = refptr.next;
			 count++;
		 }
		 while(refptr!=null) {
			 refptr=refptr.next;
			 mainptr=mainptr.next;
		 }
		 return mainptr;
	 }
	//program to delete duplicate elements from a sorted linkedlist in java
	 public void removeduplicates() {
			if(head==null) {
				return;
			}
			ListNode current =head;
			while(current!= null && current.next!=null) {
				if(current.data == current.next.data) {
					current.next = current.next.next;
				}
				else {
					current= current.next;
				}
			}
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
//		 System.out.println(sll.length());
		 SinglyLinkedlist sll1 = new SinglyLinkedlist();
//			sll1.insertAtstart(12);
//			sll1.insertAtstart(80);
//			sll1.insertAtstart(10);
//			sll1.display();
			
			 SinglyLinkedlist sll2 = new SinglyLinkedlist();
				sll2.insertAtstart(12);
				sll2.insertAtstart(80);
				sll2.insertAtstart(10);
				sll2.insertAtstart(10);
				sll2.display();
				sll2.removeduplicates();
				sll2.display();
//		 
//				sll2.ins(1,3);
//				sll2.ins(2,5);
//				sll2.display();
//				
//				sll2.delete(2,5);
//				sll2.display();
	 }

		
}
