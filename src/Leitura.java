import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDoLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("Seu filme favorito é: " + filme);
        System.out.println("Ano de Lançamento: " + anoDoLancamento);
        System.out.println("Sua avaliação: " + avaliacao);
    }
}