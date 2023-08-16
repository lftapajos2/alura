public class ConversaoTemperatura {
    public static void main(String[] args) {
        // Temperatura em graus Celsius
        double temperaturaCelsius = 25.0; // tTemperatura de teste em graus Celsius

        // Fórmula de conversão para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Exibir a temperatura convertida em Fahrenheit com casas decimais
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
    }
}