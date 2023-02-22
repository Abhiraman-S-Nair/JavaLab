package LabExam;

import java.util.*;

public class DblyLnkdLst
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		DLL dlist=new DLL();
		System.out.println("Enter number of elements to be stored in doubly linked list");
		int x=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<x;i++)
		{
		int y=sc.nextInt();
		dlist.addNode(y);
		}
		dlist.display();
		System.out.println("\nEnter the element to be deleted:");
		int z=sc.nextInt();
		dlist.delete(z);
		System.out.println("\nCurrent List after Deletion:");
		dlist.display();
	}
}

class DLL
{
	class Node
	{
		public int data;
		public Node prev;
		public Node next;
		public Node(int data)
		{
			this.data=data;
		}
	}
	Node head,tail=null;
	
	public void addNode(int data)
	{
	Node newnode=new Node(data);
		if(head==null)
		{
			head=tail=newnode;
			head.prev=null;
			tail.next=null;
		}
		else
		{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
			tail.next=null;
		}
	}
	
	public void display()
	{
		Node current =head;
		if(head==null)
		{
			System.out.println("Doubly Linked List is empty\n");
			return;
		}
		System.out.println("The doubly linked list is as follows:\n");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	public void delete(int num)
	{
		Node temp;
		temp=head;
		if(temp==null)
		{
			System.out.println("Doubly Linked List is empty");
			return;
		}
		if(temp.data==num)
		{
			head=head.next;
			head.prev=null;
			System.out.println("Element "+temp.data+" has been deleted");
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
				if(temp.data==num)
				{
					if(temp.data!=tail.data)
					{
						System.out.println("Element "+temp.data+" has been deleted");
						temp.prev.next=temp.next;
						temp.next.prev=temp.prev;
						return;
					}
				}
			}
			temp=tail;
			if(temp.data==num)
			{
				System.out.println("Element "+temp.data+" has been deleted");
				tail=tail.prev;
				tail.next=null;
				return;
			}
			else
			{
				System.out.println("Element "+num+" does not exist in list");
			}
		}
	}
}