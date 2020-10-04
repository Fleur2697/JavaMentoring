package Task2;

public class ConverterMain {
    public static void main(String[] args) {
        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        KelvinConverter kelvin = new KelvinConverter();
        System.out.println(fahrenheit.converter(15.4F));
        System.out.println(kelvin.converter(277F));
    }
}
