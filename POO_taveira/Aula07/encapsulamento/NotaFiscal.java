import java.util.Calendar;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class NotaFiscal {
    private int  numero;
    private Calendar dataEmissao;
    private ArrayList<ItemNotaFiscal> items;
    private Cliente cliente;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy h:mm:ss");
    Calendar cal = Calendar.getInstance();
    
    

    public NotaFiscal() {
        this.items = new ArrayList<ItemNotaFiscal>();
    }

    public NotaFiscal(int numero, Calendar dataEmissao, ArrayList<ItemNotaFiscal> items, Cliente cliente) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.items = items;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public ArrayList<ItemNotaFiscal> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemNotaFiscal> items) {
        this.items = items;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void inserirItemNotaFiscal (ItemNotaFiscal item) {
        this.items.add(item);
    }

    public float ImprimirNota () {
        float valorNota=0;
        
        System.out.println("Bodega da Pitombeira - CUPOM FISCAL - ");
        System.out.println("Nota Fiscal: " + this.getNumero() +"\t\tData:"+ sdf.format(cal.getTime()));
        System.out.println("Cliente: "+ this.cliente.getNome() + "   ----------------------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Seq  Descricao                Valor Unitario  Qtd   Valor Item|");
        System.out.println("--------------------------------------------------------------");
       
        //Valor item
        float valorItem;
        
        
        // Pecorre a lista de itens
        for (ItemNotaFiscal itnf : this.items)  {
            // vai somando a variavel valorNota a quantidade de cada item * o valor
            // do produto associado ao item
        	valorItem = itnf.getQuantidade()*itnf.getProduto().getValor();
        	System.out.println("  "+ itnf.getSequencial() + "  " + itnf.getProduto().getDescricao() + "------------------" +itnf.getProduto().getValor() + " ---" + itnf.getProduto().getUnidade() + "------"+ itnf.getQuantidade()+ "------" +valorItem+ "---");                                                  
        	 
            valorNota = valorNota +
                        (itnf.getQuantidade() * itnf.getProduto().getValor());
        }
        
        System.out.println("... ......................... .............. ..... ...........");
        System.out.println("... ......................... .............. ..... ...........");
        System.out.println("... ......................... .............. ..... ...........");
        System.out.println("... ......................... .............. ..... ...........");
        System.out.println("... ......................... .............. ..... ...........");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");
        return valorNota;
        
    }
    

}
