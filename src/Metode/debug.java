package Metode;

public class debug {
    public static void main(String[] args) {
        //System.out.println(aria(-3));
        //age(7);
//        System.out.println(stringToInt("y"));
        System.out.println(impartire(2,0));
    }
    public static int getSum (int a, int b){
        int suma = 0;
        for (int i = a; i <b ; i++) {
            suma = suma + i;
            System.out.println("index:"+i+ " suma"+ suma);
        }
        return suma;
    }
    public static int sum (int a, int b){
        return a+b;
    }

    public static double aria (double radius){
        if (radius<0){
            throw new IllegalArgumentException("raza trebuie sa fie mai mica > 0");
        }
        return 3.14*radius*radius;
    }

    //vreau sa creez un cont dar am urm restrictii
    // varsta < 18 -> access denied
    // varsta < 0 -> invalid age value
    // varsta <= 18 -> access granted

    public static void age(int age){
        if (age< 0){
            throw new ArithmeticException("invalid age value");
        } else if (age<18) {
            throw new ArithmeticException("access denied");
        } else {
            System.out.println("access was granted");
        }
    }

    public static int stringToInt (String a){
        int rez = 0;
        try {
            rez = Integer.parseInt(a);
        }
        catch (NumberFormatException e){

        }
        finally {
            System.out.println("eu apar");
        }
        return rez;
    }

    public static int impartire(int a, int b){
        int rez = 0;
        try {
            rez = a / b;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        return rez;
    }
}
