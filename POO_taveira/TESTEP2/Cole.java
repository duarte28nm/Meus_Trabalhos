import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

import Cole1.Cole2.Cole3.Cole4.Cole5;

public class Cole {

	public static void main(String[] args) {
		//implementação
		Cole1 l1 = new Cole1();
			LinkedList<Integer> list = l1.iniciar();
		Cole2 l2 = new Cole2();		
			Vector<String> list = l2.iniciar();
		Cole3 l3 = new Cole3();
			TreeSet<Integer> list = l3.iniciar();	
		Cole4 l4 = new Cole4();
			LinkedHashSet<String> list = l4.iniciar();
		Cole5 l5 = new Cole5();		
			Stack<Integer> list = l5.iniciar();
			
		//inserir e mostrar (inicio)
		System.out.println("Inserindo no inicio da LinkedList: ");
			l1.inserir_inicio(list, 3);
				l1.mostrar(list);	
		System.out.println("Inserindo no inicio do vector: ");
			l2.inserir_inicio(list);
				l2.mostrar(list);
		System.out.println("Inserindo item na TreeSet: ");
			l3.inserir(list, 3);
				l3.mostrar(list);
		System.out.println("Inserindo no inicio do LinkedHashSet: ");
			l4.inserir_inicio(list);
				l4.mostrar(list);		
		System.out.println("Inserindo no inicio da Stack: ");
			l5.inserir_inicio(list, 3);
				l5.mostrar(list);
				
		//inserir e mostrar (fim) 		
		System.out.println("\nInserindo no fim da LinkedList: ");
			l1.inserir_fim(list, 4);
				l1.mostrar(list);
		System.out.println("\nInserindo no fim do vector: ");
			l2.inserir_fim(list);
				l2.mostrar(list);
		System.out.println("\nInserindo no fim do LinkedHashSet: ");
			l4.inserir_fim(list);
				l4.mostrar(list);		
		System.out.println("\nInserindo no fim da Stack: ");
			l5.inserir_fim(list, 3);
				l5.mostrar(list);
				
		//remover e mostrar		
		System.out.println("\nRemovendo item da LinkedList: ");
			l1.remover(list, 5);
				l1.mostrar(list);	
		System.out.println("\nRemovendo item do vector: ");
			l2.remover(list);
				l2.mostrar(list);
		System.out.println("\nRemovendo item da TreeSet: ");
			l3.remover(list, 0);
				l3.mostrar(list);	
		System.out.println("\nRemovendo item do LinkedHashSet: ");
			l4.remover(list);
				l4.mostrar(list);		
		System.out.println("\nRemovendo item da Stack: ");
			l5.remover(list, 0);
				l5.mostrar(list);
	}
	//inicio
	public LinkedList<Integer> iniciar() {
		LinkedList<Integer> lista = new LinkedList<Integer>();
			return lista; 
	}
	public Vector<String> iniciar() {
		Vector<String> lista = new Vector<String>();
			return lista; 
	}
	public TreeSet<Integer> iniciar() {
		TreeSet<Integer> lista = new TreeSet<Integer>();
			return lista; 
	}
	public LinkedHashSet<String> iniciar() {
		LinkedHashSet<String> lista = new LinkedHashSet<String>();
			return lista; 
	}
	public Stack<Integer> iniciar() {
		Stack<Integer> lista = new Stack<Integer>();
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
		public void inserir_inicio(Vector<String> lista) {
			lista.add("A");
				lista.add("B");
					lista.add("C");
						lista.add("D");
							lista.add("E");
		}
		public void inserir(TreeSet<Integer> lista, int qnt) {
			Random r = new Random();
				while(qnt > 0) {
					int number = Math.abs(r.nextInt()) % 11;
						lista.add(number);
							qnt--;
			}
		}
		public void inserir_inicio(LinkedHashSet<String> lista) {
			lista.add("Preto");
				lista.add("Vermelho");
					lista.add("Laranja");
						lista.add("Verde");
							lista.add("Azul");
		}
		public void inserir_inicio(Stack<Integer> lista, int qntd) {
			Random r = new Random();
				while(qntd > 0) {
					int number = Math.abs(r.nextInt()) % 11;
						lista.add(number);
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
		public void inserir_fim(Vector<String> lista) {	
			lista.addElement("F");
				lista.addElement("G");
		}	
		public void inserir_fim(LinkedHashSet<String> lista) {	
			lista.add("Rosa");
				lista.add("Branco");
					lista.add("Amarelo");
		}	
		public void inserir_fim(Stack<Integer> lista, int qntd) {
			Random r = new Random();
				while(qntd > 0) {
					int number = Math.abs(r.nextInt()) % 11;
						lista.addElement(number);
							qntd--;
			}
		}
		
		
		
		
		
		//remove
				public void remover(LinkedList<Integer> lista, int index) {
					lista.remove(index);
				}
				public void remover( Vector<String> lista) {
					lista.remove("A");
						lista.remove("C");
				}
				public void remover( TreeSet<Integer> lista, int x) {
					lista.remove(x);
				}
				public void remover( LinkedHashSet<String> lista) {
					lista.remove("Laranja");
						lista.remove("Verde");
				}
				public void remover( Stack<Integer> lista, int index) {
					lista.remove(index);
				}
				
				
				
				
				
				//mostrar
				public void mostrar(LinkedList<Integer> lista) {
					System.out.println(lista);
				}
				public void mostrar(Vector<String> lista) {
					System.out.println(lista);
				}
				public void mostrar(TreeSet<Integer> lista) {
					System.out.println(lista);
				}
				public void mostrar(LinkedHashSet<String> lista) {
					System.out.println(lista);
				}
				public void mostrar(Stack<Integer> lista) {
					System.out.println(lista);
				}

}
