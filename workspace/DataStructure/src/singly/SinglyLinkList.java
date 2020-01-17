package singly;

public class SinglyLinkList 
{

	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public void pushfront(int data)
	{
		Node newnode=new Node(data);
	
		newnode.next=head;
		head=newnode;
	}
	
	public void pushMiddle(Node prevnode,int data)
	{
		if(prevnode ==  null)
		{
			System.out.println("prev is null");
			return ;
		}
		
		Node newnode=new Node(data);
		
		newnode.next=prevnode.next;
		prevnode.next=newnode;
	}
	public void pushEnd(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return ;
		}
		newnode.next=null;
		Node last=head;
		while(last.next!=null)
			last=last.next;
		
		last.next=newnode;
		return;
			
	}
	
	public void print()
	{
		Node t=head;
		while(t!= null)
		{
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.println();
	}
	
	 
	
}
