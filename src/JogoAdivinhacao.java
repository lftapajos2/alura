import java.util.Random;
import java.util.Scanner;
public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        int tentativas = 5;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": Digite um número: ");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                break; // Encerra o jogo
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número gerado é maior.");
            } else {
                System.out.println("O número gerado é menor.");
            }

            if (i < tentativas) {
                System.out.println("Tente novamente.");
            } else {
                System.out.println("Você atingiu o limite de tentativas. O número era: " + numeroAleatorio);
            }
        }

    }
}