
public class Runner {

	public static void main(String[] args) {
		//tryUnionFind();
		
		tryQuickUnionFind();
	}
	
	private static void tryQuickUnionFind() {
		QuickUnionFind quf = new QuickUnionFind(10);
		
		System.out.println(quf.isConnected(2, 5));
		quf.union(2, 5);
		System.out.println(quf.isConnected(2, 5));
	}
	
	private static void tryUnionFind() {
		UnionFInd uf = new UnionFInd(10);
		
		System.out.println(uf.conneced(1, 0));
		uf.union(1, 0);
		System.out.println(uf.conneced(1, 0));
		uf.union(1, 0);
	}

}
