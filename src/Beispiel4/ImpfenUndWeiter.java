package Beispiel4;

public class ImpfenUndWeiter {
    //a)
    public static void main(String[] args) {
        System.out.println(naechsteZeckenImpfung(40, 2019,false));

    //b)
     int[] feldi = new int[] {1,2,3,7};
        feldUmsortieren(feldi);

     //c)


    }


    //a)
    public static int naechsteZeckenImpfung (int alter, int letztesImpfungsjahr, boolean ersteAuffrischung) {

        int naechsteImpfungin;
        if (alter>= 60 || ersteAuffrischung) {
            naechsteImpfungin = letztesImpfungsjahr + 3;
            return naechsteImpfungin;
        } else
            return naechsteImpfungin = letztesImpfungsjahr + 5;
    }

    //b)
    public static void  feldUmsortieren (int[] feld) {
        int [] hilfsfeld = new int[4];
         hilfsfeld[0] = feld[3];
         hilfsfeld[3] = feld[0];
         hilfsfeld[2] = feld[1];
         hilfsfeld[1] = feld[2];
         feld = hilfsfeld;
         for (int i : feld) {
             System.out.println(i);
         }
    }

    //c)



}
