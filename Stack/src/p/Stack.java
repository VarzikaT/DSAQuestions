package p;

public class Stack {
	
	private ListNode top;
	private int length;
	
	private class ListNode{
		private int data; //can be a generic type
		private ListNode next; //Referrence to neext ListNode in list
		
		public ListNode(int data) {
			this.data= data;
			this.next = null;
		}
	}
}
