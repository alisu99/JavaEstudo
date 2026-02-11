
public class Main {
    public static void main(String[] args) {
        for (int idade = 0; idade <= 18; idade++) {
            if (idade == 15) {
                System.out.println("Achei a idade 15!");
            }
            String msg = String.format("Idade = %d", idade);
            System.out.println(msg);
        }

        seuNome("Alisson");
    }
    public static void seuNome(String nome) {
        System.out.println("Olá, " + nome);
    }
}