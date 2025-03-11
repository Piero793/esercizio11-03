package esercizio1;

public class Esercizio1 {
    public static boolean isPari(String s) {

        if (s.length() % 2 == 0) {
            System.out.println("numero di caratteri pari");
            return true;
        }else System.out.println("numero di caratteri dispari");
        return false;
    }

    public static boolean isBisestile(int anno) {
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            System.out.println("anno bisestile");
            return true;
        }else System.out.println("anno non bisestile");
        return false;
    }

   /* public static void main(String[] args) {
        isPari("buonasera");
        isBisestile(2025);

    }*/


}
