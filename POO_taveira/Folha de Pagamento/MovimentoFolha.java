import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;


@Entity

public class MovimentoFolha implements Serializable {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String descrição;
  private float valor;
  @Enumerated(EnumType.STRING)
  private TipoMovimento tipoMovimento;
  private Colaborador colaborador;

  @ManyToOne(fetch= FetchType.LAZY)
  @JoinColumn(name="colaborador_id")
  private MovimentoFolha movimentoFolha;


	public MovimentoFolha() {
	}
  
  //THIS
  public MovimentoFolha(Colaborador colaborador, Long id, String descrição, float valor, String tipoMovimento){
	  this.id = id;
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
	@JsonIgnore
	public Colaborador getColaborador(){
    return colaborador;
  }
	@JsonIgnore
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
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
