package Beispiel3;

public class Tierheim {
    public static void main(String[] args) {
        //a)
        double wieweit = wieweitspazieren(10,23,true);
        System.out.println(wieweit);

        //b.)
       int[] kuschelzeiten = new int[] {20,20,30};
        System.out.println(kuschelbedarf(kuschelzeiten));



    }

    //a)
    public static double wieweitspazieren(double gewicht, int letztesMal, boolean vertraegtSich) {
    double km = 0;
    if ((gewicht<1) && (!vertraegtSich)) {
        km = 2;
    } else if ((gewicht<1) && (vertraegtSich)) {
        km = 4;
    } else if ((gewicht>15)||(letztesMal>24)) {
        km = 8;
    } else
        km = 5;

        return km;
    }

    public static boolean kuschelbedarf (int[]kuschelzeit) {
        boolean kb = true;
        if ((kuschelzeit[0]+kuschelzeit[1]+kuschelzeit[2]) > 60) {
            kb = false;
        }
        else if ((kuschelzeit[0]<kuschelzeit[1]) && kuschelzeit[1] <kuschelzeit[2]) {
            kb = true;
        }
        else if (kuschelzeit[1] > 25) {
            kb = false;
        }
        return kb;
    }


}
