package singly;

public class SinglyLL {

	 class Node
	 {
		 int data;
		 Node next;
		 Node(int data)
		 {
			 this.data=data;
			 next=null;
		 }
	 }
	 
	 Node head;
	 
	 public void pushFront(int d)
	 {
		 Node newnode=new Node(d);
		 if(head==null)
			 head=newnode;
		 else
		 {
			 newnode.next=head;
			 head=newnode;
		 }
	 }
	 
	 public void display()
	 {
		 while(head!=null)
		 {
			 System.out.println(head.data);
			 head=head.next;
		 }
	 }
	 
	 public static void main(String[] args) 
	 {
		SinglyLL sll=new SinglyLL();
		sll.pushFront(10);
		sll.pushFront(20);
		sll.pushFront(150);
		sll.display();
		
	}
}
