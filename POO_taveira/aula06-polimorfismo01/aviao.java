public class Aviao implements Veiculo {
    
	public void para() {
        System.out.println("Aviao para");
    }
	
	public void freia() {
        System.out.println("Aviao freia");
    }

    public void acelera() {
       System.out.println("Aviao acelera");
    }

    public void vira(String direcao) {
        System.out.println("Aviao vira para "+ direcao);
    }

}
