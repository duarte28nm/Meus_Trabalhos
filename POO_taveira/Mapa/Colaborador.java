
public class Colaborador {

	private int codigo; 
	private String nome;
	private String endereço;
	private String telefone;
	private String bairro;
	private String cep;
	private String cpf;
	private float salarioAtual;
	private float calcularSalario;
	
	public Colaborador (int codigo, String nome, String endereço, String telefone, String bairro, String cep, String cpf, float salarioAtual, float calcularSalario ) {
		this.codigo = codigo;
		this.nome =nome;
		this.endereço = endereço;
		this.telefone= telefone;
		this.bairro= bairro;
		this.cep= cep;
		this.cpf= cpf;
		this.salarioAtual= salarioAtual;
		this.calcularSalario= calcularSalario;
		
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getSalarioAtual() {
		return salarioAtual;
	}
	public void setSalarioAtual(float salarioAtual) {
		this.salarioAtual = salarioAtual;
	}


	public float getCalcularSalario() {
		return calcularSalario;
	}


	public void setCalcularSalario(float calcularSalario) {
		this.calcularSalario = calcularSalario;
	}
}


