import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;



public class Main {
    public static void main(String[] args){

    	//Criando Lista TreeSet.
    	System.out.println("Começando...\n");
        long inicio = System.currentTimeMillis();
        Set<Lista> ts = new <Lista> TreeSet();
        int i;
        
        //Adicionando elementos de 1 a 1000.
        for(int i1 = 1 ; i1 < 1001 ; i1++){
            ts.add(new Lista(i1));
        }
        for (Lista elemento : ts) {
        	System.out.println(elemento.num+"\n");
        }

        //Imprimindo a lista em ordem crescente, mais uma segunda quebra de linha.
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo de execução é:"+tempo +" segundos.");
       
    }
	}
