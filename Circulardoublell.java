package linkedlist;

class CircularNode{
	int data;
	CircularNode next;
	CircularNode prev;
	CircularNode(int a){
		this.data=a;
		this.next=null;
		this.prev=null;
	}
}

public class Circulardoublell {
	CircularNode head;
	CircularNode tail;
	public void addLast(int x) {
		CircularNode newnode=new CircularNode(x);
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
		CircularNode newnode=new CircularNode(x);
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
		CircularNode newnode=new CircularNode(x);
		if (index==0) {
			addfirst(x);
		}
		else {
			CircularNode temp=head;
			CircularNode previous=head;
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
		CircularNode temp=head;
		CircularNode previous=head;
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
		Circulardoublell ll=new Circulardoublell();
		ll.addLast(9);
		ll.addLast(7);
		ll.addLast(4);
		ll.addLast(5);
		ll.delete(1);
		ll.insert(3, 0);
		CircularNode temp=ll.head;
		do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != ll.head);
   }
}
