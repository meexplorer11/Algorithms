package elementaryDataStructures;

import java.util.Arrays;

public class TwoStacks {

	public static void main(String[] args) {
		Stacks s = new Stacks(10);
		
		s.pushA(1);
		s.pushB(10);
		s.dumpStacks();
		s.pushA(2);
		s.pushB(9);
		s.dumpStacks();
		s.pushA(3);
		s.pushB(8);
		s.dumpStacks();
		s.pushA(4);
		s.pushB(7);
		s.dumpStacks();
		s.pushA(5);
		s.pushB(6);
		s.dumpStacks();
		
		for(int i=0; i<5; i++) {
			System.out.println("PopA: "+s.popA());
			System.out.println("PopB: "+s.popB());
		}
		s.popA();
	}

	private static class Stacks {
		private int[] a;
		private int topA, topB;
		
		public Stacks(int size) {
			a = new int[size];
			topA = -1;
			topB = size;
		}
		
		public void pushA(int item) {
			if(topB == topA+1) {
				System.out.println("Overflow!");
			}
			a[++topA] = item;
		}
		
		public void pushB(int item) {
			if(topA == topB-1) {
				System.out.println("Overflow!");
			}
			a[--topB] = item;
		}
		
		public int popA() {
			if(topA == -1) {
				throw new RuntimeException("Underflow!");
			}
			int item = a[topA--];
			return item;
		}
		
		public int popB() {
			if(topB == a.length) {
				throw new RuntimeException("Underflow!");
			}
			return a[topB++];
		}
		
		public void dumpStacks() {
			System.out.println(Arrays.toString(a));
		}
	}
}
