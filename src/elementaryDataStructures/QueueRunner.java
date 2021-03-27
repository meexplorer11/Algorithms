package elementaryDataStructures;

public class QueueRunner {

	public static void main(String[] args) {
		Queue q = new Queue(3);
		
		System.out.println("====== On empty Queue =======");
		System.out.println("Is empty? "+q.isEmpty());
		System.out.println("Is Full? "+q.isFull());
		try {
			q.dequeue();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n====== On non-empty Queue =======");
		q.queue(1);
		q.queue(2);
		q.queue(3);
		System.out.println("Is Full? "+q.isFull());
		System.out.println("Item1 "+q.dequeue());
		System.out.println("Item2 "+q.dequeue());
		System.out.println("Item3 "+q.dequeue());
		System.out.println("Item4 "+q.dequeue());
	}

}
