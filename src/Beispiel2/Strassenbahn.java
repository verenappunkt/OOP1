package Beispiel2;

public class Strassenbahn {
    public static void main(String[] args) {
        System.out.println(wielangenoch(6));
    }

    public static int wielangenoch (int station) {
       int minuten = 0;
        switch (station) {
            case 1:
                minuten = 20;
                break;
            case 2:
                minuten = 16;
                break;
            case 3:
                minuten = 15;
                break;
            case 4:
                minuten = 10;
                break;
            case 5:
                minuten= 3;
                break;
            case 6:
                System.out.println("Achtung! Aussteigen!!");
        }
        return minuten;
    }

}
