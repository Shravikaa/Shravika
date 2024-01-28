package datastructures;

public class Circulararrayqueue {
    private int[] queue;
    private int front, rear;
    private int size;
    private int currentSize;

    public Circulararrayqueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == size;
    }

    public void enqueue(int item) {
        if (!isFull()) {
            rear = (rear + 1) % size;
            queue[rear] = item;
            currentSize++;
        } else {
            System.out.println("Queue is full, cannot enqueue " + item);
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int removedItem = queue[front];
            front = (front + 1) % size;
            currentSize--;
            return removedItem;
        } else {
            System.out.println("Queue is empty, cannot dequeue");
            return -1; 
        }
    }

    public void display() {
        if (!isEmpty()) {
            int i = front;
            do {
                System.out.print(queue[i] + " ");
                i = (i + 1) % size;
            } while (i != (rear + 1) % size);
            System.out.println();
        } else {
            System.out.println("Queue is empty");
        }
    }

    public static void main(String[] args) {
    	int a[]= {66,44,99,11,33};
        int[] sortarr=selectionsort(a);
        Circulararrayqueue queue = new Circulararrayqueue(4);

        for (int element : sortarr) {
            if (!queue.isFull()) {
                queue.enqueue(element);
            } else {
                int dequeuedItem = queue.dequeue();
                System.out.println("Dequeued item: " + dequeuedItem);
                queue.enqueue(element);
            }
        }

        System.out.println("Final Queue:");
        queue.display();
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
}
