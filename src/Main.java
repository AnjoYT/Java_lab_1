import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liczbaA =21,liczbaB=70;
        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */
        System.out.print("Prosze podac imie: ");
        String imie = scan.next();
        System.out.print("Prosze podac nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Prosze podac wiek: ");
        int wiek = scan.nextInt();
        System.out.print("Prosze podac nr indeksu: ");
        int indeks = scan.nextInt();
        System.out.printf("%s %s %d %d \n",imie,nazwisko,wiek,indeks);
        System.out.println(imie+" "+nazwisko+" "+wiek+" "+indeks);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */
        System.out.println("dodawanie: " + (indeks+wiek));
        System.out.println("odejmowanie: " + (indeks-wiek));
        System.out.println("mnozenie: " + (indeks*wiek));
        System.out.println("dzielenie: " + (indeks/wiek));
        System.out.println("modulo: " + (indeks%wiek));

    }
}
