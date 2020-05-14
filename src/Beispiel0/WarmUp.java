package Beispiel0;

public class WarmUp {

    public static void main(String[] args) {
   //a.b.)
    String wieLicht = licht(8);
        System.out.println(wieLicht);

    //b.b))
    String wieLicht2 = licht2(0);
        System.out.println(wieLicht2);

        //c.)
        String ahonnen = welcherPlatz(40);
        System.out.println(ahonnen);

    //d.)
    int ausgabe = tempo(2);
        System.out.println(ausgabe);

    }




    //a.a.)
    public static String licht(int schalter) {
        String result;
        if (schalter > 1) {
            result = "Licht an.";
        } else {
            result = "Licht aus.";
        }
        return result;
    }

    //b.)
    public static String licht2(int schalter) {
        String result;
        if (schalter == 1) {
            result = "Licht an";
        } else  {
            result = "Licht aus";
        }
     return result;
    }

    //c.)
    //>198.7 = 1
    //>197.1 = 2
    //>195 = 3
    // = 193.67 = 4
    // >=100 && weite <= 150 = 0

    public static String welcherPlatz (double weite) {
        String result = "bla";
        if (weite > 198.7) {
            result = "Erster";
        } else if (weite > 197.1) {
            result = "Zweiter";
        } else if (weite > 195) {
            result = "Dritter";
        } else if (weite == 193.67) {
            result = "Vierter";
        } else if (weite >= 100 && weite <= 150) {
            result = "ausgeschieden";
            //c.a.))
        } else if (weite > 20 && weite < 50) {
            result = "Achtung! Verletzt!";
        }
        return result;
    }

        //d.)
        public static int tempo (int gang ) {
            int kmh = 0;
         /*   if (gang == 1) {
                kmh = 10;
            }
            else if (gang == 2) {
                kmh = 20;
            }
            else if (gang == 3) {
                kmh = 30;
            }
            else if (gang == 4) {
                kmh = 40;
            }
            return kmh;

          */
         switch (gang) {
             case 1:
                 kmh = 10;
                 break;
             case 2:
                 kmh = 20;
                 break;
             case 3:
                 kmh = 30;
                 break;
             case 4:
                 kmh = 40;
                 break;
         }
            return kmh;
        }








}





