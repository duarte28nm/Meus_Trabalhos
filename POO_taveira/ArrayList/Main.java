import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("Começando...\n");
        long inicio = System.currentTimeMillis();
        ArrayList <Lista> lista = new ArrayList<Lista>();
       
        for(int i = 1 ; i < 1001 ; i++){
            lista.add(new Lista(i));       
        }
        for (Lista elemento : lista) {
        	System.out.println(elemento.num+"\n");
        }
        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo de execução é:"+tempo);
        
}
}
