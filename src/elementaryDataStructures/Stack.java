package elementaryDataStructures;

public class Stack {
	private int[] a;
	private int len;
	private int top; 
	
	public Stack(int size) {
		a = new int[size];
		len = size;
		top = -1;
	}
	
	public void push(int item) {
		if (top == len-1) {
			System.out.println("Overflow! Can't push new item.");
			return;
		}
		
		a[++top] = item;
	}
	
	public int pop() {
		if (top < 0) {
			System.out.println("Underflow! Can't pop the item.");
			throw new RuntimeException("Underflow! Can't pop the item.");
		}
		
		return a[top--];
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
}
