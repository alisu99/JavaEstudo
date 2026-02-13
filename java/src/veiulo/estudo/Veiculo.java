package veiulo.estudo;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;

    private void turnOnVehicle() {
        System.out.println("Veículo ligado.");
    }

    private void turnOffVehicle() {
        System.out.println("Veículo desligado.");
    }
}
