public class Pudim {
	
	//atributos
	private String sabor;
	private String tamanho;
	private String cliente;
	
	public Pudim () {
	}
	//////////////////////////////////////////////////////
	public Pudim(String sabor, String tamanho, String cliente) {
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.cliente = cliente;
	}
	//////////////////////////////////////////////////////
	public String getSabor() {
		return sabor;
	}
	public void setSabor (String sabor) {
		this.sabor = sabor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho (String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente (String cliente) {
		this.cliente = cliente;
	}
	
	public void mostraReferencia () {

        System.out.println("Pudim: " + this);
	 }
}


