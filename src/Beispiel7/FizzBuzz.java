package Beispiel7;

public class FizzBuzz {
    public static void main(String[] args) {

        int start = 1;
        do {
            fizzbuzz(start);
            start ++;
        } while (start<= 100);
    }

    public static void fizzbuzz (int zahl) {
        if (zahl%3 == 0 && zahl%5==0) {
            System.out.println("FizzBuzz");
        }
        else if (zahl%3 == 0 ) {
            System.out.println("Fizz");
        }
        else if (zahl%5==0) {
            System.out.println("Buzz");
        }
        else
            System.out.println(zahl);
    }
}
