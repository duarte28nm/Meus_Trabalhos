public enum TipoMovimento {

	P(1), D(2);
	
	public int op;
	
	private TipoMovimento (int op) {
		this.op = op;
	}
}
