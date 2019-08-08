public class TestInterface {
    
    public static void main ( String [] args ){
        
        Veiculo v1 = new Jipe();
        Veiculo v2 = new Jegue();
        Veiculo v3 = new Onibus();
        Veiculo v4 = new Aviao();
        Manobrista mano = new Manobrista();

        mano.estaciona(v1);
        mano.estaciona(v2);
        mano.estaciona(v3);
        mano.estaciona(v4);
    }
}
