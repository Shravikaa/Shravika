package datastructures;

import java.util.Arrays;

class QNode {
    int data;
    QNode next;

    QNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CircularLLqueue {
    private QNode front;
    private QNode rear;
    public CircularLLqueue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int data) {
        QNode newNode = new QNode(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            rear.next=front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next=front;
        }
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        int removedData = front.data;
        if (front == rear) { 
            front = null;
            rear = null;
        } else {
            front = front.next;
            rear.next = front; 
        }
        //return removedData;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public void display() {
        QNode current = front;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        }while(current != null && current!=front);
        
    }
    public static int[] selectionsort(int a[]) {
    	for(int i=0;i<3;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
    	return(a);
    }

    public static void main(String[] args) {
        CircularLLqueue queue = new CircularLLqueue(); 
        int a[]= {66,44,99,11,33};
        int[] sortarr=selectionsort(a);
        int maxsize=4;
        int size=0;
        System.out.println("after sorting three elements queue is "+Arrays.toString(sortarr));
        
        while(size!=maxsize) {
        	queue.enqueue(sortarr[size]);
        	size++;
        }
        queue.dequeue();
        queue.enqueue(sortarr[size]);
        size--;
        System.out.println("after deleting from queue ");
        queue.display();
        
         
        
    }
}
