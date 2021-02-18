public class UnionFInd {

	private int[] items;
	
	public UnionFInd(int N) {
		items = new int[N];
		for(int i=0; i<N; i++) {
			items[i] = i;
		}
	}
	
	public boolean conneced(int p, int q) {
		return items[p] == items[q];
	}

	public void union(int p, int q) {
		if (conneced(p, q)) {
			System.out.println("Already connected");
			return;
		}
		
		int px = items[p];
		int qx = items[q];
		
		for(int i : items) {
			if(items[i] == px)
				items[i] = qx;
		}
	}
}
