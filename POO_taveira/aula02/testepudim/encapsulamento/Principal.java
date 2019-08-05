public class Principal {

	public static void main(String[] args) {
	
		
		//Mousse
		Mousse mousse1;
		mousse1 = new Mousse();
		mousse1.setSabor("Limão");
		mousse1.setTamanho("Medio");
		mousse1.setCliente("Kelvin");
		
		Mousse mousse2;
		mousse2 = new Mousse();
		mousse2.setSabor("Maracuja");
		mousse2.setTamanho("Pequeno");
		mousse2.setCliente("Livia");
		
		//Pudim
		
		Pudim pudim1;
		pudim1 = new Pudim();
		pudim1.setSabor("Aoleite");
		pudim1.setTamanho("Grande");
		pudim1.setCliente("Neto");
		
		Pudim pudim2;
		pudim2 = new Pudim();
		pudim2.setSabor("Maracuja");
		pudim2.setTamanho("Pequeno");
		pudim2.setCliente("Beatriz");
		
		//Mousse
		System.out.println();
		System.out.println("Mousse 1");
		System.out.println("Sabor: "+mousse1.getSabor()); 
		System.out.println("Tamanho: "+mousse1.getTamanho());
		System.out.println("Nome do cliente: "+mousse1.getCliente());
		System.out.println("Muito obrigado, volte sempre ;)");
		
		System.out.println();
		System.out.println("Mousse 2");
		System.out.println("Sabor: "+mousse2.getSabor()); 
		System.out.println("Tamanho: "+mousse2.getTamanho());
		System.out.println("Nome do cliente: "+mousse2.getCliente());
		System.out.println("Muito obrigado, volte sempre ;)");
		//Pudim
		System.out.println();
		System.out.println("Pudim 1");
		System.out.println("Sabor: "+pudim1.getSabor()); 
		System.out.println("Tamanho: "+pudim1.getTamanho());
		System.out.println("Nome do cliente: "+pudim1.getCliente());
		System.out.println("Muito obrigado, volte sempre ;)");
		
		System.out.println();
		System.out.println("Pudim 2");
		System.out.println("Sabor: "+pudim2.getSabor()); 
		System.out.println("Tamanho: "+pudim2.getTamanho());
		System.out.println("Nome do cliente: "+pudim2.getCliente());
		System.out.println("Muito obrigado, volte sempre ;)");
					

	}

}
