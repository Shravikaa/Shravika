package linkedlist;

class DoubleNode{
	int data;
	DoubleNode next;
	DoubleNode prev;
	DoubleNode(int a){
		this.data=a;
		this.next=null;
		this.prev=null;
	}
}
public class Doublelinkedlist {
	DoubleNode head=null;
	public void addlast(int x) {
		DoubleNode newnode=new DoubleNode(x);
		if(head==null) {
			head=newnode;
		}
		else {
			DoubleNode temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;			
		}		
	}
	
	public void addfirst(int x) {
		DoubleNode newnode=new DoubleNode(x);
		newnode.next=head;
		if(head==null) {
			head=newnode;
		}
		else{
			head.prev=newnode;
			head=newnode;
		}
	}
	
	public void insert(int data,int index) {
		int size=0;
		DoubleNode temp=head;	
		DoubleNode newnode=new DoubleNode(data);
		if (index==0) {
			addfirst(data);
		}
		else {
			while(temp.next!=null && size!=index){
				temp=temp.next;				
				size++;
			}		
			DoubleNode prevNode = temp.prev;
	        newnode.next = temp;
	        newnode.prev = prevNode;
	        temp.prev = newnode;
	        prevNode.next = newnode;	
		}
	}
	
	public void delete(int index) {
        int size = 0;
        DoubleNode temp = head;
        while (temp != null && size!= index) {
            temp = temp.next;
            size++;
        }
        DoubleNode prevNode = temp.prev;
        DoubleNode nextNode = temp.next;       
        prevNode.next = nextNode;
        if (nextNode != null) {
            nextNode.prev = prevNode;
        }
    }
	
	public static void main(String[] args) {
		Doublelinkedlist ll=new Doublelinkedlist();
		ll.addlast(9);
		ll.addlast(7);
		ll.addlast(4);
		ll.addlast(5);
		ll.delete(1);
		ll.insert(3, 0);
		DoubleNode temp=ll.head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
