import java.util.LinkedHashSet;

public class Cole4 {

	public static void main(String[] args) {
	//implementação
	Cole4 l4 = new Cole4();
		LinkedHashSet<String> list = l4.iniciar();
	
	//inserir e mostrar (inicio)
		System.out.println("Inserindo no inicio do LinkedHashSet: ");
			l4.inserir_inicio(list);
				l4.mostrar(list);
		
	//inserir e mostrar (fim)
		System.out.println("\nInserindo no fim do LinkedHashSet: ");
			l4.inserir_fim(list);
				l4.mostrar(list);
		
	//remover e mostrar 			
		System.out.println("\nRemovendo item do LinkedHashSet: ");
			l4.remover(list);
				l4.mostrar(list);
	}
	
	
	
	
	
	//inicio
	public LinkedHashSet<String> iniciar() {
		LinkedHashSet<String> lista = new LinkedHashSet<String>();
			return lista; 
	}
	
	
	
	
	
	//inserir inicio
	public void inserir_inicio(LinkedHashSet<String> lista) {
		lista.add("Preto");
			lista.add("Vermelho");
				lista.add("Laranja");
					lista.add("Verde");
						lista.add("Azul");
	}
	
	
	
	
	
	////inserir fim
	public void inserir_fim(LinkedHashSet<String> lista) {	
		lista.add("Rosa");
			lista.add("Branco");
				lista.add("Amarelo");
	}	
	
	
	
	
	
	//remover
	public void remover( LinkedHashSet<String> lista) {
		lista.remove("Laranja");
			lista.remove("Verde");
	}
	
	
	
	
	
	//mostrar
	public void mostrar(LinkedHashSet<String> lista) {
		System.out.println(lista);
	}
}
