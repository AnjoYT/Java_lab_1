import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        int liczbaA =3,liczbaB=7;
        double liczbaX =320.55, liczbaY= 1403.42;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej)
        byte zmiennaByte = 22;
        short zmiennaShort =1231;
        int zmiennaInt = 10213;
        long zmiennaLong =12300012300L;
        float zmiennaFloat= 22.12f;
        double zmiennaDouble= 129000.1299;
        boolean zmiennaBool = true;
        char zmiennaChar = 't';
        String zmiennaString = "Hello world";
        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */
        System.out.println("liczby calkowite");
        System.out.println("dodawanie: " + (liczbaB+liczbaA));
        System.out.println("odejmowanie: " + (liczbaB-liczbaA));
        System.out.println("mnozenie: " + (liczbaB*liczbaA));
        System.out.println("dzielenie: " + (liczbaB/liczbaA));
        System.out.println("modulo: " + (liczbaB%liczbaA));
        System.out.println("liczby zmiennoprzecinkowe");
        System.out.println("dodawanie: " + (liczbaY+liczbaX));
        System.out.println("odejmowanie: " + (liczbaY-liczbaX));
        System.out.println("mnozenie: " + (liczbaY*liczbaX));
        System.out.println("dzielenie: " + (liczbaY/liczbaX));
        System.out.println("modulo: " + (liczbaY%liczbaX));


    }
}

