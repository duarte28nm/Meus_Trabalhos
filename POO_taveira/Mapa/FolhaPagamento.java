public class FolhaPagamento {

	private int mes;
	private float totalDescontos;
	private float totalProventos;
	private int ano;
	private float calcularFolha;
	private ArrayList<MovimentoFolha> items;

	
	public FolhaPagamento() {
		this.items =  new ArrayList<MovimentoFolha>();

	}
	
	
	public FolhaPagamento(int mes, int ano, float totalDescontos, float totalProventos, float calcularFolha) {
		this.mes = mes;
		this.totalDescontos = totalDescontos;
		this.totalProventos = totalProventos;
		this.ano = ano;
		this.calcularFolha = calcularFolha;
		}
	



	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public float getTotalDescontos() {
		return totalDescontos;
	}
	public void setTotalDescontos(float totalDescontos) {
		this.totalDescontos = totalDescontos;
	}
	public float getTotalProventos() {
		return totalProventos;
	}
	public void setTotalProventos(float totalProventos) {
		this.totalProventos = totalProventos;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getCalcularFolha() {
		return calcularFolha;
	}
	public void setCalcularFolha(float calcularFolha) {
		this.calcularFolha = calcularFolha;
	}
	public ArrayList<MovimentoFolha> getItems() {
        return items;
    }

    public void setItems(ArrayList<MovimentoFolha> items) {
        this.items = items;
    }
    
	
    
    
    
	 public void inserirMovimento (MovimentoFolha item) {
	        this.items.add(item);
	    }
	
	
}
