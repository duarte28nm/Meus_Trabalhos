

	
	class MovimentoFolha{
		
  private String descrição;
  private float valor;
  private TipoMovimento tipoMovimento;
  private Colaborador colaborador;

  
  
  //THIS
  public MovimentoFolha(Colaborador colaborador, String descrição, float valor, String tipoMovimento){
	  if(tipoMovimento == "P"){
		  this.colaborador = colaborador;
		  	this.tipoMovimento = TipoMovimento.P;
		  		this.descrição = descrição;
		  			this.valor = valor;
    } else 
    				if(tipoMovimento == "D"){
    			this.colaborador = colaborador;
    		  this.tipoMovimento = TipoMovimento.D;
    	  	this.descrição = descrição;
    	  this.valor = valor;
    }
  }

  
  
  //GET E SET
  public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public float getValor() {
		return valor;
  }
	public Colaborador getColaborador(){
    return colaborador;
  }
	public void setValor(float valor) {
		this.valor = valor;
	}
	public TipoMovimento getTipoMovimento() {
		return tipoMovimento;
	}
	public void setTipoMovimento(TipoMovimento tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}
}
