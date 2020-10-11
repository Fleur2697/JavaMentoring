package Task2;

import java.lang.Math;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

//Cоздайте класс, который описывает вектор (в трёхмерном пространстве).
//У него должны быть:
//- конструктор с параметрами в виде списка координат x, y, z
//- метод, вычисляющий длину вектора sqrt(x^2 + y^2 + z^2). Корень можно посчитать с помощью Math.sqrt
//- метод, вычисляющий скалярное произведение (x1*x2 + y1*y2 + z1*z2)
//- статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.

public class Vector {
    int x1, y1, z1;
    int x2, y2, z2;


    public Vector(int startCoordinate1, int startCoordinate2, int startCoordinate3, int endCoordinate1, int endCoordinate2, int endCoordinate3) {
        this.x1 = startCoordinate1;
        this.y1 = startCoordinate2;
        this.z1 = startCoordinate3;
        this.x2 = endCoordinate1;
        this.y2 = endCoordinate2;
        this.z2 = endCoordinate3;
    }

    public final int vectorLength() {
        return (int) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2) + Math.pow((z1 - z2), 2));
    }

    public final int ScalarMultip() {
        return (x1 * x2) + (y1 * y2) + (z1 * z2);
    }


    //- статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
    public static Vector[] randomArray(int n) {
        Vector[] resultArray = new Vector[n];
        Random randobj = new Random();
        for (int i = 0; i < n; i++) {
            int x1 = randobj.nextInt();
            int x2 = randobj.nextInt();
            int y1 = randobj.nextInt();
            int y2 = randobj.nextInt();
            int z1 = randobj.nextInt();
            int z2 = randobj.nextInt();
            Vector vectObj = new Vector(x1, x2, y1, y2, z1, z2);

            resultArray[i] = vectObj;
        }
        return resultArray;
    }

    @Override
    public String toString() {
        return "{x1=" + this.x1
                + ",x2=" + this.x2
                + ",y1=" + this.y1
                + ",y1=" + this.y1
                + ",z1=" + this.z1
                + ",z1=" + this.z1
                + "}";
    }
}
