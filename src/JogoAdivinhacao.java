import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // Termina o jogo
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }
        if (tentativas == 5) {
            System.out.println("Não foi destas vez. O Número gerado era: " + numeroAleatorio);
        }
    }
}