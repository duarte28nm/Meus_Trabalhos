import java.util.Random;
import java.util.Stack;

public class Cole5 {

	public static void main(String[] args) {
	//implementação	
	Cole5 l5 = new Cole5();		
		Stack<Integer> list = l5.iniciar();
		
	//inserir e mostrar (inicio)	
		System.out.println("Inserindo no inicio da Stack: ");
			l5.inserir_inicio(list, 3);
				l5.mostrar(list);
		
	//inserir e mostrar (fim)			
		System.out.println("\nInserindo no fim da Stack: ");
			l5.inserir_fim(list, 3);
				l5.mostrar(list);
		
	//remover e mostrar 			
		System.out.println("\nRemovendo item da Stack: ");
			l5.remover(list, 0);
				l5.mostrar(list);
	}
	
	
	
	
	
	//inicio
	public Stack<Integer> iniciar() {
		Stack<Integer> lista = new Stack<Integer>();
			return lista; 
	}
	
	
	
	
	
	//inserir inicio
	public void inserir_inicio(Stack<Integer> lista, int qntd) {
		Random r = new Random();
			while(qntd > 0) {
				int number = Math.abs(r.nextInt()) % 11;
					lista.add(number);
						qntd--;
		}
	}
	
	
	
	
	
	//inserir fim
	public void inserir_fim(Stack<Integer> lista, int qntd) {
		Random r = new Random();
			while(qntd > 0) {
				int number = Math.abs(r.nextInt()) % 11;
					lista.addElement(number);
						qntd--;
		}
	}
	
	
	
	
	
	//remover
	public void remover( Stack<Integer> lista, int index) {
		lista.remove(index);
	}
	
	
	
	
	
	//mostrar
	public void mostrar(Stack<Integer> lista) {
		System.out.println(lista);
	}
}
