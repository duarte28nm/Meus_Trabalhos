public class Jegue implements Veiculo {

	 public void para() {
		    
	        System.out.println("Jegue para");
	    }
	
    public void freia() {
    
        System.out.println("Jegue freia");
    }

    public void acelera() {
    	
       System.out.println("Jegue acelera");
    }

    public void vira(String direcao) {
    	
        System.out.println("Jegue vira para "+ direcao);
    }

}
