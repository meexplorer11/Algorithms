
public class Runner {

	public static void main(String[] args) {
		UnionFInd uf = new UnionFInd(10);
		
		System.out.println(uf.conneced(1, 0));
		uf.union(1, 0);
		System.out.println(uf.conneced(1, 0));
		uf.union(1, 0);
	}

}
