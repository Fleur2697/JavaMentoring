package Task2;

import java.lang.Math;
import java.util.Arrays;

public class VectorMain {

    public static void main(String[] args) {
        Vector vector = new Vector(22, 4, 2, 44, 12, 22);
        System.out.println(vector.vectorLength());
        System.out.println(vector.ScalarMultip());
        System.out.println(Arrays.toString(Vector.randomArray(3)));


    }
}
