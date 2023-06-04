package Metode;

import static Metode.Problema2.isLetter;

public class Metode {
    //    public static int x = 10;
    public static boolean isNumeric(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        } else return false;
    }

    public static boolean validatePassword(String pass) {
        if (pass.length() < 8)
            return false;
        int cifre = 0;
        int litere = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (isLetter(pass.charAt(i))) {
                litere++;
            } else if (isNumeric(pass.charAt(i))) {
                cifre++;
            }

        }
        if (cifre >= 2 && litere >= 1) return true;
        else return false;
    }

    public static void main(String[] args) {
        //scrie un program care valideaza o parola. parola trebuie sa aibe minim lungimea 8
        //sa fie formata din litere si cifre, dar sa aibe cel putin 2 cifre.

        System.out.println(validatePassword("sdfsdfdsv"));
        // System.out.println(getSum(3, 5));
//		int rezultat = 0;
//		int nr = 6;
//		if (isEven(nr)) {
//			rezultat=getCube(nr);
//		}else {
//			rezultat = getSquare(nr);
//		}
//		System.out.println(rezultat);

        //System.out.println(isEven(7));
        //if (isEven(8)) {System.out.println("e par");}

        //int s = returnSumOf3Number(4, 9, 8);
        //System.out.println(returnAverage(s,3));


//		int p = returnSum(2,3);
//
//		System.out.println(p);

        //calcSum(4,5);
        //writeText();
        //writeAnyText("dsfds");
        // }
        //calculati suma cifrelor unui nr
        //365 - 14
        //71 - 8

        //calculati factorialul unui nr
        //1! = 1
        //2!=2*1
        //3!=3*2*1
        //4!=4*3*2*1
//    public static int factorial(int c) {
//        int f =1;
//        for (int i=1; i<=c; i++) {
//            f=f*i;
//
//        }return f;
//    }

        // calculeaza suma tuturor nr de la a la b // 2 si 5 =>

//	public static int getSum (int x, int y) {
//		int suma = 0;
//		for (int i=x; i<=y; i++) {
//			suma = suma + i;
//		}return suma;
//	}

        //returneaza rezultatul: daca nr meu e par, returneaza cubul nr, daca e impar returneaza patratul
//	public static int getCube (int a) {
//		return a*a*a;
//	}
//
//	public static int getSquare (int a) {
//		return a*a;
//	}
//
//
//	//method to identify if a nr is odd or not
//	public static boolean isEven(int a) {
//		if (a%2==0) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//
//	// un student are 3 note. calculeaza media lui.
//	public static int returnSumOf3Number(int a, int b, int c) {
//		return a + b + c;
//	}
//
//	public static int returnAverage(int suma, int nr) {
//		return suma/nr;
//	}
//
//	public static int returnSum(int a, int b) {
//
//		int p = 0;
//		p = a+b+x;
//
//		return p;
//	}
//
//	public static void writeText() {
//		System.out.println("afara ninge");
//	}
//
//	public static void writeAnyText(String text) {
//		System.out.println(text);
//	}
//	public static void calcSum(int a, int b) {
//		System.out.println(a+b);
//	}


        //1.switch 2 variabile nume/nr zile
        //3 o metoda de produs si suma si calculez check

    }
}
