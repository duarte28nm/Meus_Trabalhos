import java.util.*;

public class Arvore_Fila { 

	public static void main(String[] args) {
		//implementação
		Arvore_Fila arvore_fila = new Arvore_Fila();		
		LinkedList<Integer> list = arvore_fila.iniciar();
		
		//inserir e mostrar
		System.out.println("Inserindo item na Fila: ");
			arvore_fila.inserir(list);
				arvore_fila.mostrar(list);		
		System.out.println("\nInserindo item na Fila: ");
			arvore_fila.inserir(list);
				arvore_fila.mostrar(list);	
		System.out.println("\nInserindo item na Fila: ");
			arvore_fila.inserir(list);
				arvore_fila.mostrar(list);		
		System.out.println("\nInserindo item na Fila: ");
			arvore_fila.inserir(list);
				arvore_fila.mostrar(list);		
		System.out.println("\nRemovendo item da Fila: ");
			arvore_fila.remover(list);
				arvore_fila.mostrar(list);
	}
	
	
	
	//iniciar
	public LinkedList<Integer> iniciar() {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		return lista; 
	}
	
	
	
	//inserir
	public void inserir(LinkedList<Integer> lista) {
		Random r = new Random();
		int number = Math.abs(r.nextInt()) % 11;
		lista.addLast(number);
	}
	
	
	
	
	//remover
	public void remover( LinkedList<Integer> lista) {
		lista.removeFirst();
	}
	
	
	
	
	//mostrar
	public void mostrar(LinkedList<Integer> lista) {
		System.out.println(lista);
	}
}
