package Metode;

import java.util.Random;

import static java.lang.Math.random;

//6. Genereaza random un nr intreg, maxim pana la 100
public class Problema6 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(101));
    }
}
