public class ConversaoTemperatura {
    public static void main(String[] args) {
        // Temperatura em graus Celsius
        double temperaturaCelsius = 25.0; // Temperatura de teste em graus Celsius

        // Fórmula de conversão para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Exibir a temperatura convertida em Fahrenheit com casas decimais
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

        // Exibir a temperatura em Fahrenheit como valor inteiro (casting)
        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.printf("CONVERSÃO DE TEMPERATURAS:\n" +
                          "A temperatura de %.0fº graus Celsius em Fahrenheit convetida como tipo inteiro é: %d\n", temperaturaCelsius, temperaturaFahrenheitInteira);
    }
}