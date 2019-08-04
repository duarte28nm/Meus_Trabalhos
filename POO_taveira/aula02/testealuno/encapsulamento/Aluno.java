public class Aluno {

	//atributos
	private String nome;
	private String cpf;
	private String semestre;
	
	public Aluno () {
	}
	//////////////////////////////////////////////////////
	public Aluno(String nome, String cpf, String semestre) {
		this.nome = nome;
		this.cpf = cpf;
		this.semestre = semestre;
	}
	//////////////////////////////////////////////////////
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre (String semestre) {
		this.semestre = semestre;
	}
	
	////////////////////////////////////////////
	public void mostraReferencia () {

        System.out.println("Alunos: " + this);
	 }
	 
	 
}
