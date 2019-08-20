public class Principal {



	public static void main (String args[]) {
        // Criar um Cliente
        Cliente C1 = new Cliente("Jose Maria");
        
        // Criar tres objetos de Produto
        Produto p1 = new Produto("Farinha", "KG", 1.00f);
        Produto p2 = new Produto("Feijão", "KG", 5.00f);
        Produto p3 = new Produto("Macarrao", "PC", 3.50f);
        
        // Cria uma Nota Fiscal
        NotaFiscal nf1 = new NotaFiscal();
        
        // Associar a Nota ao Cliente
        nf1.setCliente(C1);

        // Armazena a data atual (pega a data do sistema)
        nf1.setDataEmissao (java.util.Calendar.getInstance());

        // Armazena o numero da Nota Fiscal
        nf1.setNumero(123);

        // cria três items de nota fiscal
        // Item 1 sequecial=1, 10 KG de Farinha
        ItemNotaFiscal itnf1 = new ItemNotaFiscal(1,10,p1);
        // Item 2 sequencial=2, 5 KG de Feijão
        ItemNotaFiscal itnf2 = new ItemNotaFiscal(2,5,p2);
        // Item 3 sequencial=3, 6 pacotes de Macarrão
        ItemNotaFiscal itnf3 = new ItemNotaFiscal(3,6,p3);

        // Inserir os items na Nota Fiscal
        nf1.inserirItemNotaFiscal(itnf1);
        nf1.inserirItemNotaFiscal(itnf2);
        nf1.inserirItemNotaFiscal(itnf3);
        
   
        
        //
        System.out.println("Bodega da Pitombeira - CUPOM FISCAL - ");
        System.out.println("Nota Fiscal: " + nf1.getNumero() +"\t\tData:20/08/2019 ");
        System.out.println("Cliente: "+C1.getNome() + "\t\t---------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Seq Descricao                Valor Unitario  Qtd    Valor Item");
        System.out.println(":"+ itnf1.getSequencial()+ "   "+p1.getDescricao() + "                  "+p1.getValor()+ "     "+p1.getUnidade()+"   " + " "+itnf1.getQuantidade()+ "    "+p1.getValor()+"    001");
        System.out.println(":"+ itnf2.getSequencial()+ "   "+p2.getDescricao() + "                   "+p2.getValor()+ "     "+p2.getUnidade()+"   " + " "+itnf2.getQuantidade()+ "     "+p1.getValor()+"    002");
        System.out.println(":"+ itnf3.getSequencial()+ " "+p3.getDescricao() + "                   "+p3.getValor()+ "     "+p3.getUnidade()+"   " + " "+itnf3.getQuantidade()+ "     "+p3.getValor()+"    003");
        System.out.println("--------------------------------------------------------------");
        System.out.println("O valor da Nota Fiscal= " + nf1.calcularValorNota());


        

    }

	
}
