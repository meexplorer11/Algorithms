
public class QuickUnionFind {

	private int[] items;
	
	public QuickUnionFind(int n) {
		items = new int[n];
		
		for(int i=0; i<n; i++) {
			items[i] = i;
		}
	}
	
	public int root(int item) {
		while(item != items[item]) {
			item = items[item];
		}
		System.out.println("Root= "+item);
		return item;
	}
	
	public boolean isConnected(int p, int q) {
		return root(p) == root(q);
	}
	
	public void union(int p, int q) {
		int proot = root(p);
		int qroot = root(q);
		
		items[qroot] = proot;
	}
}
