import java.util.Scanner;
import java.util.regex.Pattern;

public class TransformiraniString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo unesite riječ za obrnuti redoslijed riječi :");
        String unesenString = sc.nextLine();

        //Bjeline razdvajaju
        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(unesenString);
        String rezultat = "";

        //Iteriranje 
        for (int i = 0; i < temp.length; i++) {
            // Provjeri da li je zadnji element
            if (i == temp.length - 1)
                // Ako je zadnji element, spoji bez razmaka
                rezultat = temp[i] + rezultat;
            else
                 //Za sve druge elemente ,spoji bez razmaka
                rezultat = " " + temp[i] + rezultat;
        }
        System.out.println("Unešeni string je:\t " + unesenString);
        System.out.println("Rezultat je :\t" + rezultat);


    }
}
