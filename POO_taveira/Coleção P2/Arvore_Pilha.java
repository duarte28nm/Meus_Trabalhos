import java.util.*;

public class Arvore_Pilha { 

	public static void main(String[] args) {
		//implementação
		Arvore_Pilha arvore_pilha = new Arvore_Pilha();
		LinkedList<Integer> list = pilha.iniciar();
		
		//inserir e mostrar
		System.out.println("Inserindo item na Pilha: ");
			arvore_pilha.inserir(list);
				arvore_pilha.mostrar(list);		
		System.out.println("\nInserindo item na Pilha: ");
			arvore_pilha.inserir(list);
				arvore_pilha.mostrar(list);		
		System.out.println("\nInserindo item na Pilha: ");
			arvore_pilha.inserir(list);
				arvore_pilha.mostrar(list);		
		System.out.println("\nInserindo item na Pilha: ");
			arvore_pilha.inserir(list);
				arvore_pilha.mostrar(list);		
		System.out.println("\nRemovendo item da Pilha: ");
			arvore_pilha.remover(list);
				arvore_pilha.mostrar(list);
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
		lista.removeLast();
	}
	
	
	
	
	//mostrar
	public void mostrar(LinkedList<Integer> lista) {
		System.out.println(lista);
	}
}
