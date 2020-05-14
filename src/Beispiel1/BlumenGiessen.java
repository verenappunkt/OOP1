package Beispiel1;

public class BlumenGiessen {
    double feuchtigkeit;

    public static void main(String[] args) {
        System.out.println(mussgiessen(0.3));
    }

    //a.)
    public static int mussgiessen (double feuchtigkeit) {
        int sekunden;
        if (feuchtigkeit<0.2) {
            sekunden = 5;
        } else if (feuchtigkeit>0.2 || feuchtigkeit<0.4) {
            sekunden = 3;
        } else  if (feuchtigkeit>= 0.5 || feuchtigkeit<0.75) {
            sekunden = 1;
        } else sekunden = 0;
        return sekunden;
        }

}

