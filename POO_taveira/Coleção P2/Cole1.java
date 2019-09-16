import java.util.LinkedList;
import java.util.Random;

public class Cole1 {

	public static void main(String[] args) {
	//implementação
	Cole1 l1 = new Cole1();
		LinkedList<Integer> list = l1.iniciar();
		
	//inserir e mostrar (inicio)
		System.out.println("Inserindo no inicio da LinkedList: ");
			l1.inserir_inicio(list, 3);
			l1.mostrar(list);	
			
	//inserir e mostrar (fim) 		
		System.out.println("\nInserindo no fim da LinkedList: ");
			l1.inserir_fim(list, 4);
			l1.mostrar(list);
			
	//remover e mostrar		
		System.out.println("\nRemovendo item da LinkedList: ");
			l1.remover(list, 5);
			l1.mostrar(list);
			
			
			
	}
	//inicio
			public LinkedList<Integer> iniciar() {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		return lista; 
	}
	
			
			
	//inserir inicio		
	public void inserir_inicio(LinkedList<Integer> list, int qntd) {
		Random r = new Random();
			while(qntd > 0) {
				int number = Math.abs(r.nextInt()) % 11;
					list.add(number);
						qntd--;
		}
	}
	
	
	
	//fim
	public void inserir_fim(LinkedList<Integer> lista, int qntd) {
		Random r = new Random();
			while(qntd > 0) {
				int number = Math.abs(r.nextInt()) % 11;
					lista.addLast(number);
						qntd--;
		}
	}	
	
	
	
	//remove
		public void remover(LinkedList<Integer> lista, int index) {
			lista.remove(index);
	}
	
		
		
	//mostrar
		public void mostrar(LinkedList<Integer> lista) {
			System.out.println(lista);
	}
}
