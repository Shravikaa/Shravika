package linkedlist;

class CNode{
	int data;
	CNode next;
	CNode prev;
	CNode(int a){
		this.data=a;
		this.next=null;
		this.prev=null;
	}
}
public class CircularPrblm {
	CNode head;
	CNode tail;
	public void addLast(int x) {
		CNode newnode=new CNode(x);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
			head.prev=tail;
			tail.next=head;
		}		
	}
	public void addfirst(int x) {
		CNode newnode=new CNode(x);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		else {
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
			head.prev=tail;
			tail.next=head;
		}
	}
	public void insert(int x,int index) {
		int size=0;
		CNode newnode=new CNode(x);
		if (index==0) {
			addfirst(x);
		}
		else {
			CNode temp=head;
			CNode previous=head;
			while(temp!=null && size==index) {
				previous=temp;
				temp=temp.next;
				size++;
			}
			previous.next=newnode;
			newnode.prev=previous;
			newnode.next=temp;
			temp.prev=newnode;
		}
	}
	public void delete(int index) {
		int size=0;
		CNode temp=head;
		CNode previous=head;
		if (index==0) {
			head=temp.next;
		}
		else {
			while(temp!=null && size!=index) {
				previous=temp;
				temp=temp.next;
				size++;
			}
			previous.next=temp.next;
			temp.next.prev=previous;
		}
	}
	public static void main(String[] args) {
		CircularPrblm ll=new CircularPrblm();
		ll.addLast(650);
		ll.addLast(345);
		ll.addLast(290);
		ll.addLast(825);
		ll.addLast(120);
		ll.addLast(50);
		CNode temp=ll.head;
		do {
            System.out.println(temp.next.data+temp.next.next.data);
            temp = temp.next;
        } while (temp != ll.head);
   }
}
