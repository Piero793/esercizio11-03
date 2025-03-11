package esercizio3;

import java.util.Scanner;

import static esercizio3.Esercizio3.whileEsempio;

public class TestEsercizio3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("inserisci una parola");
            String s = scanner.nextLine();
            System.out.println("la parola inserita è: " + whileEsempio(s));

    }
}
