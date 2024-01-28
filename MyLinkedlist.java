package linkedlist;

class Node{
	int data;
	Node next;
	Node(int a){
		this.data=a;
		this.next=null;
	}
}
public class MyLinkedlist{
	Node head=null;
	public void addlast(int x) {
		Node newnode=new Node(x);
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			
		}		
	}
	public void addfirst(int x) {
		Node newnode=new Node(x);
		newnode.next=head;
		head=newnode;
	}
	public void insert(int data,int index) {
		int size=0;
		Node prev=head;
		Node temp=head;	
		Node newnode=new Node(data);
		if(index==0) {
			addfirst(data);
		}
		else {
			while(temp!=null && size!=index) {
				prev=temp;
				temp=temp.next;				
				size++;
			}		
			prev.next=newnode;
			newnode.next=temp;
		}	
	}
	public void delete(int index) {
		int size=0;
		Node temp=head;
		Node prev=head;		
		while(temp!=null && size!=index) {
			prev=temp;
			temp=temp.next;	
			size++;
		}
		prev.next=temp.next;		
		
	}

	public static void main(String[] args) {
		MyLinkedlist ll=new MyLinkedlist();
		ll.addlast(9);
		ll.addlast(7);
		ll.addlast(4);
		ll.addlast(5);
		ll.delete(1);
		ll.insert(3, 1);
		Node temp=ll.head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
