package elementaryDataStructures;

//Queue using two Stacks
public class StackQueue {

	private static Stack first;
	private static Stack second;
	
	public StackQueue(int size) {
		first = new Stack(size);
		second = new Stack(size);
	}
	
	public static void main(String[] args) {
		StackQueue sq = new StackQueue(5);
		
		sq.push(1);
		sq.push(2);
		sq.push(3);
		
		System.out.println("Popped: "+sq.pop());
		System.out.println("Popped: "+sq.pop());
	}

	public void push(int item) {
		first.push(item);
	}
	
	public int pop() {
		if(second.isEmpty()) {
			while(!first.isEmpty()) {
				try {
					second.push(first.pop());
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			}
		}
		
		return second.pop();
	}
}
