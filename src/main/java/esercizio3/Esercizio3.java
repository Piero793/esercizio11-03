package esercizio3;

import java.util.Scanner;

public class Esercizio3 {
        public static String whileEsempio (String s){

            while (!s.equals("q")) {
                System.out.println(s.split(","));
                break;
            }
            return s;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una stringa");
        String s = scanner.nextLine();
        System.out.println("la stringa inserita è: " + whileEsempio(s));
    }
}
