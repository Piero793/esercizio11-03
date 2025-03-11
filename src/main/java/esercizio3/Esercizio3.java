package esercizio3;


import java.util.Scanner;

public class Esercizio3 {
    public static String whileEsempio(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) != 'q') {
            System.out.print(s.charAt(i) + ",");
            i++;
        }
        if (i < s.length()) {
            return s.substring(i);
        } else {
            return "";
        }
    }

}
