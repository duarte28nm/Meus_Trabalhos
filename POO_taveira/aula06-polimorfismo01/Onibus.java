public class Onibus implements Veiculo {
	
	public void para() {
        System.out.println("Onibus para");
    }

	public void freia() {
        System.out.println("Onibus freia");
    }

    public void acelera() {
       System.out.println("Onibus acelera");
    }

    public void vira(String direcao) {
        System.out.println("Onibus vira para "+ direcao);
    }
}
