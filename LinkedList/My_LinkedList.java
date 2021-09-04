package LinkedList;

public class My_LinkedList {

	Node head;
	
	void add(int data) {
		Node toAdd=new Node(data);
		if(head==null) {
			head=toAdd;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	static class Node {
		Node next;
		int data;
		public Node(int data) {
			this.data=data;
		}
	}
}
