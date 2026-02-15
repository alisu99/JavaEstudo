public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setNumeroPortas(4);
        carro1.setFichaTecnica("CHEVROLET", "CHEVETE", 2002, "MARROM", 1.6);
        carro1.getFichatecnica();

        carro1.turnOnVehicle();
        carro1.turnOffVehicle();
    }
}
