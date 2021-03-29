package elementaryDataStructures;

public class LinkedList {
	private Node head;
	private int len;
	
	//push, enqueue
	public void add(int item) {
		Node newNode = new Node(item, null);
		 if(head == null) {
			 head= newNode;
		 } else {
			 Node current = head;
			 while(current.next != null) {
				 current = current.next;
			 }
			 current.next = newNode;
		 }
		 len++;
	}
	
	public void add(int item, int index) {
		if(index > len) {
			System.out.println("Index out of bounds.");
		} else {
			Node current = head;
			Node prev = null;
			int counter = 0;
			
			while(current != null && counter < index) {
				prev = current;
				current = current.next;
				counter++;
			}
			
			Node newNode = new Node(item, prev.next);
			prev.next = newNode;
			len++;
		}
	}
	
	public boolean search(int item) {
		if(head != null) {
			Node current = head;
			while(current != null) {
				if(current.data == item) {
					return true;
				}
				current = current.next;
			}
		}
		return false;
	}
	
	//pop
	public void remove() {
		if(head == null) {
			System.out.println("Empty list!");
		} else {
			Node current = head;
			Node prev = null;
			
			while(current.next != null) {
				prev = current;
				current = current.next;
			}
			prev.next = null;
			current = null;
			len--;
		}
	}
	
	//dequeue -> removeAt(0)
	public void removeAt(int index) {
		if(index >= len ) {
			System.out.println("Index out of bounds.");
		} else {
			Node current = head;
			Node prev = null;
			int counter = 0;

			if(index == 0) {
				head = current.next;
				current = null;
				return;
			}
			
			while(current != null && counter < index) {
				prev = current;
				current = current.next;
				counter++;
			}
			
			prev.next = current.next;
			current = null;
		}
	}
	
	public void remove(int item) {
		if(head == null) {
			System.out.println("Empty list");
		} else {
			Node current = head;
			Node prev = null;
			boolean found = false;
			
			while(current != null) {
				if(current.data == item) {
					found = true;
					break;
				}
				
				prev = current;
				current = current.next;
			}
			
			if(found) {
				prev.next = current.next;
				current = null;
				len--;
			} else {
				System.out.println("Item = ["+item+"] doesn't exist in the list.");
			}
		}
	}
	
	public void dump() {
		if(head == null) {
			System.out.println("Empty list!");
		} else {
			StringBuilder list = new StringBuilder("[");
			Node current = head;
			while(current != null) {
				list.append(current.data).append(" ");
				current = current.next;
			}
			list.append("]");
			System.out.println(list);
		}
	}
	
	private static class Node {
		private int data;
		private Node next;
		
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}
