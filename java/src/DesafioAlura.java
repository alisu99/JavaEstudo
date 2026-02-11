import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        double saldo = 0;
        String tipoConta = "CORRENTE N2";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println(String.format("""
            BEM-VINDO(A) AO BANCO AGAS
            
            Tipo de conta: %s
            [1] Consultar saldo
            [2] Saque
            [3] Depósito
            [4] Sair
            
            Selecione uma opção:
            """, tipoConta));
            int opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("-------------------------------------------------");
                    System.out.printf("Seu saldo atual é de R$ %.2f%n", saldo);
                    continue;
                case 2:
                    double valorTransferencia = 0;
                    System.out.println("-------------------------------------------------");
                    System.out.println("Digite o valor do saque" +
                            ":");
                    valorTransferencia = scanner.nextDouble();

                    if (saldo < valorTransferencia) {
                        System.out.println("-------------------------------------------------");
                        System.out.println("Saldo insuficiênte para realizar a transação.");
                        continue;
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("-------------------------------------------------");
                        System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valorTransferencia);
                        System.out.println(String.format("Saldo atual: %.2f", saldo));
                        continue;
                    }

                case 3:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Valor do depósito:");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.printf("""
                    Valor depositado: R$ %.2f
                    Saldo: R$ %.2f
                    """, valorDepositado, saldo);
                    continue;
                case 4:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Obrigado pela preferência! Encerrando atendimento.");
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opção inválida, Tente novamente!");
                    continue;
            }
            break;
        }
    }
}
