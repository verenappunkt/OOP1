package Beispiel5;

public class ArraysUndStrings {
    public static void main(String[] args) {
        System.out.println(taschenrechner(500000373,9, "durch"));
        System.out.println(vergleiche("DEF", "DEF"));

    }


    //a)
    public static double taschenrechner (double zahl1, double zahl2, String operation) {
        double result = 0;
        switch (operation) {
            case "plus":
                 result =  zahl1+zahl2;
                break;
            case "minus":
                 result = zahl1-zahl2;
                break;
            case "mal":
                 result = zahl1*zahl2;
                break;
            case "durch":
                 result = zahl1/zahl2;
                break;
        }
        return result;
    }

    //b)
    public static int vergleiche (String s1, String s2) {
        int ergebnis = 0;

         if (s1.contains(s2) && s2.contains(s1)) {
            ergebnis = 3;
        }

        else if (s2.contains(s1)) {
            ergebnis = 1;
        }
        else if (s1.contains(s2)) {
            ergebnis = 2;
        }

        else ergebnis = 4;

        return ergebnis;
    }

    //c)
   // public static void zeilensumme (int[][] array, int zeile) {


     //       }
}





