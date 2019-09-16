import java.util.Random;
import java.util.TreeSet;

public class Cole3 {

	public static void main(String[] args) {
	//implementação	
	Cole3 l3 = new Cole3();
			TreeSet<Integer> list = l3.iniciar();
	
	//inserir e mostrar
		System.out.println("Inserindo item na TreeSet: ");
			l3.inserir(list, 3);
				l3.mostrar(list);
		
	//remover e mostrar				
		System.out.println("\nRemovendo item da TreeSet: ");
			l3.remover(list, 0);
				l3.mostrar(list);
	}
	
	
	
	//inicio
	public TreeSet<Integer> iniciar() {
		TreeSet<Integer> lista = new TreeSet<Integer>();
			return lista; 
	}
	
	
	
	
	//inserir
	public void inserir(TreeSet<Integer> lista, int qnt) {
		Random r = new Random();
			while(qnt > 0) {
				int number = Math.abs(r.nextInt()) % 11;
					lista.add(number);
						qnt--;
		}
	}
	
	
	
	
	
	//remover
	public void remover( TreeSet<Integer> lista, int x) {
		lista.remove(x);
	}
	
	
	
	
	
	//mostrar
	public void mostrar(TreeSet<Integer> lista) {
		System.out.println(lista);
	}
}
