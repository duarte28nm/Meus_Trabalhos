import java.util.Vector;

public class Cole2 {
	public static void main(String[] args) {				
	//implementação
	Cole2 l2 = new Cole2();		
		Vector<String> list = l2.iniciar();
		
	//inserir inicio	
	System.out.println("Inserindo no inicio do vector: ");
		l2.inserir_inicio(list);
		l2.mostrar(list);
		
	//fim	
	System.out.println("\nInserindo no fim do vector: ");
		l2.inserir_fim(list);
		l2.mostrar(list);
		
	//remover e mostrar	
	System.out.println("\nRemovendo item do vector: ");
		l2.remover(list);
		l2.mostrar(list);
	}
	
	
	
	
	//inicio
	public Vector<String> iniciar() {
		Vector<String> lista = new Vector<String>();
			return lista; 
	}
	
	
	
	
	//inserir inicio
	public void inserir_inicio(Vector<String> lista) {
		lista.add("A");
			lista.add("B");
				lista.add("C");
					lista.add("D");
						lista.add("E");
	}
	
	
	
	
	//FIM
	public void inserir_fim(Vector<String> lista) {	
		lista.addElement("F");
			lista.addElement("G");
	}	
	
	
	
	
	//remover
	public void remover( Vector<String> lista) {
		lista.remove("A");
			lista.remove("C");
	}
	
	
	
	
	//mostras
	public void mostrar(Vector<String> lista) {
		System.out.println(lista);
	}
}
