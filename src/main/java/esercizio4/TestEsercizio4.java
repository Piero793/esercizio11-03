package esercizio4;

import java.util.Scanner;

import static esercizio4.Esercizio4.forEsempio;

public class TestEsercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero per avviare il decremento");
        int num = scanner.nextInt();
        System.out.println("il numero inserito é: " + forEsempio(num));
    }
}
