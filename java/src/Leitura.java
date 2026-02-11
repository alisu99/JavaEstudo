import java.util.Random;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        int tentativas = 0;
        int numeroAleatorio = new Random().nextInt(100);

        while (tentativas < 10) {
            System.out.println("----- Joguinho da adivinhação! -----");
            System.out.println("Estou pensando em um número, consegue adivinhar?");
            System.out.println("Digite o número (" + (tentativas + 1) + "° tentativa):");

            Scanner scanner = new Scanner(System.in);
            int numeroDigitado = scanner.nextInt();
            tentativas++;

            if (numeroDigitado > numeroAleatorio) {
                System.out.println("o número " + numeroDigitado + " é maior que o número que estou pensando");
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número " + numeroDigitado + " é menor que o número que estou pensando");
            } else {
                System.out.println("Parabéns, você acertou! Número: " + numeroAleatorio);
                break;
            }
        }
    }
}
