package elementaryDataStructures;

public class LinkedListRunner {

	public static void main(String[] args) {
		linkedList();
	}

	private static void linkedList() {
		LinkedList l = new LinkedList();
		System.out.println("===== Add ========");
		l.add(4);
		l.add(9);
		l.add(10);
		
		l.dump();
		
		System.out.println("\n===== Search ========");
		System.out.println("Found 9? "+l.search(9));
		System.out.println("Found 5? "+l.search(5));

		System.out.println("\n===== Remove last ========");
		l.remove();
		l.dump();
		
		System.out.println("\n===== Remove by finding the item ========");
		l.add(5);
		l.dump();
		l.remove(6);
		l.remove(9);
		l.dump();
		
		System.out.println("\n===== Add at index ========");
		l.add(3, 1);
		l.dump();
		
		System.out.println("\n===== Remove at index ========");
		l.removeAt(2);
		l.dump();
		
		l.removeAt(0);
		l.dump();
	}

	
}
