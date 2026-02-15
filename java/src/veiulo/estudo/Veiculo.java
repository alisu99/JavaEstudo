package veiulo.estudo;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;
    private double potenciaMotor;

    public void turnOnVehicle() {
        System.out.println("Veículo ligado.");
    }

    public void turnOffVehicle() {
        System.out.println("Veículo desligado.");
    }

    public void setFichaTecnica(String marca, String modelo, int anoFabricacao, String cor, double potenciaMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.potenciaMotor = potenciaMotor;
    }

    public void getFichatecnica() {
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("ANO: " + anoFabricacao);
        System.out.println("COR: " + cor);
        System.out.println("POTÊNCIA: " + potenciaMotor);
    }
}
