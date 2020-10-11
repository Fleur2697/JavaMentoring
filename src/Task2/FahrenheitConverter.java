package Task2;

public class FahrenheitConverter implements Converter {
//    Convert Fahrenheit to Celsius
    @Override
    public float converter(float inDegrees) {
        return (inDegrees -32F)/1.8F;
    }
}
