public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.marca = "VW";
        carro1.modelo = "GOL";
        carro1.anoFabricacao = 2015;
        carro1.cor = "BRANCO";

        carro1.getFichatecnica();
    }
}
