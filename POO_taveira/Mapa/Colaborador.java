	
	class Colaborador{

  private int codigo;
  private String nome;
  private String endereco;
  private String telefone;
  private String bairro;
  private String cep;
  private String cpf;
  private float salarioAtual;

  
  //This
  Colaborador(int codigo,String nome,String endereco,String telefone,String bairro,String cep,String cpf,float salarioAtual){
    this.codigo = codigo;
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.bairro = bairro;
    this.cep = cep;
    this.cpf = cpf;
    this.salarioAtual = salarioAtual;
  }

  
  //GET e SET
  	public int getCodigo() {
		return codigo;
  }
	public void setCodigo(int codigo) {
		this.codigo = codigo;
  }  
	public String getNome() {
		return nome;
  }  
	public void setNome(String nome) {
		this.nome = nome;
  } 
	public String getEndereco() {
		return endereco;
  } 
	public void setEndereco(String endereco) {
		this.endereco = endereco;
  } 
	public String getTelefone() {
		return telefone;
  } 
	public void setTelefone(String telefone) {
		this.telefone = telefone;
  } 
	public String getBairro() {
		return bairro;
  } 
	public void setBairro(String bairro) {
		this.bairro = bairro;
  } 
	public String getCep() {
		return cep;
  }
	public void setCep(String cep) {
		this.cep = cep;
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
	
	
  //CALCULAR SALARIO
  public String calcularSalario(FolhaPagamento folha){
    float salario = 0;
    float totalProventos=0;
    float totalDescontos = 0;  
    for(MovimentoFolha movimento: folha.getMovimentos()){
      if(movimento.getColaborador().getCodigo() == this.codigo){
        if(movimento.getDescrição() == "Salario"){
          salario+=movimento.getValor();
        } else if(movimento.getTipoMovimento() == TipoMovimento.P){
          totalProventos+=movimento.getValor();
        } else if(movimento.getTipoMovimento() == TipoMovimento.D){
          totalDescontos+=movimento.getValor();
        }
      }
    }
    //PRINTAR
    System.out.println ("");
    String retorno = String.format("Codigo:%4d    Nome:%s\n   Salário:%,10.2f    Total Proventos:%,10.2f     Total Descontos: %,11.2f     Valor Liquido a Receber: %,10.2f\n", this.codigo,this.nome,salario,totalProventos,totalDescontos,(salario+totalProventos-totalDescontos));
    return retorno;
  }
}
