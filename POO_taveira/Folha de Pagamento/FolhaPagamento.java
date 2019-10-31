import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;
@Entity
public class FolhaPagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
    
  private int mes;
  private float totalDesconto;
  private float totalProventos;
  private int ano;
  private ArrayList<MovimentoFolha> items;
  
  @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy= "folhaPagamento")
  private List<Colaborador> colaboradores = new ArrayList();

  
  //THIS
  public FolhaPagamento() {}
  public FolhaPagamento(Long id, int mes,int ano){
    this.id = id;
	this.mes = mes;
    this.ano = ano;
    this.items = new ArrayList<MovimentoFolha>();
    this.colaboradores = new ArrayList<Colaborador>();
  }

  
  
  
  //GET E SET
  	public ArrayList<MovimentoFolha> getMovimentos(){
    return items;
  }
  	public int getMes() {
		return mes;
  } 
	public void setMes(int mes) {
		this.mes = mes;
  }  
	public float getTotalDesconto() {
		return totalDesconto;
  }  
	public void setTotalDesconto(float totalDesconto) {
		this.totalDesconto = totalDesconto;
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
    public void setColaboradores(ArrayList<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
  }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @JsonIgnore
    public List<Colaborador> getColaboradores() {
        return colaboradores;
  }
	
	
	
	//INSERIR MOVIMENTO = ITEM
  public void inserirMovimento(MovimentoFolha item){
    this.items.add(item);
  }

    //INSERIR COLABORADOR = ITEM2
  public void inserirColaborador(Colaborador colaborador){
    this.colaboradores.add(colaborador);
  }

  
  
  //CALCULAR FOLHA
  public String calcularFolha(){
    float salarios = 0;
    float proventos = 0;
    float descontos = 0;
    float valorReceber = 0;
    for(MovimentoFolha item: this.items){
      if(item.getDescrição() == "Salario"){
        salarios+=item.getValor();
      } else if(item.getTipoMovimento() == TipoMovimento.P){
        proventos+=item.getValor();
      } else if(item.getTipoMovimento() == TipoMovimento.D){
        descontos+=item.getValor();
      }
    }
    
    //PRINTAR
    valorReceber = salarios + proventos;
    valorReceber -= descontos;   
    String retorno = String.format("Total de Salários=%,10.2f    Total de Proventos =%,10.2f    Total de Descontos =%,10.2f     Valor a Receber =%,10.2f ", salarios,proventos,descontos,valorReceber);
    return retorno;
  }
}
