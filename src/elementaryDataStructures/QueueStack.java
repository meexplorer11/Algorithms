package elementaryDataStructures;

//Stack using two queues
public class QueueStack {
	private Queue first;
	private Queue second;
	
	public QueueStack(int size) {
		first = new Queue(size);
		second = new Queue(size);
	}
	
	public static void main(String[] args) {
		QueueStack q = new QueueStack(5);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println("Popped: "+q.dequeue());
		
		q.enqueue(4);
		System.out.println("Popped: "+q.dequeue());
	}
	
	public void enqueue(int item) {
		first.queue(item);
	}
	
	public int dequeue() {
		if(first.noOfItems() > 0) {
			while(first.noOfItems() > 1) {
				second.queue(first.dequeue());
			}
			
			int item = first.dequeue();
			
			Queue temp = first;
			first = second;
			second = temp;
			
			return item;
		}
		return first.dequeue();
	}

}
