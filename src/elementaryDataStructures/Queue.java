package elementaryDataStructures;

public class Queue {
	private int[] a;
	private int head, tail;
	private int len;
	private int noOfItems;
	
	public Queue(int size) {
		a = new int[size];
		head = tail = 0;
		len = size;
		noOfItems = 0;
	}
	
	public void queue(int item) {
		if(isFull()) {
			System.out.println("Overflow!");
			return;
		}
		
		a[tail] = item;
		tail = tail == len ? 0 : tail+1;
		noOfItems++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Underflow!");
			throw new RuntimeException("Underflow!");
		}
		
		int item = a[head];
		head = head == len ? 0 : head+1;
		noOfItems--;
		return item;
	}
	
	public boolean isEmpty() {
		return head == tail;
	}
	
	public boolean isFull() {
		return (head == 0 && tail == len) || (head == tail + 1);
	}
	
	public int noOfItems() {
		return noOfItems;
	}
}
