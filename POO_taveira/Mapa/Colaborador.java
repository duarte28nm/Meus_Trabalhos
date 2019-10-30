import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.persistence.*;


@Entity
@Table(name="Colaborador")
public class Colaborador implements Serializable { 
		@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private long id;
  private String nome;
  private String endereco;
  private String telefone;
  private String bairro;
  private String cep;
  private String cpf;
  private float salarioAtual;

  @JsonIgnore
  	@OneToMany(fetch = FetchType.LAZY,mappedBy = "Colaborador")
  private List<MovimentoFolha> movimento=new ArrayList<>();
  
  
  		@ManyToOne(fetch= FecthType.LAZY)
  		@JoinColumn(name="folhaPagamento_id")
  		@JsonIgnore
  		
  //This
  		public Colaborador() {}
  	public Colaborador(long id,String nome,String endereco,String telefone,String bairro,String cep,String cpf,float salarioAtual){
    this.id = id;
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.bairro = bairro;
    this.cep = cep;
    this.cpf = cpf;
    this.salarioAtual = salarioAtual;
  }

  
  	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
  				@JsonIgnore
  	public FolhaPagamento() {
  					return folhapagamento;
  							}
  				@JsonIgnore
  	public void setFolhaPagamento(FolhaPagamento folhaPagamento) {
  					this.folhaPagamento = folhaPagamento;
  				}
  				@JsonIgnore
  	public long getFolhaPagamentoId() {return folhaPagamento.getId();}
  	
  	public long getId() {
  		return id;
  	}
  	public void setId(long id) {
  		this.id=id;
  	}
  	
  //GET e SET
  	
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
      if(movimento.getColaborador().getId() == this.id){
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
    String retorno = String.format("Id:%4d    Nome:%s\n   Salário:%,10.2f    Total Proventos:%,10.2f     Total Descontos: %,11.2f     Valor Liquido a Receber: %,10.2f\n", this.id,this.nome,salario,totalProventos,totalDescontos,(salario+totalProventos-totalDescontos));
    return retorno;
  }
}
