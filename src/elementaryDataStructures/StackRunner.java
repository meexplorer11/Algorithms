package elementaryDataStructures;

public class StackRunner {

	public static void main(String[] args) {
		Stack s = new Stack(10);
		
		System.out.println("====== On empty Stack ==========");
		System.out.println("Is empty? "+s.isEmpty());
		
		try {
			s.pop();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("====== Pushing items ==========");
		s.push(1);
		s.push(2);
		System.out.println("Is empty? "+s.isEmpty());
		System.out.println("Popped item: "+s.pop());
		
		for (int i = 2; i <= 12; i++) {
			s.push(i); //last two pushes will result into Overflow
		}
		System.out.println("Another pop: "+s.pop());	
	}

}
