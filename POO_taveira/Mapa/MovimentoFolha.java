
public class MovimentoFolha {

	public String descrição;
	public float valor;
	
	
	public MovimentoFolha (String descrição, float valor ) {
		this.descrição = descrição;
		this.valor= valor;
	}

	
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição (String descrição) {
		this.descrição = descrição;
		}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
}
