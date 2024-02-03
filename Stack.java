package datastructures;

public class Stack {
	int top=-1;
	int stack[]= new int[5];
	public void push(int x) {
		if(isFull()) {
			System.out.println("stack is full");
		}
		else {
			stack[++top]=x;
		}
	}
	
	public boolean isFull() {
		return top==5;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			top--;
		}
	}
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
	}
	public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
        }
        System.out.print(stack[top]); 
    }

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.display();
		stack.peek();
	}

}
