public class Principal {

	public static void main(String[] args) {
		
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
