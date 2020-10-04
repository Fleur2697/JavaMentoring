package Task2;

public class KelvinConverter implements Converter{
    //convert Kelvin to Celsius
    @Override
    public float converter(float inDegrees) {
            float convertConstant = 273.15F;
        return inDegrees - convertConstant;
        }
    }

